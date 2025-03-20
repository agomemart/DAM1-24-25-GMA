package ud5.interfacesejercicios.EP0928b_Jornada;

import java.time.Duration;
import java.time.LocalDateTime;

public class Jornada implements Comparable {
    String dni;
    LocalDateTime fechaEntrada;
    LocalDateTime fechaSalida;

    public Jornada(String dni, LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {
        this.dni = dni;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public long minutosJornada() {
        Duration duracion = Duration.between(fechaEntrada, fechaSalida);
        return duracion.toMinutes();
    }

    @Override
    public String toString() {
        return dni + " " + fechaEntrada.toString() + " " + minutosJornada();
    }


    @Override
    public int compareTo(Object o) {
        Jornada otra = (Jornada) o;
        int comparacionDni = this.dni.compareTo(otra.dni);
        if (comparacionDni != 0) return comparacionDni;
        return this.fechaEntrada.compareTo(otra.fechaEntrada);
    }
}
