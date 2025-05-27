package ud7.practicaexamen;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class AppNotas {
    static final String PATH = "src/ud7/practicaexamen/";
    public static void main(String[] args) {
        try {
            FileReader fichero =  new FileReader(PATH + "notas.txt");
            int ch =  fichero.read();
            String nombres[] = new String[0];
            int notas[] = new int[0];
            int meida[] = new int[0];
            int contador = 0;
            while (ch != -1) {
                while (ch != ',') {
                    nombres[contador] = nombres[contador] + ch;
                    contador++;
                }
                if (ch == ',') {
                    notas[contador] = notas[contador] + ch;
                    meida[contador] = meida[contador] + notas[contador];
                }
            }
            FileWriter ficheroSalida = new FileWriter(PATH + "promedios.txt");

            fichero.close();
            ficheroSalida.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
