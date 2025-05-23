package ud7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Mapa extends Application {

    String[] mapa = {
            " Z     ",
            " *     ",
            " *   * ",
            "       ",
            " A     "
    };

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        int fila= 0;
        int columna = 0;
        for (int i = 0; i < mapa.length; i++) {
            if (mapa[i].indexOf('A') != -1) {
                fila = i;
                columna = mapa[i].indexOf('A');
            }
        }

        GridPane gridPane = new GridPane();
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length(); j++) {
                Label lbl = new Label(String.valueOf(mapa[i].charAt(j)));
                lbl.setPrefSize(50, 50);
                lbl.setAlignment(Pos.CENTER);
                String css = "-fx-border-width: 1 1 1 1; -fx-border-color: black black black black;";
                switch (String.valueOf(mapa[i].charAt(j))) {
                    case "*": css += "-fx-background-color: red;"; break;
                    case "A": css += "-fx-background-color: green;"; break;
                    case "Z": css += "-fx-background-color: yellow;"; break;
                }
                lbl.setStyle("-fx-background-color: #2196F3;");
                lbl.setStyle(css);

                gridPane.add(lbl, j, i);
            }
        }

        primaryStage.setTitle("Mapa");
        primaryStage.setResizable(false);
        Scene scene = new Scene(gridPane);
        scene.setOnKeyTyped(e -> {
            System.out.println(e.getCode().toString() + " - " + e.getCharacter());
            switch (e.getCharacter()) {
                case "a" :

                    break;
                case "w" :

                    break;
                case "s" :

                    break;
                case "d" :

                    break;
            }

        });
        primaryStage.setScene(new Scene(gridPane));
        primaryStage.show();
    }
}
