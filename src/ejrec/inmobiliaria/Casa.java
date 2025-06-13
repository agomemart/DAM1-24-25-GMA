package ejrec.inmobiliaria;

public class Casa extends Inmueble{
    private double terreno;

    public Casa(String direccion, double metros, int habitaciones, int banos, double terreno) {
        super(direccion, metros, habitaciones, banos);
        this.terreno = terreno;
    }

    public double getTerreno() {
        return terreno;
    }

    @Override
    public String detalle() {
        String cadena = "";
        cadena = "Casa en " + getDireccion() + ". " + getMetros() + " m2, "
                + getHabitaciones() + " hab, " + getBanos() + " baños, con terreno de " + getTerreno() +
                " m2.";
        if (getPrecioAlquiler() > 0) {
            cadena = cadena + " Precio de alquiler: " + getPrecioAlquiler();
        }
        if (getPrecioVenta() > 0) {
            cadena = cadena + " Precio de venta: " + getPrecioVenta();
        }
        return cadena;
    }
}
