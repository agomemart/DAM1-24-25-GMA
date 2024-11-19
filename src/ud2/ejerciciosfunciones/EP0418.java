package ud2.ejerciciosfunciones;
/*
 * Crea una función que muestre por consola una serie de números aleatorios
enteros. Los parámetros de la función serán: la cantidad de números aleatorios que se
mostrarán y los valores mínimos y máximos que estos pueden tomar.
 */

public class EP0418 {
    public static void numAleatorio(int cantidadNumeros, int max, int min) {
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println(numeroAleatorio);
        }
        
    }
    public static void main(String[] args) {
        numAleatorio(5, 20, 1);
    }
}
