package ud7.ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFicherosTexto {

    static final String PATH = "src/ud7/ficheros/";

    public static void main(String[] args) {
        try {
            FileReader fichero =  new FileReader(PATH + "texto.txt");
            int ch =  fichero.read();
            while (ch != - 1) {
                System.out.println(ch);
            }
            fichero.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
