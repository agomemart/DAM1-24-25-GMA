package ud7.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjemploScanner {
    static final String PATH = "src/ud7/ficheros/";

    public static void main(String[] args) {
        int suma = 0;
        try {
            BufferedReader in =  new BufferedReader(new FileReader(PATH + "enteros.txt"));
            Scanner sc = new Scanner(in);
            String linea =  in.readLine();
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                suma += num;
            }
            in.close();

            System.out.println("Suma = " + suma);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
