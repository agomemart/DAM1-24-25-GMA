package ud5.ejercasa.paquetesturisticos;

public abstract class PaqueteTuristico implements Comparable{
    private String destino;
    private int duracionDias;
    private double precioBase;
    private String tipoTransporte;

    public PaqueteTuristico(String destino, int duracionDias, double precioBase, String tipoTransporte) {
        this.destino = destino;
        this.duracionDias = duracionDias;
        this.precioBase = precioBase;
        this.tipoTransporte = tipoTransporte;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public abstract double calcularPrecioTotal();

    @Override
    public String toString() {
        return destino + ", duración: " + duracionDias +
                ", Precio base: " + precioBase + ", Transporte: " + tipoTransporte;
    }

    @Override
    public int compareTo(Object o) {
        PaqueteTuristico paquete = (PaqueteTuristico) o;
        return Double.compare(this.calcularPrecioTotal(), ((PaqueteTuristico) o).calcularPrecioTotal());
    }
}
