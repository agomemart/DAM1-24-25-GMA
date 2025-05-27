package ud7.practicaexamen.notas;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.*;
import java.util.*;

public class NotasController {

    @FXML
    private TextArea resultadoArea;

    @FXML
    public void calcularPromedios() {
        resultadoArea.clear();
        List<String> resultados = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("notas.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("promedios.txt"))) {

            String linea;
            boolean vacio = true;

            while ((linea = reader.readLine()) != null) {
                vacio = false;
                try {
                    String[] partes = linea.split(",");
                    if (partes.length < 2) throw new IllegalArgumentException();

                    String nombre = partes[0].trim();
                    double suma = 0;
                    for (int i = 1; i < partes.length; i++)
                        suma += Double.parseDouble(partes[i].trim());

                    double promedio = suma / (partes.length - 1);
                    String resultado = nombre + ": " + String.format("%.1f", promedio);
                    resultados.add(resultado);
                } catch (Exception e) {
                    resultados.add("Línea inválida: " + linea);
                }
            }

            if (vacio) {
                resultadoArea.setText("El archivo está vacío.");
                return;
            }

            for (String r : resultados) {
                writer.write(r);
                writer.newLine();
                resultadoArea.appendText(r + "\n");
            }

        } catch (FileNotFoundException e) {
            resultadoArea.setText("Archivo notas.txt no encontrado.");
        } catch (IOException e) {
            resultadoArea.setText("Error al leer o escribir archivos.");
        }
    }
}