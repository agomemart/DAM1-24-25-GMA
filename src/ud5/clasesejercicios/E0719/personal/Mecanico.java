package ud5.clasesejercicios.E0719.personal;

public class Mecanico {
    String nombre;
    String telefono;
    public enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}
    Especialidad especialidad;

    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
}
