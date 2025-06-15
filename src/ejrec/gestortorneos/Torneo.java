package ejrec.gestortorneos;

import java.util.*;

public class Torneo {
    private String nombre;
    private String deporte;
    private Set<Equipo> equipos;
    private List<Partido> partidos;

    public Torneo(String nombre, String deporte) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.equipos = new HashSet<>();
        this.partidos = new ArrayList<>();
    }

    public boolean agregarEquipo(Equipo eq1) {
        return equipos.add(eq1);
    }

    public boolean registrarPartido(Partido partido) {
        if (equipos.contains(partido.getLocal()) && equipos.contains(partido.getVisitante())) {
            return partidos.add(partido);
        }
        return false;
    }

    public void mostrarPartidos() {
        System.out.println("Partidos del torneo " + nombre + ":");
        for (Partido p: partidos) {
            System.out.println(p);
        }
    }

    public void mostrarTabla() {
        Map<Equipo, Integer> puntos = new HashMap<>();
        for (Equipo e : equipos) {
            puntos.put(e, 0);
        }

        for (Partido p :partidos) {
            Equipo local = p.getLocal();
            Equipo visitante = p.getVisitante();
            int golesL = p.getPuntosLocal();
            int golesV = p.getPuntosVisitante();

            if (golesL > golesV) {
                puntos.put(local, puntos.get(local) + 3);
            } else if (golesL < golesV) {
                puntos.put(visitante, puntos.get(visitante) + 3);
            } else {
                puntos.put(local, puntos.get(local) + 1);
                puntos.put(visitante, puntos.get(visitante) + 1);
            }
        }
    }
}
