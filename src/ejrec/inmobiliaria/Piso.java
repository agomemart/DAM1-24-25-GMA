package ejrec.inmobiliaria;

public class Piso extends Inmueble{
    private int planta;

    public Piso(String direccion, double metros, int habitaciones, int banos, int planta) {
        super(direccion, metros, habitaciones, banos);
        this.planta = planta;
    }

    public int getPlanta() {
        return planta;
    }

    @Override
    public String detalle() {
        String cadena = "";
        cadena = "Piso en " + getDireccion() + ". " + getMetros() + " m2, "
                + getHabitaciones() + " hab, " + getBanos() + " baños, " + getPlanta() +
                " planta.";
        if (getPrecioAlquiler() > 0) {
            cadena = cadena + " Precio de alquiler: " + getPrecioAlquiler();
        }
        if (getPrecioVenta() > 0) {
            cadena = cadena + " Precio de venta: " + getPrecioVenta();
        }
        return cadena;
    }
}
