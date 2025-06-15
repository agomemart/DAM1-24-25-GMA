package ejrec.gestortorneos;

import java.time.LocalDate;

public class Partido {
    private Equipo local;
    private Equipo visitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;

    public Partido(Equipo local, Equipo visitante, int puntosLocal, int puntosVisitante, LocalDate fecha) {
        this.local = local;
        this.visitante = visitante;
        this.puntosLocal = puntosLocal;
        this.puntosVisitante = puntosVisitante;
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public int getPuntosLocal() {
        return puntosLocal;
    }

    public int getPuntosVisitante() {
        return puntosVisitante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return fecha + ": " + local.getNombre() + " " + puntosLocal + " - " + puntosVisitante + " " + visitante.getNombre();
    }
}
