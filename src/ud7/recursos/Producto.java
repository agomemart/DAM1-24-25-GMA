package ud7.recursos;

import java.io.Serializable;

public class Producto implements Serializable {
    private int codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(int codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " - Cantidad: " + cantidad + " - Precio: " + precio;
    }
}