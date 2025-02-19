package ud5.apuntesherencia;
import ud5.apuntesherencia.Persona;

public class Empleado extends Persona{
    double salario;
    String estatura;

    Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    Empleado() {

    }
    public Empleado (String nombre, int edad, String estatura, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println(nombre + " - (" + salario + " euros anuales)");
    }

    public static void main(String[] args) {
        Empleado maria = new Empleado("Maria", 30000);
        Empleado pepe = new Empleado("Pepe", 25, "XL", 20000);
        System.out.println(pepe.edad);
        pepe.mostrarDatos();
        Persona p = pepe;
        Empleado nuevoPepe = (Empleado) p;
        nuevoPepe.mostrarDatos();
    }
}
