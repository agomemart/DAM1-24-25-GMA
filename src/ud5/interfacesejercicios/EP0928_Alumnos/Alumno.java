package ud5.interfacesejercicios.EP0928_Alumnos;

import java.util.Comparator;

public class Alumno implements Comparable{
    private String nombre;
    private String apellido;
    private int edad;
    private double notaMedia;

    public Alumno(String nombre, String apellido, int edad, double notaMedia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", edad: " + edad + ", nota media: " + notaMedia;
    }

    @Override
    public int compareTo(Object o) {
        Alumno otro = (Alumno) o;
        return this.getApellido().compareTo(otro.getApellido());
    }
}
class ordenarPorNombre implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Alumno otro1 = (Alumno) o1;
        Alumno otro2 = (Alumno) o2;
        return otro1.getNombre().compareTo(otro2.getNombre());
    }
}
class ordenarPorEdad implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Alumno otro1 = (Alumno) o1;
        Alumno otro2 = (Alumno) o2;
        return otro1.getEdad() - otro2.getEdad();
    }
}
class ordenarPorNotaMedia implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Alumno otro1 = (Alumno) o1;
        Alumno otro2 = (Alumno) o2;
        return Double.compare(otro1.getNotaMedia(), otro2.getNotaMedia());
    }
}
