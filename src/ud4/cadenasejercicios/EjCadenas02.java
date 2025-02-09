package ud4.cadenasejercicios;
//Eliminar la última palabra de una frase
public class EjCadenas02 {
    public static void main(String[] args) {
        String frase = "Hola Mundo";

        int espacio = frase.lastIndexOf(" ");
        if (espacio != -1) {
            frase = frase.substring(0, espacio);
        }
        System.out.println(frase);
    }
}
