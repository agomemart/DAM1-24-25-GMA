package ud5.ejercasa.paquetesturisticos;

public class PaqueteTerrestre extends PaqueteTuristico{
    private TipoVehiculo tipoVehiculo;

    public PaqueteTerrestre(String destino, int duracionDias, double precioBase, TipoVehiculo tipoVehiculo) {
        super(destino, duracionDias, precioBase, tipoVehiculo.name()); // Usa el nombre del enum
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public  double calcularPrecioTotal() {
        if (tipoVehiculo == TipoVehiculo.TREN) {
            return getPrecioBase() + getPrecioBase()* 0.1;
        }
        return getPrecioBase();
    }

    @Override
    public String toString() {
        return "Paquete Terrestre a " + getDestino() + ", duración días: " + getDuracionDias() + " dias, " + tipoVehiculo + " con precio total de: " + calcularPrecioTotal() + " euros.";
    }
}
