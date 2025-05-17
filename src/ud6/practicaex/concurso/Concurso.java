package ud6.practicaex.concurso;

import ud6.gmaexamen.genericos.UtilGenerico;

import java.util.*;

public class Concurso {
    private Set<Participante> participantes;

    public Concurso(Set<Participante> participantes) {
        this.participantes = participantes;
    }

    public void agregarParticipante(Participante p1) {
        participantes.add(p1);
    }

    public List<Participante> listarPorLenguaje(String lenguaje) {
        return participantes.stream().filter(p -> p.getLenguajeFavorito().equals(lenguaje)).toList();
    }

    public List<Participante> ganadoresConPuntuacionMinima(int minimo) {
        Comparator<Participante> comp = (o1, o2) -> Integer.compare(o2.getPuntos(), o1.getPuntos());
        Participante umbral = new Participante("UMBRAL", "", minimo);
        return new ArrayList<>(UtilGenerico.filtrarMayores(participantes, umbral, comp));
    }

    public void mostrarClasificacion() {
        List<Participante> participantesOrdenados = new ArrayList<>(participantes);
        Comparator<Participante> comp = (o1, o2) -> Integer.compare(o2.getPuntos(), o1.getPuntos());
        Collections.sort(participantesOrdenados, comp);
        for (Participante p : participantesOrdenados) {
            System.out.println(p.getNombre() + " - " + p.getPuntos());
        }
    }
}
