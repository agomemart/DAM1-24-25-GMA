package ud5.inmobiliaria;

public class Casa extends Inmueble{
    int terreno;
    public Casa(String direccion, int m2, int numHabitaciones, int numBanhos, int terreno) {
        super(direccion, m2, numHabitaciones, numBanhos);
        this.terreno = terreno;
    }

    String detalle() {
        if (precioAlquiler != 0) {
            return getClass() + " en " + direccion + ".\n" + m2 + " m2, " + numHabitaciones + " hab," + numBanhos + " baños, con terreno de " + terreno + " m2.\n" + "Precio de alquiler: " + precioAlquiler;
        } else if (precioVenta != 0) {
            return getClass() + " en " + direccion + ".\n" + m2 + " m2, " + numHabitaciones + " hab," + numBanhos + " baños, con terreno de " + terreno + " m2.\n" + "Precio de venta: " + precioVenta;
        } else if (precioAlquiler != 0 && precioVenta != 0) {
            return getClass() + " en " + direccion + ".\n" + m2 + " m2, " + numHabitaciones + " hab," + numBanhos + " baños, con terreno de " + terreno + " m2.\n" + "Precio de alquiler: " + precioAlquiler + "\nPrecio de venta: " + precioVenta;
        }
        return getClass() + " en " + direccion + "\n" + m2 + ", " + numHabitaciones + " hab," + numBanhos + " baños, con terreno de " + terreno + " m2.";
    }
}