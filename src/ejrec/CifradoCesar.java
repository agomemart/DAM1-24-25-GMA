package ejrec;

public class CifradoCesar {
    public static boolean esLetraCifrable(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }

    public static char cifrarCaracter(char caracter, int desplazamiento) {
        if (!esLetraCifrable(caracter)) return caracter;

        int base = Character.isUpperCase(caracter) ? 'A' : 'a';
        int nuevoCaracter = (caracter - base + desplazamiento) % 26;

        if (nuevoCaracter < 0) nuevoCaracter += 26;

        return (char) (base + nuevoCaracter);
    }

    public static String encriptarCesar(String cadena, int desplazamiento) {
        String textoCifrado = "";
        for (int i = 0; i < cadena.length(); i++) {
            textoCifrado += cifrarCaracter(cadena.charAt(i), desplazamiento);
        }
        return textoCifrado;
    }

    public static String desencriptarCesar(String cadena, int desplazamiento) {
        return encriptarCesar(cadena, -desplazamiento);
    }

    public static void main(String[] args) {
        String cadena = "Hola que tal";
        System.out.println(encriptarCesar(cadena, 1));
        System.out.println(desencriptarCesar(encriptarCesar(cadena, 1), 1));
    }
}
