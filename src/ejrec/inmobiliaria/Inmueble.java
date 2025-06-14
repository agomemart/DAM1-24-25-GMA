package ejrec.inmobiliaria;

public abstract class Inmueble implements Comparable<Inmueble> {
    private String direccion;
    private double metros;
    private int habitaciones;
    private int banos;
    private int precioAlquiler;
    private int precioVenta;

    public Inmueble(String direccion, double metros, int habitaciones, int banos) {
        this.direccion = direccion;
        this.metros = metros;
        this.habitaciones = habitaciones;
        this.banos = banos;
    }

    public abstract String detalle();

    public String getDireccion() {
        return direccion;
    }

    public double getMetros() {
        return metros;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public int getBanos() {
        return banos;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Inmueble en " + direccion + " (" + metros +
        " m2, " + habitaciones + " hab)";
    }

    @Override
    public int compareTo(Inmueble o) {
        return this.direccion.compareToIgnoreCase(o.direccion);
    }
}
