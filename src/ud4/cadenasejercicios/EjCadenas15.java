package ud4.cadenasejercicios;
/*
* Crea una función que convierta una cadena de caracteres a mayúsculas o minúsculas.
* */
public class EjCadenas15 {
    static String convertirMayusOMinus(String cadena, int opcion) {
        switch (opcion) {
            case 1: return cadena.toLowerCase();
            case 2: return cadena.toUpperCase();
        }
        return cadena;
    }
}
