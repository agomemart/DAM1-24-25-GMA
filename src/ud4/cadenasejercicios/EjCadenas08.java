package ud4.cadenasejercicios;
/*
* Crea una función que elimine todas las ocurrencias de una subcadena dada de una cadena de caracteres
* */
public class EjCadenas08 {
    public static String eliminarSubcadena(String cadena, String subcadena) {
        if (cadena == null || subcadena == null || subcadena.isEmpty()) {
            return cadena;
        }
        return cadena.replace(subcadena, "");
    }

    public static void main(String[] args) {
        String cadena = "Hola que hola que hola";
        String subcadena = "hola";
        System.out.println(eliminarSubcadena(cadena, subcadena));

    }
}
