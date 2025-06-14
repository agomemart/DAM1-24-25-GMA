package ejrec.torneovideojuegos;

import java.util.Date;
import java.util.Objects;

public class Torneo {
    private String nombreDelJuego;
    private Date fecha;
    private String nombreTorneo;

    public Torneo(String nombreDelJuego, Date fecha, String nombreTorneo) {
        this.nombreDelJuego = nombreDelJuego;
        this.fecha = fecha;
        this.nombreTorneo = nombreTorneo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Torneo torneo)) return false;
        return Objects.equals(nombreTorneo, torneo.nombreTorneo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreTorneo);
    }

    @Override
    public String toString() {
        return nombreDelJuego + " - " + " - " + fecha + " - " + nombreTorneo;
    }
}
