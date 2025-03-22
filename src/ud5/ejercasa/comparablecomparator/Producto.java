package ud5.ejercasa.comparablecomparator;

public class Producto implements Comparable{
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Producto) {
            Producto producto = (Producto) o;
            return Double.compare(this.precio, producto.precio);
        } else {
            throw new ClassCastException("El objeto no es un Producto");
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
