package ud7.practicaexamen.inventario;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;



public class AppInventarioFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("inventario.fxml"));
        stage.setTitle("Inventario de Productos");
        stage.setScene(new Scene(root, 500, 500));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}