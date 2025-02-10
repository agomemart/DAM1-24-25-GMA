package ud4.cadenasejercicios;
/*
* Crea una función que codifique una cadena de caracteres usando el algoritmo ROT13.
* */
public class EjCadenas23 {
    static String codificarCaracteres(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter >= 'a' && caracter <= 'z') {
                caracter = (char) ((caracter - 'a' + 3) % 26 + 'a');
            } else if (caracter >= 'A' && caracter <= 'Z') {
                caracter = (char) ((caracter - 'A' + 3) % 26 + 'A');
            }
            resultado.append(caracter);
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        String cadena = "Hola mundo";
        System.out.println(codificarCaracteres(cadena));
    }
}
