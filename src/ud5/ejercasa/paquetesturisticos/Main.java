package ud5.ejercasa.paquetesturisticos;

public class Main {
    public static void main(String[] args) {
        AgenciaViajes agencia = new AgenciaViajes(5); // Máximo 5 paquetes

        // Crear paquetes turísticos con ENUMS en lugar de Strings
        PaqueteTuristico p1 = new PaqueteAereo("París", 7, 1200, ClaseVuelo.ECONOMICA);
        PaqueteTuristico p2 = new PaqueteAereo("Nueva York", 10, 2000, ClaseVuelo.PRIMERACLASE);
        PaqueteTuristico p3 = new PaqueteTerrestre("Madrid", 5, 600, TipoVehiculo.TREN);
        PaqueteTuristico p4 = new PaqueteTerrestre("Barcelona", 3, 400, TipoVehiculo.AUTOBUS);

        // Agregar paquetes
        agencia.agregarPaquete(p1);
        agencia.agregarPaquete(p2);
        agencia.agregarPaquete(p3);
        agencia.agregarPaquete(p4);

        // Mostrar paquetes antes de ordenar
        System.out.println("==== PAQUETES SIN ORDENAR ====");
        agencia.mostrarPaquetes();

        // Ordenar y mostrar paquetes ordenados
        agencia.ordenarPaquetes();
        System.out.println("\n==== PAQUETES ORDENADOS POR PRECIO ====");
        agencia.mostrarPaquetes();

        // Crear un cliente
        AgenciaViajes.Cliente cliente1 = agencia.new Cliente("12345678A", "Ana López");

        // Reservar un paquete
        System.out.println("\n==== RESERVA DE PAQUETE ====");
        agencia.reservarPaquete("Nueva York", cliente1);
    }
}
