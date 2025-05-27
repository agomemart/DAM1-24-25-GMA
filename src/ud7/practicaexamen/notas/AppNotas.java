package ud7.practicaexamen.notas;

import java.io.*;


public class AppNotas {

    public static void main(String[] args) {
        String archivoEntrada = "notas.txt";
        String archivoSalida = "promedios.txt";

        BufferedReader lector = null;
        BufferedWriter escritor = null;

        try {
            File inputFile = new File(archivoEntrada);
            if (!inputFile.exists()) {
                System.err.println("Error: El archivo '" + archivoEntrada + "' no existe.");
                return;
            }

            lector = new BufferedReader(new FileReader(archivoEntrada));
            escritor = new BufferedWriter(new FileWriter(archivoSalida));

            String linea;
            boolean archivoVacio = true;

            while ((linea = lector.readLine()) != null) {
                archivoVacio = false;
                try {
                    String[] partes = linea.split(",");
                    if (partes.length < 2) {
                        throw new IllegalArgumentException("Línea inválida: " + linea);
                    }

                    String nombre = partes[0].trim();
                    double suma = 0;
                    int cantidad = 0;

                    for (int i = 1; i < partes.length; i++) {
                        suma += Double.parseDouble(partes[i].trim());
                        cantidad++;
                    }

                    double promedio = suma / cantidad;
                    escritor.write(nombre + ": " + String.format("%.1f", promedio));
                    escritor.newLine();

                } catch (NumberFormatException e) {
                    System.err.println("Error: Formato de número inválido en la línea -> " + linea);
                } catch (IllegalArgumentException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }

            if (archivoVacio) {
                System.err.println("Error: El archivo está vacío.");
            } else {
                System.out.println("Archivo '" + archivoSalida + "' generado exitosamente.");
            }

        } catch (IOException e) {
            System.err.println("Error de lectura/escritura de archivo.");
            e.printStackTrace();
        } finally {
            try {
                if (lector != null) lector.close();
                if (escritor != null) escritor.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar los archivos.");
            }
        }
    }
}