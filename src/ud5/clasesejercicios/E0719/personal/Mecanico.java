package ud5.clasesejercicios.E0719.personal;

import ud5.clasesejercicios.E0719.maquinaria.Locomotora;

import java.time.LocalDate;

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

    public void revisar(Locomotora locomotora) {
        System.out.println("El/la mecánico/a" + nombre + " ha revisado " + especialidad
        + " de la locomotora " + locomotora.getMatricula() + " con fecha " + LocalDate.now());
    }
}
