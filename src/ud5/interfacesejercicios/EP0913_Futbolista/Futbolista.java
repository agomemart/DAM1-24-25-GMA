package ud5.interfacesejercicios.EP0913_Futbolista;

import java.util.Objects;

public class Futbolista {
    String dni;
    String nombre;
    int edad;
    int numGoles;

    public Futbolista(String dni, String nombre, int edad, int numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numGoles=" + numGoles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista that = (Futbolista) o;
        return edad == that.edad && numGoles == that.numGoles && Objects.equals(dni, that.dni) && Objects.equals(nombre, that.nombre);
    }
}
