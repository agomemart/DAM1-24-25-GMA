package ud4.cadenasejercicios;
/*
* Crea una función que reemplace todas las ocurrencias de una subcadena dada en una cadena de
* caracteres por otra subcadena dada.
* */
public class EjCadenas09 {
    public static String reemplazarSubcadena(String cadena, String subcadenaOriginal, String subcadenaReemplazo) {
        if (cadena == null || subcadenaOriginal == null || subcadenaReemplazo == null) {
            return cadena;
        }
        return cadena.replace(subcadenaOriginal, subcadenaReemplazo);
    }
}
