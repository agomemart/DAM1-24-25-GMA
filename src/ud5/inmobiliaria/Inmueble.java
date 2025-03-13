package ud5.inmobiliaria;

import java.util.Comparator;

abstract class Inmueble implements Comparator {
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

    void mostrarInmueble(Inmueble[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i].detalle());
        }
    }

    public int ordenNatoralDireccion(Object o1, Object o2) {
        System.out.println("INMUEBLES ORDENADOS ALFABÉTICAMENTE:");
        Inmueble i1 = ((Inmueble) o1);
        Inmueble i2 = ((Inmueble) o2);
        return i1.direccion.compareToIgnoreCase(i2.direccion);
    }

    public int ordenM2Ascendente(Object o1, Object o2) {
        System.out.println("INMUEBLES ORDENADOS POR m2 (ascendente):");
        Inmueble i1 = ((Inmueble) o1);
        Inmueble i2 = ((Inmueble) o2);
        return 0;
    }

    void sortMetrosDesc(Inmueble[] t) {

    }

    void sortHabMetrosDesc(Inmueble[] t) {

    }

    void sortPrecioAlquilerAsc(Inmueble[] t) {

    }

    void sortPrecioVentaAsc(Inmueble[] t) {

    }
}
