package ud5.interfacesejercicios.EP0928b_Jornada;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear algunas jornadas de ejemplo usando LocalDateTime para entrada y salida
        Jornada jornada1 = new Jornada("12345678A", LocalDateTime.of(2023, Month.MARCH, 20, 9, 0), LocalDateTime.of(2023, Month.MARCH, 20, 17, 30));
        Jornada jornada2 = new Jornada("12345678A", LocalDateTime.of(2023, Month.MARCH, 21, 9, 15), LocalDateTime.of(2023, Month.MARCH, 21, 17, 45));
        Jornada jornada3 = new Jornada("87654321B", LocalDateTime.of(2023, Month.MARCH, 20, 8, 30), LocalDateTime.of(2023, Month.MARCH, 20, 17, 0));

        // Crear una lista de jornadas
        List lista = new ArrayList();
        lista.add(jornada1);
        lista.add(jornada2);
        lista.add(jornada3);

        // Imprimir las jornadas antes de ordenar
        System.out.println("Jornadas antes de ordenar:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // Ordenar las jornadas
        Collections.sort(lista);

        // Imprimir las jornadas después de ordenar
        System.out.println("\nJornadas ordenadas:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}