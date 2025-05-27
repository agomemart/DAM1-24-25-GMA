package ud7.practicaexamen.inventario;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;
import java.util.*;

public class InventarioController {

    @FXML private TextField codigoField;
    @FXML private TextField nombreField;
    @FXML private TextField cantidadField;
    @FXML private TextField precioField;
    @FXML private TextField buscarField;
    @FXML private TextArea resultadoArea;

    private static final String ARCHIVO = "inventario.dat";

    @FXML
    private void agregarProducto() {
        try {
            int codigo = Integer.parseInt(codigoField.getText());
            String nombre = nombreField.getText().trim();
            int cantidad = Integer.parseInt(cantidadField.getText());
            double precio = Double.parseDouble(precioField.getText());

            if (nombre.isEmpty()) {
                mostrar("El nombre no puede estar vacío.");
                return;
            }

            List<Producto> productos = cargarProductos();
            for (Producto p : productos) {
                if (p.getCodigo() == codigo) {
                    mostrar("Ya existe un producto con ese código.");
                    return;
                }
            }

            productos.add(new Producto(codigo, nombre, cantidad, precio));
            guardarProductos(productos);
            mostrar("Producto agregado correctamente.");
            limpiarCampos();

        } catch (NumberFormatException e) {
            mostrar("Datos inválidos. Verifica los campos.");
        } catch (IOException | ClassNotFoundException e) {
            mostrar("Error al guardar el producto.");
        }
    }

    @FXML
    private void listarProductos() {
        try {
            List<Producto> productos = cargarProductos();
            productos.sort(Comparator.comparingInt(Producto::getCodigo));

            if (productos.isEmpty()) {
                mostrar("No hay productos registrados.");
                return;
            }

            StringBuilder sb = new StringBuilder();
            for (Producto p : productos) sb.append(p).append("\n");
            mostrar(sb.toString());

        } catch (IOException | ClassNotFoundException e) {
            mostrar("Error al leer el archivo.");
        }
    }

    @FXML
    private void buscarProducto() {
        try {
            int codigo = Integer.parseInt(buscarField.getText());
            List<Producto> productos = cargarProductos();

            for (Producto p : productos) {
                if (p.getCodigo() == codigo) {
                    mostrar("Producto encontrado:\n" + p);
                    return;
                }
            }

            mostrar("Producto no encontrado.");

        } catch (NumberFormatException e) {
            mostrar("Ingrese un código válido.");
        } catch (IOException | ClassNotFoundException e) {
            mostrar("Error al buscar producto.");
        }
    }

    private List<Producto> cargarProductos() throws IOException, ClassNotFoundException {
        File f = new File(ARCHIVO);
        if (!f.exists() || f.length() == 0) return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            return (List<Producto>) ois.readObject();
        }
    }

    private void guardarProductos(List<Producto> productos) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(productos);
        }
    }

    private void mostrar(String texto) {
        resultadoArea.setText(texto);
    }

    private void limpiarCampos() {
        codigoField.clear();
        nombreField.clear();
        cantidadField.clear();
        precioField.clear();
    }
}
