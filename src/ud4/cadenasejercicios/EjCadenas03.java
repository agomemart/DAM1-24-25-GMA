package ud4.cadenasejercicios;
//Contar el número de veces que aparece un carácter en un texto.
public class EjCadenas03 {
    public static void main(String[] args) {
        String frase = "Hola, que tal estas?";
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == 'a') {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
