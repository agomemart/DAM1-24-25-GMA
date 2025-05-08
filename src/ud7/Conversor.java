package ud7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Conversor extends Application {
    TextField txtNum1 = new TextField("Escribe la cantidad a convertir");
    TextField txtOpcConv = new TextField("1 $ o 2 €");
    Button btnConvertir = new Button("Convertir");
    Label lblResultado = new Label();

    @Override
    public void start(Stage primaryStage) throws Exception {
        btnConvertir.setOnAction(e -> {
            if (Integer.parseInt(txtOpcConv.getText()) == 1) {
                convertirADolares();
            } else if (Integer.parseInt(txtOpcConv.getText()) == 2) {
                convertirAEuros();
            } else {
                lblResultado.setText("ERROR. Datos no válidos");
            }
        });

        VBox vBox = new VBox(txtNum1, txtOpcConv, btnConvertir, lblResultado);

        Scene scene = new Scene(vBox, 300,200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Euros < > Dólares");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    private void convertirADolares() {
        double resultado;
        double euros = Double.parseDouble(txtNum1.getText());
        resultado = euros * 1.13;
        lblResultado.setText("Resultado: " + String.valueOf(resultado) + "$");
    }

    private void convertirAEuros() {
        double resultado;
        double dolares = Double.parseDouble(txtNum1.getText());
        resultado = dolares / 1.13;
        lblResultado.setText("Resultado: " + String.valueOf(resultado) + "€");
    }
}
