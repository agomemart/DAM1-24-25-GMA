package ud6.practicaex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparadorProducto implements Comparator<Producto> {
    @Override
    public int compare(Producto o1, Producto o2) {
        return Double.compare(o2.getPrecio(), o1.getPrecio());
    }
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 1500.0));
        productos.add(new Producto("Mouse", 25.0));
        productos.add(new Producto("Monitor", 300.0));

        productos.sort(new ComparadorProducto());
        System.out.println(productos);
    }
}
class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
