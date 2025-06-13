package ejrec.aparcamiento;

public class Vehiculo implements Comparable<Vehiculo>{
    private String matricula;
    private String marca;
    private String modelo;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo con matrícula: " + matricula;
    }

    @Override
    public int compareTo(Vehiculo o) {
        return this.matricula.compareTo(o.matricula);
    }
}
