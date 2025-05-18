package ud6.practicaex.inventarioproductos;

import java.util.Set;

public class Producto {
    private String nombre;
    private double precio;
    private Set<String> categorias;

    public Producto(String nombre, double precio, Set<String> categorias) {
        this.nombre = nombre;
        this.precio = precio;
        this.categorias = categorias;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Set<String> getCategorias() {
        return categorias;
    }
}
