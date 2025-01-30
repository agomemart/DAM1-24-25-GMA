package ud4.ejercicios;

import java.util.Arrays;

import static java.lang.Character.isLetter;

public class Matriculas {
    static boolean esLetraValida(char ch) {
        return isLetter(ch);
    }

    static boolean esMatriculaValida(String matricula) {
        final int LONG_MATRICULA = 7;
        if (matricula.length() != LONG_MATRICULA) {
            return false;
        }
        char[] t = new char[LONG_MATRICULA];
        for (int i = 0; i < matricula.length(); i++) {
            t[i] = matricula.charAt(i);
        }
        if (Character.isDigit(t[0]) && Character.isDigit(t[1]) && Character.isDigit(t[2]) && Character.isDigit(t[3])) {
            return isLetter(t[4]) && isLetter(t[5]) && isLetter(t[6]);
        } else {
            return false;
        }
    }

    static String siguienteMatricula(String matricula) {
        final int LONG_MATRICULA = 7;
        char[] t = new char[LONG_MATRICULA];
        if (esMatriculaValida(matricula)) {
            for (int i = 0; i < matricula.length(); i++) {
                t[i] = matricula.charAt(i);
            }
            if (t[3] == 9) {
                t[2]++;
                if (t[2] == 9) {
                    t[1]++;
                    if (t[1] == 9) {
                        t[0]++;
                        if (t[0] == 9) {
                            t[6]++;
                            if (t[6] == 'z') {
                                t[5]++;
                                if (t[5] == 'z') {
                                    t[4]++;
                                } else {
                                    t[5]++;
                                }
                            } else {
                                t[6]++;
                            }
                        } else {
                            t[1]++;
                        }
                    } else {
                        t[2]++;
                    }
                } else {
                    t[3]++;
                }
            }
        }
            return Arrays.toString(t);
        }

    static int comparaMatriculas(String m1, String m2) {
        int coincidencias = 0;
        int repeticiones = Math.min(m1.length(), m2.length());
        for (int i = 0; i < repeticiones; i++) {
            if (m1.charAt(i) == m2.charAt(i)) {
                coincidencias++;
            }
        }
        return coincidencias;
    }

    public static void main(String[] args) {
        String matricula1 = "1234BBB";
        String matricula2 = "BBB1234";
        String matricula3 = "2345CCC";

        System.out.println("Matricula1:" + esMatriculaValida(matricula1));
        System.out.println("Matricula2:" + esMatriculaValida(matricula2));

        System.out.println("Siguiente matricula1: " + siguienteMatricula(matricula1));
        System.out.println("Siguiente matricula1: " + siguienteMatricula(matricula2));

        comparaMatriculas(matricula1, matricula2);
        System.out.println("Comparar matriculas: " + comparaMatriculas(matricula3, matricula1));
    }


}
