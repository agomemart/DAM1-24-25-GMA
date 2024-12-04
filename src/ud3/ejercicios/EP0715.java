package ud3.ejercicios;

public class EP0715 {
    public static void main(String[] args) {
        Calendario fecha = new Calendario(2024, 12, 31);

        fecha.incrementarDia();
        Calendario fecha2 = new Calendario(2025, 1, 1);
        System.out.println(fecha.iguales(fecha2));

        fecha.incrementarAnho(-2025);
        fecha.mostrar();
        fecha.incrementarAnho(1);
        fecha.mostrar();

        System.out.println("fin");
    }
}
