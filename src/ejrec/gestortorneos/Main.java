package ejrec.gestortorneos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Torneo torneo = new Torneo("Copa Invierno", "Fútbol");

        Equipo e1 = new Equipo("Tigres", "Monterrey");
        Equipo e2 = new Equipo("Águilas", "CDMX");
        Equipo e3 = new Equipo("Pumas", "CDMX");

        torneo.agregarEquipo(e1);
        torneo.agregarEquipo(e2);
        torneo.agregarEquipo(e3);

        torneo.registrarPartido(new Partido(e1, e2, 2, 1, LocalDate.of(2024, 6, 10)));
        torneo.registrarPartido(new Partido(e2, e3, 0, 0, LocalDate.of(2024, 6, 12)));
        torneo.registrarPartido(new Partido(e3, e1, 1, 3, LocalDate.of(2024, 6, 15)));

        torneo.mostrarPartidos();
        torneo.mostrarTabla();
    }
}
