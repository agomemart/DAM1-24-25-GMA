package ud5.clasesejercicios.E0710_trenes.personal;

public class Mecanico {
    private String nombre;
    private String telefono;
    private especialidad especialidad;

    public Mecanico(String nombre, String telefono, especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }
}
