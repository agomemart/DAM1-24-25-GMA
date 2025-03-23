package ud5.ejercasa.gestionvehiculos;

public class Turismo extends Vehiculo implements Descuento {
    private int plazas;

    public Turismo(String matricula, String marca, String modelo, double precioPorDia, int plazas) {
        super(matricula, marca, modelo, precioPorDia);
        this.plazas = plazas;
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        if(dias > 7) {
            return (getPrecioPorDia() * dias) - (getPrecioPorDia() * dias)* 0.1;
        }
        return getPrecioPorDia() * dias;
    }

    @Override
    public double aplicarDescuento(double precio) {
        if (precio > 500) {
            return precio - precio * 0.05;
        }
        return precio;
    }
}
