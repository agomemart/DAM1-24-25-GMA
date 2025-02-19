package ud5.apuntesherencia;

import ud3.apuntes.DiaDeLaSemana;

public class Persona {
    //Datos 
    public String nombre;
    private String apellido1;
    private String apellido2;
    public int edad;
    public double estatura = 1.80;
    private final String dni = null;
    public static int contadorPersonas = 0;
    enum Sexo {HOMBRE, MUJER, NO_BINARIO};
    private Sexo sexo;
    DiaDeLaSemana diaPreferido;
    public Persona() {
    }
    public Persona(String nombre, Sexo sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos
    public void inicializar(String n, String a1, String a2, int e){                            
           nombre = n;
           apellido1 = a1;
           apellido2 = a2;
           edad = e;
    }

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String nombreCompleto() {
           return nombre + " " + apellido1 + " " + apellido2;
    }

    public boolean esMayorEdad() {
           if (edad >= 18){
               return true;
           }else{
               return false;
           }
    }

    public void cumplirAnhos() {
        edad++;
    }

    public int getEdad() {
        return edad;
    }

    public static void incrementarContador() {
        contadorPersonas++;
    }
    public String getDni() {
        return dni;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public double getEstatura() {
        return estatura;
    }
}
