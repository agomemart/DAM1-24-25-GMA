package ud5.mulleres;

abstract class MullerTraballadora {
    String nombre;
    String apellidos;
    int anoNacimiento;

    int getEdad(int anoActual){
        return anoActual - anoNacimiento;
    }

    public MullerTraballadora(String nombre, String apellidos, int anoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anoNacimiento = anoNacimiento;
    }

    public abstract String descrContrib();

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }
}
