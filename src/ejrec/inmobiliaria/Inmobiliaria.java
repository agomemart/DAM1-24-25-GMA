package ejrec.inmobiliaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Inmobiliaria {
    public static void main(String[] args) {
        // 1.1. Modelo de Clases
// Crea un piso en una 5a planta, de 100m2, 3 habitaciones y 2 baños en la dirección “Calle Curtidoira”. Establece los precios de alquiler y de Venta.
        Inmueble piso1 = new Piso("Calle Curtidoira", 100, 3, 2, 5);
        piso1.setPrecioAlquiler(500);
        piso1.setPrecioVenta(200000);
// Crea otros dos pisos
        Inmueble piso2 = new Piso("Praza Maior", 80, 2, 2, 3);
        piso2.setPrecioAlquiler(400);
        Inmueble piso3 = new Piso("Calle Rosalía de Castro", 140, 4, 2, 2);
        piso3.setPrecioVenta(250000);
// Crea una casa de 250m2 construídos, 3000m2 de terreno, 4 habitaciones y 3 baños en la dirección “Carretera de Marín”.
        Inmueble casa1 = new Casa("Carretera de Marín", 250, 4, 3, 3000);
        casa1.setPrecioAlquiler(800);
        casa1.setPrecioVenta(350000);
// Crea otra casa
        Inmueble casa2 = new Casa("Lapaman", 150, 3, 2, 1000);
        casa2.setPrecioVenta(400000);
// Imprimir Inmueble: Piso, Casa
        System.out.println(piso1);
        System.out.println(casa1);
        System.out.println("");
// Mostrar Detalle Inmueble: Piso, Casa
        System.out.println(piso1.detalle());
        System.out.println("");
        System.out.println(piso2.detalle());
        System.out.println("");
        System.out.println(casa2.detalle());

        ArrayList<Inmueble> inventario = new ArrayList<>();
        inventario.add(piso1);
        inventario.add(piso2);
        inventario.add(piso3);
        inventario.add(casa1);
        inventario.add(casa2);

        Collections.sort(inventario);  // Ordenación natural por dirección [1][4]

        System.out.println("\n--- Inmuebles ordenados por dirección ---");
        for(Inmueble i : inventario) {
            System.out.println(i);  // Usa toString() de Inmueble [2][5]
        }

        Comparator<Inmueble> comp = new Comparator<Inmueble>() {
            @Override
            public int compare(Inmueble o1, Inmueble o2) {
                if (o2.getHabitaciones() == o1.getHabitaciones()) {
                return Double.compare(o2.getMetros(), o1.getMetros());
                }
                return Integer.compare(o2.getHabitaciones(), o1.getHabitaciones());
            }
        };

        Collections.sort(inventario, comp);
        System.out.println("\n--- Inmuebles ordenados por habitaciones y metros ---");
        for(Inmueble i : inventario) {
            System.out.println(i);
        }

    }
}
