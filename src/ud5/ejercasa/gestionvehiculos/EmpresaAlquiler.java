package ud5.ejercasa.gestionvehiculos;

import java.util.Arrays;

public class EmpresaAlquiler {
    private Vehiculo[] flota;
    private int numVehiculos;

    public EmpresaAlquiler(int capacidadMaxima) {
        this.flota = new Vehiculo[capacidadMaxima];
        this.numVehiculos = 0;
    }

    class Cliente{
        private String dni;
        private String nombre;

        public Cliente(String dni, String nombre) {
            this.dni = dni;
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return nombre + " - " + dni;
        }
    }

    public void agregarVehiculo(Vehiculo v) {
        if (numVehiculos < flota.length) {
            flota[numVehiculos] = v;
            numVehiculos++;
        } else {
            System.out.println("Flota llena. No se pueden agregar más vehículos");
        }
    }

    public void mostrarVehiculos() {
        for (int i = 0; i < numVehiculos; i++) {
            System.out.println(flota[i]);;
        }
    }

    public void ordenarVehiculos() {
        Arrays.sort(flota, 0, numVehiculos);
    }

    public void alquilarVehiculo(String matricula, Cliente cliente, int dias) {
        for (int i = 0; i < numVehiculos; i++) {
            if (flota[i].getMatricula().equalsIgnoreCase(matricula)) {
                double precioFinal = flota[i].calcularPrecioAlquiler(dias);
                System.out.println(cliente + " ha alquilado el vehículo: " + flota[i]);
                System.out.println("Precio final alquiler por " + dias + " días: " + precioFinal + " euros");
                return;
            }
        }
        System.out.println("Vehículo con matrícula " + matricula + " no encontrado.");
    }
}
