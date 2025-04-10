package ud6;

import java.util.Objects;

public class Producto {
        String codigo;
        String nombre;

        public Producto(String codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return codigo + "-" + nombre;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Producto producto)) return false;
            return Objects.equals(codigo, producto.codigo) && Objects.equals(nombre, producto.nombre);
        }
}
