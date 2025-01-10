package ud4.ejercicios;

import java.util.Arrays;

public class E0506 {
    static int numAciertos(int[] apuesta, int[] ganadora) {
        int numAciertos = 0;

        for (int numApuesta : apuesta) {
            if (Arrays.binarySearch(ganadora, numApuesta) >= 0) {
                numAciertos++;
            }
        }
        return numAciertos;
    }
    public static void main(String[] args) {
        int[] apuesta = E0501.arrayAleatorio(6, 1, 46);
        int[] ganadora = E0501.arrayAleatorio(6, 1, 46);
        Arrays.sort(ganadora);

        System.out.println("Combinación ganadora: " + Arrays.toString(ganadora));
        System.out.println("Tu apuesta: \t \t" + Arrays.toString(apuesta));
        System.out.println("Número de aciertos: " + numAciertos(apuesta, ganadora));
    }
}
