package ud5.mulleres;

abstract class MullerTraballadora {
    String nombre;
    String apellidos;
    int anoNacimiento;
    String descrContrib;

    void descricionContribucion() {
        System.out.println(descrContrib);
    }

    int getEdad(int anoActual){
        return anoActual - anoNacimiento;
    }

    public MullerTraballadora(String nombre, String apellidos, int anoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anoNacimiento = anoNacimiento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }
}
