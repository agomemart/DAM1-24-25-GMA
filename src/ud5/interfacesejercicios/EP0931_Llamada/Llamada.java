package ud5.interfacesejercicios.EP0931_Llamada;

import ud5.interfacesejercicios.EP0928b_Jornada.Jornada;

import java.time.Duration;
import java.time.LocalDateTime;

public class Llamada implements Comparable {
    private final ZonaInterlocutor ZonaInterlocutor;
    private String telefono;
    private String numeroInterlocutor;
    private boolean saliente;
    private LocalDateTime inicioLlamada;
    private LocalDateTime finLlamada;
    public static final int tarifas[] = {10, 15, 20, 25, 30};

    enum ZonaInterlocutor {MISMALOCALIDAD, DISTINTALOCALIDAD, DISTINTOPAIS, DISTINTOCONTINENTE, AUSTRALIA}

    public Llamada(String telefono, String numeroInterlocutor, boolean saliente, LocalDateTime inicioLlamada, LocalDateTime finLlamada, ZonaInterlocutor ZonaInterlocutor) {
        this.telefono = telefono;
        this.numeroInterlocutor = numeroInterlocutor;
        this.saliente = saliente;
        this.inicioLlamada = inicioLlamada;
        this.finLlamada = finLlamada;
        this.ZonaInterlocutor = ZonaInterlocutor;
    }

    public int duracionLlamada() {
        Duration duracion = Duration.between(this.inicioLlamada, this.finLlamada);
        return (int) duracion.toMinutes();
    }
    public double costeLlamada() {
        if (saliente) {
            int tarifaZona = tarifas[ZonaInterlocutor.ordinal()];
            long duracionLlamada = duracionLlamada();
            return (duracionLlamada * tarifaZona) / 100.0;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Telefono cliente: " + telefono + ", Número Interlocutor: " + numeroInterlocutor + ", inicio llamada: " +
                 inicioLlamada + ", duracion: " + duracionLlamada() + " minutos, coste llamada:" + costeLlamada() + " euros";
    }

    @Override
    public int compareTo(Object o) {
        Llamada otra = (Llamada) o;
        int comparacionTelefono = this.telefono.compareTo(otra.telefono);
        if (comparacionTelefono != 0) return comparacionTelefono;
        return this.inicioLlamada.compareTo(otra.inicioLlamada);
    }
}
