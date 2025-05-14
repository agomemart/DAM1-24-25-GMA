package ud7.empresas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class EmpresaController implements Initializable {

    @FXML
    private ListView<?> lstEmpresas;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtWeb;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*lstEmpresas.getItems().addAll(AppEmpresa.empresas);
        lstEmpresas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            System.out.println(newSelection);
            txtId.setText(String.valueOf(newSelection.getId()));
            txtId.setText(newSelection.getNombre());
            txtId.setText(newSelection.getWeb());
        });*/
    }

    @FXML
    void actualizar(ActionEvent event) {
        int id = Integer.parseInt(txtId.getText());
        int indice = AppEmpresa.empresas.indexOf(new Empresa(id));
        if (indice != -1) {
            Empresa e = AppEmpresa.empresas.get(indice);
            e.setNombre(txtNombre.getText());
            e.setWeb(txtWeb.getText());

            lstEmpresas.getItems().clear();
            //lstEmpresas.getItems().addAll(AppEmpresa.empresas);
            System.out.println("Elemento actualizado");
        }
    }

    @FXML
    void agregar(ActionEvent event) {
        Empresa empresa = new Empresa (Integer.parseInt(txtId.getText()), txtNombre.getText(), txtWeb.getText());

        if (!AppEmpresa.empresas.contains(empresa)) {
            AppEmpresa.empresas.add(empresa);
            //lstEmpresas.getItems().add(empresa);
        }

    }

    @FXML
    void borrar(ActionEvent event) {
        int id = Integer.parseInt(txtId.getText());
        AppEmpresa.empresas.remove(new Empresa(id));
        lstEmpresas.getItems().remove(new Empresa(id));
    }

    @FXML
    void obtenerItem(MouseEvent event) {

    }


}
