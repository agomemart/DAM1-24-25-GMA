package ud3.ejercicios;

public class Gestor {
    public String nombre;
    public final String telefono;
    double importeMax;
    
    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMax = 10000;
    }

    public double getImporteMax() {
        return importeMax;
    }

    public void mostrar() {
        System.out.println(this.nombre + this.telefono + this.importeMax);
    }
}
