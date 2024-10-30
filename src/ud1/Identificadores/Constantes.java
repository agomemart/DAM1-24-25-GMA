package ud1.Identificadores;

import java.time.*;

public class Constantes {
    public static void main(String[] args) {
        final int NUMERO_ALUMNOS = 32;
        final int NUMERO_TOTAL_SESIONES = 150;
        final int NUMERO_SESIONES_SEMANALES = 9;
        final int NUMERO_MESES_AÑO = 12;

        System.out.println("Numero alumnos matriculados en programación: " + NUMERO_ALUMNOS);
        System.out.println("Numero total sesiones programación: " + NUMERO_TOTAL_SESIONES);
        System.out.println("Numero sesiones semanales programación: "
                + NUMERO_SESIONES_SEMANALES);
        System.out.println("Numero meses del año: " + NUMERO_MESES_AÑO);
        System.out.println(Math.random());
        double resultado = Math.pow(5, 3);
        System.out.println(resultado);

        System.out.println("Hoy es el día " + LocalDate.now().getYear());
        System.out.println("La hora actual es " + LocalTime.now());

        LocalDateTime ahora;
        ahora = LocalDateTime.now();
        System.out.println("Momento presente = " + ahora);

        int dia = ahora.getDayOfMonth();
        int mes = ahora.getMonthValue();
        int anho = ahora.getYear();
        int hora = ahora.getHour();
        int minutos = ahora.getMinute();
        int segundos = ahora.getSecond();

        System.out.println("Hoy es día " + dia + " del mes número " + mes + " de " + anho);
        System.out.println("Ahora son las " + hora + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
}
