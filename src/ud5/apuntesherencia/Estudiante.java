package ud5.apuntesherencia;

public class Estudiante extends Persona{
    String curso;

    public Estudiante(String nombre, int edad, double estatura, String curso) {
        super(nombre, edad, estatura);
        this.curso = curso;
    }


}
