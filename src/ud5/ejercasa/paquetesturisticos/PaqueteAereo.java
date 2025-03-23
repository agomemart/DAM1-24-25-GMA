package ud5.ejercasa.paquetesturisticos;

public class PaqueteAereo extends PaqueteTuristico {
    private ClaseVuelo claseVuelo;

    public PaqueteAereo(String destino, int duracionDias, double precioBase, ClaseVuelo claseVuelo) {
        super(destino, duracionDias, precioBase, "Avión");
        this.claseVuelo = claseVuelo;
    }

    @Override
    public double calcularPrecioTotal() {
        if (claseVuelo == ClaseVuelo.PRIMERACLASE) {
            return getPrecioBase() + getPrecioBase()* 0.3;
        }
        return getPrecioBase();
    }

    @Override
    public String toString() {
        return "Paquete Aéreo a " + getDestino() + ", duración días: " + getDuracionDias() + " dias, clase vuelo: " + claseVuelo + ", con precio total de: " + calcularPrecioTotal() + " euros.";
    }
}
