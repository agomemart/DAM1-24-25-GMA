package ejrec.editortexto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Controller {

    @FXML
    private TextArea areaTexto;

    private File archivoActual;

    @FXML
    private Button botonAbrir;

    @FXML
    private Button botonGuardar;

    @FXML
    private Button botonGuardarComo;

    @FXML
    void abrirArchivo(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Abrir archivo de texto");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Archivos de texto", "*.txt"));
        File archivo = fileChooser.showOpenDialog(getVentana());

        if (archivo != null) {
            try {
                String contenido = Files.readString(archivo.toPath());
                areaTexto.setText(contenido);
                archivoActual = archivo;
            } catch (IOException e) {
                mostrarError("No se pudo abrir el archivo.");
            }
        }
    }

    @FXML
    void guardar(ActionEvent event) {
        if (archivoActual != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoActual))) {
                writer.write(areaTexto.getText());
            } catch (IOException e) {
                mostrarError("No se pudo guardar el archivo.");
            }
        } else {
            guardarComo(event);
        }
    }

    @FXML
    void guardarComo(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Guardar archivo como...");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Archivos de texto", "*.txt"));
        File archivo = fileChooser.showSaveDialog(getVentana());

        if (archivo != null) {
            archivoActual = archivo;
            guardar(event);
        }
    }

    private void mostrarError(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Error");
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    private Stage getVentana() {
        return (Stage) areaTexto.getScene().getWindow();
    }

}

