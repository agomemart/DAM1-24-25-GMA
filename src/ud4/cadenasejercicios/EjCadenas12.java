package ud4.cadenasejercicios;
/*
* Crea una función que cuente el número de ocurrencias de una subcadena dada en una cadena de caracteres.
* */
public class EjCadenas12 {
    static int numOcurrenciasCadena(String cadena, String subcadena) {
        int numOcurrencias = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.contains(subcadena)) {
                numOcurrencias++;
            }
        }
        return numOcurrencias;
    }
}
