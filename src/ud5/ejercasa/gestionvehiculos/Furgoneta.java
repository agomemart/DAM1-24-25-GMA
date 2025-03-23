package ud5.ejercasa.gestionvehiculos;

public class Furgoneta extends Vehiculo {
    private double capacidadCarga;

    public Furgoneta(String matricula, String marca, String modelo, double precioPorDia, double capacidadCarga) {
        super(matricula, marca, modelo, precioPorDia);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        if (capacidadCarga > 1000) {
            return (getPrecioPorDia() * dias) + (getPrecioPorDia() * dias) * 0.15;
        }
        return getPrecioPorDia() * dias;
    }
}
