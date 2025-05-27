package ud7.practicaexamen.inventario;

import java.io.*;
import java.util.*;

public class AppInventario {

    private static final String ARCHIVO = "inventario.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Inventario ---");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Listar Todos los Productos");
            System.out.println("3. Buscar Producto por Código");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar salto de línea

            switch (opcion) {
                case 1 -> agregarProducto(scanner);
                case 2 -> listarProductos();
                case 3 -> buscarProducto(scanner);
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void agregarProducto(Scanner scanner) {
        try {
            List<Producto> productos = cargarProductos();

            System.out.print("Ingrese código del producto: ");
            int codigo = scanner.nextInt();
            scanner.nextLine(); // limpiar salto

            if (productoExiste(productos, codigo)) {
                System.out.println("Ya existe un producto con ese código.");
                return;
            }

            System.out.print("Ingrese nombre del producto: ");
            String nombre = scanner.nextLine().trim();
            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar en blanco.");
                return;
            }

            System.out.print("Ingrese cantidad: ");
            int cantidad = scanner.nextInt();

            System.out.print("Ingrese precio: ");
            double precio = scanner.nextDouble();

            Producto nuevo = new Producto(codigo, nombre, cantidad, precio);
            productos.add(nuevo);
            guardarProductos(productos);
            System.out.println("Producto agregado correctamente.");

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al guardar el producto: " + e.getMessage());
        }
    }

    private static void listarProductos() {
        try {
            List<Producto> productos = cargarProductos();
            if (productos.isEmpty()) {
                System.out.println("No hay productos en el inventario.");
                return;
            }

            productos.sort(Comparator.comparingInt(Producto::getCodigo));
            System.out.println("\n--- Lista de Productos ---");
            for (Producto p : productos) {
                System.out.println(p);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer productos: " + e.getMessage());
        }
    }

    private static void buscarProducto(Scanner scanner) {
        try {
            System.out.print("Ingrese código a buscar: ");
            int codigo = scanner.nextInt();

            List<Producto> productos = cargarProductos();
            for (Producto p : productos) {
                if (p.getCodigo() == codigo) {
                    System.out.println("Producto encontrado:\n" + p);
                    return;
                }
            }
            System.out.println("Producto no encontrado.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al buscar producto: " + e.getMessage());
        }
    }


    private static List<Producto> cargarProductos() throws IOException, ClassNotFoundException {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists() || archivo.length() == 0) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<Producto>) ois.readObject();
        }
    }

    private static void guardarProductos(List<Producto> productos) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(productos);
        }
    }

    private static boolean productoExiste(List<Producto> productos, int codigo) {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) return true;
        }
        return false;
    }
}