package ud7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EjemploEentos extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button();
        btn.setText("Button");
        Button btn2 = new Button();
        btn2.setText("Button2");
        btn.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Button Event Handler"));
        btn.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Button Event Filter"));

        VBox root = new VBox();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        root.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> System.out.println("VBox Event Filter"));
        root.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("VBox Event Handler"));

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX Manejo de Eventos");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
