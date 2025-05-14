package ud7.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login");
        Scene scene = new Scene(FXMLLoader.load(Login.class.getResource("Login.fxml")));
    }
}
