package ud4.ejercicios;
/*
* Escribe un método que reciba una cadena de texto y devuelva dos resultados:
La cantidad total de palabras en la cadena.
La palabra más larga de la cadena (si hay varias, devuelve cualquiera de ellas)
* */
public class ContarPalabras {
    public static void contarPalabrasYLongitudMaxima(String texto) {
        String[] palabras = texto.toLowerCase().split("\\s+");

        System.out.println("Palabras totales en la cadena introducida: " + palabras.length);

        int tamañoPalabra = 0;
        String palabraLarga = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= tamañoPalabra) {
                tamañoPalabra = palabras[i].length();
                palabraLarga = palabras[i];
            }
        }
        System.out.println("Tamaño palabra más larga: " + tamañoPalabra);
        System.out.println("Palabra Larga: " + palabraLarga);
    }

    public static void main(String[] args) {
        contarPalabrasYLongitudMaxima("Esto es una prueba del programa realizado programar");
    }
}
