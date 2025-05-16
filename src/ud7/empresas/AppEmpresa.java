package ud7.empresas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppEmpresa extends Application {
    public static String path = "src/ud7/empresas/";
    static List<Empresa> empresas = new ArrayList<>();

    public static void main(String[] args) {
        empresas.add(new Empresa(1, "IES Chan do Monte", "http://ieschandomonte.edu.es/ies/"));

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Empresas");
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(AppEmpresa.class.getResource("Empresa.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static public void guardarFichero(String path) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(path))) {
            for (Empresa empresa : empresas) {
                String linea = empresa.getId() + ", " + empresa.getNombre() + ", " + empresa.getWeb();
                out.write(linea);
                out.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error de E/S");
        }
    }

    static public void cargarFichero(String path) {
        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            String linea = in.readLine();
            empresas.clear();
            while (linea != null) {
                String[] campos = linea.split(",");
                Empresa empresa = new Empresa(Integer.parseInt(campos[0]), campos[1], campos[2]);
                empresas.add(empresa);
                linea = in.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error de E/S");
        }
    }
}
