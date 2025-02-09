package ud4.cadenasejercicios;
/*
* Crea una función que reemplace cada letra de una cadena de caracteres por la letra que le sigue en el alfabeto.
* */
public class EjCadenas16 {
    public static String reemplazarPorSiguienteLetra(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return cadena;
        }

        char[] caracteres = cadena.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            if (Character.isLetter(c)) {
                if (c == 'z') {
                    caracteres[i] = 'a';
                } else if (c == 'Z') {
                    caracteres[i] = 'A';
                } else {
                    caracteres[i] = (char) (c + 1);
                }
            }
        }
        return new String(caracteres);
    }
}
