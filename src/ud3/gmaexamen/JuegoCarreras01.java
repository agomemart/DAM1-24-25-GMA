//Adrián Gómez Martínez

package ud3.gmaexamen;

public class JuegoCarreras01 {
    public static void main(String[] args) {
        CocheCarreras rayo = new CocheCarreras("Rayo", 65, 300);
        CocheCarreras trueno = new CocheCarreras("Trueno", 55, 250);
        int distanciaCarrera = 500;
        int turnos = 5;
        int distanciaRestanteCarrera;
        rayo.mostrar();
        trueno.mostrar();

        for (int i = 0; i < turnos; i++) {
            distanciaRestanteCarrera = distanciaCarrera - rayo.getDistanciaRecorrida();
            distanciaRestanteCarrera = distanciaCarrera - trueno.getDistanciaRecorrida();

            if (rayo.getAutonomiaRestante() == 0) {
                rayo.repostar();
                System.out.println(rayo.getNombre() + " para a repostar");
            }
            if (trueno.getAutonomiaRestante() == 0) {
                trueno.repostar();
                System.out.println(trueno.getNombre() + " para a repostar");
            }
            if (trueno.getTurboRestante() > 0) {
                trueno.usarTurbo();
                System.out.println("Trueno usa un turbo y avanza " + trueno.getDistanciaRecorridaTurbo()
                        + " metros. Quedan " + trueno.getTurboRestante() + " turbos.");
                System.out.println("(Total recorrido: " + trueno.getDistanciaRecorrida() + " metros).");
            }
            if (rayo.getTurboRestante() > 0) {
                rayo.usarTurbo();
                System.out.println("Trueno usa un turbo y avanza " + trueno.getDistanciaRecorridaTurbo()
                        + " metros. Quedan " + trueno.getTurboRestante() + " turbos.");
                System.out.println("(Total recorrido: " + trueno.getDistanciaRecorrida() + " metros).");
            }
            if (rayo.getContadorRepostaje() == 0) {
                rayo.avanzar();
            }
            if (trueno.getContadorRepostaje() == 0) {
                trueno.avanzar();
            }
            if (trueno.getDistanciaRecorrida() > distanciaCarrera) {
                System.out.println("¡Trueno ha cruzado la meta y es el ganador!");
            }
            if (rayo.getDistanciaRecorrida() > distanciaCarrera) {
                System.out.println("¡Rayo ha cruzado la meta y es el ganador!");
            }
            if (distanciaRestanteCarrera > rayo.getDistanciaRecorrida()) {
                rayo.avanzar();
                System.out.println(rayo.getNombre() + " avanza " + (rayo.getDistanciaRecorrida() / distanciaCarrera)
                        + " metros (Total recorrido: " + rayo.getDistanciaRecorrida() + " metros).");
            }
            if (distanciaCarrera > trueno.getDistanciaRecorrida()) {
                trueno.avanzar();
                System.out.println(trueno.getNombre() + " avanza " + (trueno.getDistanciaRecorrida() / distanciaCarrera)
                        + " metros (Total recorrido: " + trueno.getDistanciaRecorrida() + " metros).");
            }
        }
    }
}
