package ud7.practicaexamen.notas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class AppNotasFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("notas.fxml"));
        stage.setTitle("Notas - Promedios");
        stage.setScene(new Scene(root, 400, 400));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}