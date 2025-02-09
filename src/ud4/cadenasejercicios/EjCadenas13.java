package ud4.cadenasejercicios;
/*
* Crea una función que elimine los espacios en blanco de una cadena de caracteres
* */
public class EjCadenas13 {
    static String eliminarEspacios(String cadena) {
        return cadena.trim().replaceAll(" ", "");
    }

    public static void main(String[] args) {
        String cadena = "Hola que tal";
        System.out.println(eliminarEspacios(cadena));
    }
}
