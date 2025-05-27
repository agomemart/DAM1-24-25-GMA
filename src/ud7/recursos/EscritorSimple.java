package ud7.recursos;

import java.io.FileWriter;
import java.io.IOException;

public class EscritorSimple {
    public static void main(String[] args) {
        String rutaArchivo = "salida.txt";
        String contenido = "Hola, este es un ejemplo de escritura.\nNueva línea de texto.";

        try (FileWriter fw = new FileWriter(rutaArchivo)) {
            fw.write(contenido);
            System.out.println("Archivo escrito exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}