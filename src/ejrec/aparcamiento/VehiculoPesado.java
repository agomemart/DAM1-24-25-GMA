package ejrec.aparcamiento;

public class VehiculoPesado extends Vehiculo{
    private double peso;
    private double altura;

    public VehiculoPesado(String matricula, double peso, double altura) {
        super(matricula);
        this.peso = peso;
        this.altura = altura;
    }
}
