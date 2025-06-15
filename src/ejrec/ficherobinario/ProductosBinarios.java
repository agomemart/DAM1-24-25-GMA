package ejrec.ficherobinario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductosBinarios {
    private static final String ARCHIVO = "productos.dat";

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Mouse", 19.99));
        productos.add(new Producto(2, "Teclado", 34.50));
        productos.add(new Producto(3, "Monitor", 120.0));

        escribirProductos(productos);
        leerProductos();
    }

    public static void escribirProductos(List<Producto> productos) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(ARCHIVO))) {
            for (Producto p : productos) {
                out.writeInt(p.id);
                out.writeUTF(p.nombre);
                out.writeDouble(p.precio);
            }
            System.out.println("Productos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar productos: " + e.getMessage());
        }
    }

    public static void leerProductos() {
        try (DataInputStream in = new DataInputStream(new FileInputStream(ARCHIVO))) {
            System.out.println("Leyendo productos desde el archivo:");
            while (true) {
                int id = in.readInt();
                String nombre = in.readUTF();
                double precio = in.readDouble();
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio);
            }
        } catch (EOFException e) {
            System.out.println("Fin del archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer productos: " + e.getMessage());
        }
    }
}
