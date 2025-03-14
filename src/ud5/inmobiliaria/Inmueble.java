package ud5.inmobiliaria;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public abstract class Inmueble implements Comparable {
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

    static void mostrarInmueble(Inmueble[] t) {
        for (Inmueble i : t) {
            System.out.println(t);
        }
    }
    @Override
    public int compareTo(Object o) {
        return direccion.compareTo(((Inmueble) o).direccion);
    }

  //Metodos de ordenación
    static void sortMetrosDesc(Inmueble[] t) {
        Arrays.sort(t, new ComparaMetros().reversed());
    }

    static void sortHabMetrosDesc(Inmueble[] t) {
        Comparator comparaHab = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Inmueble i1 = (Inmueble)  o1;
                Inmueble i2 = (Inmueble)  o2;
                int res = i2.numHabitaciones - i1.numHabitaciones;
                if (res == 0) {
                    res = i2.m2 - i1.m2;
                }
                return res;
            }
        };
        Arrays.sort(t, comparaHab);
    }

    static void sortPrecioAlquilerAsc(Inmueble[] t) {
        Comparator comparaAlq = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Inmueble i1 = (Inmueble)  o1;
                Inmueble i2 = (Inmueble)  o2;
                return i1.numHabitaciones - i2.numHabitaciones;
            }
        };
        Arrays.sort(t, comparaAlq);
    }

    void sortPrecioVentaAsc(Inmueble[] t) {

    }
}
