package ud5.ejercasa.gestionvehiculos;

abstract class Vehiculo implements Comparable{
    private String matricula;
    private String marca;
    private String modelo;
    private double precioPorDia;

    public Vehiculo(String matricula, String marca, String modelo, double precioPorDia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precioPorDia = precioPorDia;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public String getMatricula() {
        return matricula;
    }

    public abstract double calcularPrecioAlquiler(int dias);

    @Override
    public String toString() {
        return matricula + ", " + marca + ", " + modelo + ", " + precioPorDia;
    }

    @Override
    public int compareTo(Object o) {
        Vehiculo vehiculo = (Vehiculo) o;
        return Double.compare(this.precioPorDia, vehiculo.precioPorDia);
    }
}
