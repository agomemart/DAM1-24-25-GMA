package ud5.ejercasa.gestionvehiculos;

public class Main {
    public static void main(String[] args) {
        // Crear empresa con capacidad para 5 vehículos
        EmpresaAlquiler empresa = new EmpresaAlquiler(5);

        // Crear vehículos de prueba
        Vehiculo v1 = new Turismo("1234ABC", "Toyota", "Corolla", 50, 5);
        Vehiculo v2 = new Turismo("5678DEF", "Honda", "Civic", 60, 4);
        Vehiculo v3 = new Furgoneta("9876GHI", "Ford", "Transit", 80, 1200);
        Vehiculo v4 = new Furgoneta("4321JKL", "Mercedes", "Sprinter", 75, 800);

        // Agregar vehículos a la empresa
        empresa.agregarVehiculo(v1);
        empresa.agregarVehiculo(v2);
        empresa.agregarVehiculo(v3);
        empresa.agregarVehiculo(v4);

        // Mostrar los vehículos antes de ordenar
        System.out.println("==== LISTA DE VEHÍCULOS SIN ORDENAR ====");
        empresa.mostrarVehiculos();

        // Ordenar vehículos por precio
        empresa.ordenarVehiculos();

        // Mostrar los vehículos ordenados
        System.out.println("\n==== LISTA DE VEHÍCULOS ORDENADOS POR PRECIO ====");
        empresa.mostrarVehiculos();

        // Crear un cliente
        EmpresaAlquiler.Cliente cliente1 = empresa.new Cliente("12345678A", "Juan Pérez");

        // Alquilar un vehículo por 10 días
        System.out.println("\n==== ALQUILER DE VEHÍCULO ====");
        empresa.alquilarVehiculo("1234ABC", cliente1, 10);

        // Alquilar una furgoneta con más de 1000kg de carga
        System.out.println("\n==== ALQUILER DE VEHÍCULO ====");
        empresa.alquilarVehiculo("9876GHI", cliente1, 5);
    }
}
