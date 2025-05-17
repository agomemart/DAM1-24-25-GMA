package ud6.practicaex;

import java.util.*;

public class VentasProducto {
    public static void mostrarTop3Productos(List<Venta> ventas) {
        Map<String, Double> totalesPorProducto = new HashMap<>();

        // 1. Acumulamos el total vendido por producto
        for (Venta v : ventas) {
            double totalVenta = v.getPrecio() * v.getCantidad();
            totalesPorProducto.merge(v.getNombreProducto(), totalVenta, Double::sum);
        }

        // 2. Ordenamos los productos por total vendido (valor)
        List<Map.Entry<String, Double>> ordenados = new ArrayList<>(totalesPorProducto.entrySet());
        ordenados.sort((a, b) -> Double.compare(b.getValue(), a.getValue())); // orden descendente

        // 3. Imprimimos el top 3
        System.out.println("Top 3 productos más vendidos:");
        for (int i = 0; i < Math.min(3, ordenados.size()); i++) {
            Map.Entry<String, Double> entry = ordenados.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " - Total: $" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        List<Venta> ventas = List.of(
                new Venta("Teclado", 25.0, 4),
                new Venta("Monitor", 200.0, 2),
                new Venta("Ratón", 15.0, 10),
                new Venta("Teclado", 25.0, 6),
                new Venta("Monitor", 200.0, 1),
                new Venta("Auriculares", 50.0, 3)
        );

        mostrarTop3Productos(ventas);
    }

    static class Venta {
        private String nombreProducto;
        private double precio;
        private int cantidad;

        public Venta(String nombreProducto, double precio, int cantidad) {
            this.nombreProducto = nombreProducto;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        public String getNombreProducto() {
            return nombreProducto;
        }

        public double getPrecio() {
            return precio;
        }

        public int getCantidad() {
            return cantidad;
        }

        @Override
        public String toString() {
            return "Venta{" +
                    "nombreProducto='" + nombreProducto + '\'' +
                    ", precio=" + precio +
                    ", cantidad=" + cantidad +
                    '}';
        }
    }
}
