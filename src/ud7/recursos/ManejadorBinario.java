package ud7.recursos;

import java.io.*;
import java.util.ArrayList;

public class ManejadorBinario {
    private static final String ARCHIVO = "inventario.dat";

    public static void escribirProducto(Producto p) {
        ArrayList<Producto> lista = leerProductos();
        lista.add(p);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Producto> leerProductos() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Producto>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error al leer: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}