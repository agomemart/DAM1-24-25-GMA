package ud5.clasesejercicios.E0710_trenes.personal;

import java.time.LocalDate;

public class JefeEstacion {
    private String nombre;
    private String dni;
    private LocalDate fechaNombramiento;

    public JefeEstacion(String nombre, String dni, LocalDate fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }

    @Override
    public String toString() {
        return "JefeEstacion{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNombramiento=" + fechaNombramiento +
                '}';
    }
}
