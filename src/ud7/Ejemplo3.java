package ud7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo3 extends Application {
    TextField txtNum1 = new TextField("Escribe un número...");
    TextField txtNum2 = new TextField("Otro número...");
    Button btnSumar = new Button("Sumar");
    Label lblResultado = new Label();

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        txtNum1.setOnKeyTyped(e -> sumar());
        txtNum2.setOnKeyTyped(e -> sumar());

        btnSumar.setOnAction(e -> sumar());

        VBox vBox = new VBox(txtNum1, txtNum2, btnSumar, lblResultado);

        Scene scene = new Scene(vBox, 300,200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculadora");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    private void sumar() {
        int resultado;
        int n1 = 0, n2 = 0;
        try {
            n1 = Integer.parseInt(txtNum1.getText());
            n2 = Integer.parseInt(txtNum2.getText());
            resultado = n1 + n2;
            lblResultado.setText(String.valueOf(resultado));
        } catch (Exception ex){
            lblResultado.setText("ERROR: ALgun  operando no es un número");
        }
    }
}
