package ud7.recursos;

import java.io.*;

public class LectorTexto {
    public static void main(String[] args) {
        String rutaArchivo = "notas.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("Línea: " + linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}