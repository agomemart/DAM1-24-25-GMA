package ud5.interfacesejercicios.EP0931_Llamada;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // Crear algunas llamadas
        Llamada llamada1 = new Llamada("600123456", "912345678", true,
                LocalDateTime.of(2023, Month.MARCH, 20, 10, 0), LocalDateTime.of(2023, Month.MARCH, 20, 10, 30),
                Llamada.ZonaInterlocutor.DISTINTALOCALIDAD);

        Llamada llamada2 = new Llamada("600123456", "919876543", false,
                LocalDateTime.of(2023, Month.MARCH, 20, 11, 0), LocalDateTime.of(2023, Month.MARCH, 20, 11, 20),
                Llamada.ZonaInterlocutor.DISTINTOCONTINENTE);

        Llamada llamada3 = new Llamada("600987654", "912345678", true,
                LocalDateTime.of(2023, Month.MARCH, 20, 12, 0), LocalDateTime.of(2023, Month.MARCH, 20, 12, 45),
                Llamada.ZonaInterlocutor.DISTINTOPAIS);

        // Imprimir las llamadas
        System.out.println(llamada1);
        System.out.println(llamada2);
        System.out.println(llamada3);
    }
}