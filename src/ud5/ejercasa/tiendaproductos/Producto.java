package ud5.ejercasa.tiendaproductos;

public class Producto {
    private String nombre;
    private double precio;
    private CategoriaProducto categoriaProducto;

    public Producto(String nombre, double precio, CategoriaProducto categoriaProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoriaProducto = categoriaProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double aplicarDescuento(double porcentaje) {
        return precio - precio * (porcentaje / 100);
    }

    @Override
    public String toString() {
        return "Producto " + nombre + ", precio: " + precio + ", categoria: " + categoriaProducto;
    }

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }
}