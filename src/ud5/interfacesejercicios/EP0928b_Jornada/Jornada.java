package ud5.interfacesejercicios.EP0928b_Jornada;

import java.time.LocalDateTime;

public class Jornada {
    String dni;
    LocalDateTime fechaEntrada;
    LocalDateTime fechaSalida;

    public Jornada(String dni, LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {
        this.dni = dni;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    int minutosJornada(LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {
        fechaSalida.compareTo(fechaEntrada);
        return 0;
    }

    @Override
    public String toString() {
        return dni + " " + fechaEntrada.toString() + " " + minutosJornada(fechaEntrada, fechaSalida);
    }
}
