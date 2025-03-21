package ud5.interfacesejercicios.EP0913_Futbolista;

import java.util.Comparator;
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
    public int compareTo(Object ob) {
        Futbolista otro = (Futbolista) ob;
        return this.dni.compareTo(otro.dni);
    }
}
class OrdenarPorNombre implements Comparator {
    public int compare(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;
        return f1.nombre.compareTo(f2.nombre);
    }
}
class OrdenarPorEdad implements Comparator {
    public int compare(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;
        return Integer.compare(f1.edad, f2.edad);
    }
}
