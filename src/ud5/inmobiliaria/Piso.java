package ud5.inmobiliaria;

public class Piso extends Inmueble{
    int planta;
    public Piso(String direccion, int m2, int numHabitaciones, int numBanhos, int planta) {
        super(direccion, m2, numHabitaciones, numBanhos);
        this.planta = planta;
    }

    String detalle() {
        if (precioAlquiler != 0) {
            return getClass() + " en " + direccion + ".\n" + m2 + " m2, " + numHabitaciones + " hab," + numBanhos + " baños," + planta + " planta.\n" + "Precio de alquiler: " + precioAlquiler;
        } else if (precioVenta != 0) {
            return getClass() + " en " + direccion + ".\n" + m2 + " m2, " + numHabitaciones + " hab," + numBanhos + " baños," + planta + " planta.\n" + "Precio de venta: " + precioVenta;
        } else if (precioAlquiler != 0 && precioVenta != 0) {
            return getClass() + " en " + direccion + ".\n" + m2 + " m2, " + numHabitaciones + " hab," + numBanhos + " baños," + planta + " planta.\n" + "Precio de alquiler: " + precioAlquiler + "\nPrecio de venta: " + precioVenta;
        }
        return getClass() + " en " + direccion + ".\n" + m2 + " m2, " + numHabitaciones + " hab," + numBanhos + " baños," + planta + " planta.";
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
