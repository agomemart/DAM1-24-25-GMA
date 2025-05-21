package contornos.u5;

import java.util.Objects;

public class Proveedor {
    private int id;
    private String nombre;
    private String direccion;

    public Proveedor(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Proveedor proveedor)) return false;
        return id == proveedor.id && Objects.equals(nombre, proveedor.nombre) && Objects.equals(direccion, proveedor.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, direccion);
    }
}
