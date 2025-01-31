package ud4.ejercicios;

import java.util.Arrays;

import static java.lang.Character.isLetter;

public class Matriculas {
    static boolean esLetraValida(char ch) {
        ch = Character.toUpperCase(ch);
        return "BCDFGHJKLMNPRSTVWXYZ".indexOf(ch) != -1;
    }

    static boolean esMatriculaValida(String matricula) {
        final int LONG_MATRICULA = 7;
        if (matricula == null || matricula.length() != LONG_MATRICULA) {
            return false;
        }
        for (int i = 0; i < matricula.length(); i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }
        for (int i = 5; i < matricula.charAt(i); i++) {
            if (!esLetraValida(matricula.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static String siguienteMatricula(String matricula) {
        boolean meLlevoUno = false;
        Integer nuevoNum = Integer.valueOf(matricula.substring(0, 4)) + 1;
        if (nuevoNum == 10000) {
            nuevoNum = 0000;
            meLlevoUno = true;
        }
        String numeros = String.format("%04d", nuevoNum);

        char[] letras = matricula.substring(4, 7).toCharArray();

        for (int i = 2; i >= 0 ; i--) {
            if (meLlevoUno) {
                String letrasValidas = "BCDFGHJKLMNPRSTVWXYZ";
                //incrementarLetra
                if (letras[i] == 'Z') {
                    letras[i] = 'B';
                } else {
                    letras[i] = letrasValidas.charAt(letrasValidas.indexOf(letras[i]) + 1);
                    meLlevoUno = false;
                }
            }
        }
            return numeros + String.valueOf(letras);
        }

    static int comparaMatriculas(String m1, String m2) {
        m1 = m1.toUpperCase();
        m2 = m2.toUpperCase();
        if (m1.substring(4, 7).compareTo(m2.substring(4, 7)) < 0){
            //m1 es mas antiguo
            return -1;
        } else if (m1.substring(4, 7).compareTo(m2.substring(4, 7)) > 0){
            //m2 es mas antigua
            return 1;
        } else {
            //letras iguales -> desempatamos con los números
            if (m1.substring(0, 4).compareTo(m2.substring(0, 4)) < 0) {
                return -1;
            } else if (m1.substring(0, 4).compareTo(m2.substring(0, 4)) > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        String matricula1 = "1234BBB";
        String matricula2 = "BBB1234";
        String matricula3 = "2345CCC";

        System.out.println("Matricula1:" + esMatriculaValida(matricula1));
        System.out.println("Matricula2:" + esMatriculaValida(matricula2));

        System.out.println("Siguiente matricula1: " + siguienteMatricula(matricula1));
        System.out.println("Siguiente matricula3: " + siguienteMatricula(matricula3));

        comparaMatriculas(matricula1, matricula2);
        System.out.println("Comparar matriculas: " + comparaMatriculas(matricula3, matricula1));
    }


}
