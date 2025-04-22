package ud6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Academico implements Comparable<Academico>{
    String nombre;
    int anhoIngreso;

    public Academico(String nombre, int anhoIngreso) {
        this.nombre = nombre;
        this.anhoIngreso = anhoIngreso;
    }

    @Override
    public String toString() {
        return nombre + " (" + anhoIngreso + ")";
    }

    @Override
    public int compareTo(Academico o) {
        return nombre.compareTo(o.nombre);
    }

    public static void main(String[] args) {
        Map<Character, Academico> academia = new TreeMap<>();
        String contenidoFichero = readFileToString("academicos.txt");

        System.out.println(contenidoFichero);
        String[] lineas = contenidoFichero.split("\\n");

        System.out.println(Arrays.toString(lineas));

        for (int i = 0; i < lineas.length; i++) {
            Character letra = lineas[i].charAt(6);
            String nombre = lineas[i].substring(7, lineas[i].length() - 6);
            int anho = Integer.parseInt(lineas[i].substring(lineas[i].length() - 5, lineas[i].length() - 1));
            System.out.println(letra + " - " + nombre + " ( " + anho + ")");
            nuevoAcademico(academia, new Academico(nombre, anho), letra);
        }

        System.out.println("Academicos sin letra por orden de nombre");
        List<Academico> lista = new ArrayList<>(academia.values());
        Collections.sort(lista);
        for (Academico a : lista) {
            System.out.println(a);
        }

        System.out.println("Academicos sin letra por año de ingreso y en cas de empate por orden de nombre");
        lista.sort(new Comparator<>() {
            @Override
            public int compare(Academico o1, Academico o2) {
                int res = o1.anhoIngreso - o2.anhoIngreso;
                if (res== 0) {
                    res = o1.nombre.compareTo(o2.nombre);
                }
                return res;
            }
        });
        for (Academico a : lista) {
            System.out.println(a);
        }

        System.out.println("Academicos con letra por orden de letra indicando nombre y fecha");
        Set<Character> letras = academia.keySet();

        for (Character letra : letras) {
            Academico a = academia.get(letra);
            System.out.println(letra + " - " + a);
        }
    }

    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
        if(Character.isLetter(letra)) {
            academia.put(letra, nuevo);
            return true;
        }
        return false;
    }

    public static String readFileToString(String filePath) {
        StringBuilder fileContent = new StringBuilder();
        try {
            FileReader reader = new FileReader(filePath);

            BufferedReader buffer = new BufferedReader(reader);

            String line;

            while((line = buffer.readLine()) != null) {

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return filePath;
    }


}
