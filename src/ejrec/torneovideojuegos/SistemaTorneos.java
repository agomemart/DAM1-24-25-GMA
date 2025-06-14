package ejrec.torneovideojuegos;

import java.util.*;

public class SistemaTorneos {
    Set<Jugador> jugadores = new HashSet<>();
    List<Torneo> torneos = new ArrayList<>();
    Map<Jugador, Map<String, Integer>> puntuacionesPorJugador = new HashMap<>();
    Map<String, Set<Jugador>> jugadoresPorTorneo = new HashMap<>();

    public void registrarJugador(String nombre, String nickname, int id) {
        Jugador j1 = new Jugador(nombre, nickname, id);
        if (jugadores.contains(j1)) {
            System.out.println("Existe un jugador con el mismo identificador.");
            return;
        }
        jugadores.add(j1);
        System.out.println("Jugador registrado correctamente");
    }

    public void crearTorneo(String nombreDelJuego, Date fecha, String nombreTorneo) {
        for (Torneo t : torneos) {
            if (t.getNombreTorneo().equalsIgnoreCase(nombreTorneo)) {
                System.out.println("Ya existe un torneo con ese nombre.");
                return;
            }
        }

        Torneo t1 = new Torneo(nombreDelJuego, fecha, nombreTorneo);
        torneos.add(t1);
        System.out.println("Torneo creado correctamente");
    }

    public void agregarJugadorTorneo(Jugador j1, Torneo t1) {
        if (!jugadores.contains(j1)) {
            System.out.println("Jugador no registrado en el sistema.");
            return;
        }
        if (!torneos.contains(t1)) {
            System.out.println("Torneo no existe.");
            return;
        }

        jugadoresPorTorneo.putIfAbsent(t1.getNombreTorneo(), new HashSet<>());
        jugadoresPorTorneo.get(t1.getNombreTorneo()).add(j1);
    }

    public void registrarPuntuacion(Jugador jugador, String nombreTorneo, int puntos) {
        if (!jugadores.contains(jugador)) {
            System.out.println("Jugador no registrado");
            return;
        }

        Set<Jugador> inscritos = jugadoresPorTorneo.get(nombreTorneo);
        if (inscritos == null || !inscritos.contains(jugador)) {
            System.out.println("El jugador no esta inscrito en ese torneo");
            return;
        }

        puntuacionesPorJugador.putIfAbsent(jugador, new HashMap<>());
        puntuacionesPorJugador.get(jugador).put(nombreTorneo, puntos);
    }

    public void mostrarPuntosTorneo(String nombreTorneo) {
        System.out.println("Puntos del torneo: " + nombreTorneo);
        for (Map.Entry<Jugador, Map<String, Integer>> entry : puntuacionesPorJugador.entrySet()) {
            Jugador jugador = entry.getKey();
            Map<String, Integer> puntos = entry.getValue();
            if (puntos.containsKey(nombreTorneo)) {
                System.out.println(jugador.getNickname() + ": " + puntos.get(nombreTorneo));
            }
        }
    }

    public static void main(String[] args) {
        SistemaTorneos sistema = new SistemaTorneos();

        // Registrar jugadores
        sistema.registrarJugador("Carlos", "NightWolf", 1);
        sistema.registrarJugador("Lucía", "LuluChan", 2);
        sistema.registrarJugador("Pedro", "DarkBlade", 3);

        // Crear torneos
        sistema.crearTorneo("FIFA 25", new Date(), "Copa Verano");
        sistema.crearTorneo("Street Fighter VI", new Date(), "Torneo Pelea Total");

        // Crear objetos jugador y torneo que ya están registrados
        Jugador carlos = new Jugador("Carlos", "NightWolf", 1);
        Jugador lucia = new Jugador("Lucía", "LuluChan", 2);
        Torneo fifa = new Torneo("FIFA 25", new Date(), "Copa Verano");
        Torneo street = new Torneo("Street Fighter VI", new Date(), "Torneo Pelea Total");

        // Agregar jugadores a torneos
        sistema.agregarJugadorTorneo(carlos, fifa);
        sistema.agregarJugadorTorneo(lucia, fifa);
        sistema.agregarJugadorTorneo(carlos, street);

        // Registrar puntuaciones
        sistema.registrarPuntuacion(carlos, "Copa Verano", 85);
        sistema.registrarPuntuacion(lucia, "Copa Verano", 92);
        sistema.registrarPuntuacion(carlos, "Torneo Pelea Total", 78);

        // Mostrar puntos por torneo
        System.out.println("\n--- Puntos en Copa Verano ---");
        sistema.mostrarPuntosTorneo("Copa Verano");

        System.out.println("\n--- Puntos en Torneo Pelea Total ---");
        sistema.mostrarPuntosTorneo("Torneo Pelea Total");
    }
}
