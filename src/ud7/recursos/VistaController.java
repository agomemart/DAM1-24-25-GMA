package ud7.recursos;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class VistaController {
    @FXML
    private void onBotonClic() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("¡Botón pulsado!");
        alert.showAndWait();
    }
}