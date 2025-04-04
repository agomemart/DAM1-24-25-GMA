package ud6;

public class Producto {
        String codigo;
        String nombre;

        public Producto(String codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Producto{" +
                    "codigo='" + codigo + '\'' +
                    ", nombre='" + nombre + '\'' +
                    '}';
        }
}
