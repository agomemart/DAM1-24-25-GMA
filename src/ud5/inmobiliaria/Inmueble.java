package ud5.inmobiliaria;

abstract class Inmueble {
    String direccion;
    int m2;
    int numHabitaciones;
    int numBanhos;
    int precioAlquiler;
    int precioVenta;

    public Inmueble(String direccion, int m2, int numHabitaciones, int numBanhos) {
        this.direccion = direccion;
        this.m2 = m2;
        this.numHabitaciones = numHabitaciones;
        this.numBanhos = numBanhos;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    String detalle() {
        return getClass() + " en " + direccion + " (" + m2 + " m2, " + numHabitaciones + "hab)";
    }
}
