package ud5.ejercasa.paquetesturisticos;

import java.util.Arrays;

public class AgenciaViajes{
    private PaqueteTuristico[] paquetes;
    private int numPaquetes;

    public AgenciaViajes(int capacidadMaxima) {
        this.paquetes = new PaqueteTuristico[capacidadMaxima];
        this.numPaquetes = 0;
    }

    public void agregarPaquete(PaqueteTuristico p) {
        if (numPaquetes < paquetes.length) {
            paquetes[numPaquetes] = p;
            numPaquetes++;
        } else {
            System.out.println("No se puede agregar el paquete porque ya no hay espacio disponible.");
        }
    }

    public void mostrarPaquetes() {
        for (int i = 0; i < numPaquetes; i++) {
            System.out.println(paquetes[i]);
        }
    }

    public void ordenarPaquetes() {
        Arrays.sort(paquetes, 0, numPaquetes);
    }

    public void reservarPaquete(String destino, Cliente cliente) {
        for (int i = 0; i < numPaquetes; i++) {
            if (paquetes[i].getDestino().equalsIgnoreCase(destino)) {
                double precioFinal = paquetes[i].calcularPrecioTotal();
                System.out.println(cliente + " ha reservado el paquete a " + destino + ": " + precioFinal);
                return;
            }
        }
        System.out.println("No se encontró un paquete para el destino: " + destino);
    }

    class Cliente {
        private String dni;
        private String nombre;

        public Cliente(String dni, String nombre) {
            this.dni = dni;
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Cliente: " + nombre + " (DNI: " + dni + ")";
        }
    }
}
