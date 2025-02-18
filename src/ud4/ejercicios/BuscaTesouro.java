package ud4.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class BuscaTesouro {
    public static void main(String[] args) {
        final int MAX_FILA_COL = 40;

        System.out.println("Numero filas: ");
        int numFilas = leerEntero(2, MAX_FILA_COL);
        System.out.println("Numero columnas: ");
        int numColumnas = leerEntero(2, MAX_FILA_COL);

        Random rnd = new Random();
        int filaTesoro = rnd.nextInt(numColumnas);
        int columnaTesoro = rnd.nextInt(numColumnas);

        final int MAX_INTENTOS = Math.max(numFilas * numColumnas / 10, 1);

        int intentos = 0;
        boolean tesoroEncontrado = false;

        do {
            System.out.printf("Fila (0 - %d): ", numFilas - 1);
            int fila = leerEntero(0, numFilas - 1);
            System.out.printf("Columna (0 - %d): ", numColumnas - 1);
            int columna = leerEntero(0, numColumnas - 1);

            intentos++;

            if (fila == filaTesoro && columna == columnaTesoro) {
                tesoroEncontrado = true;
            } else {
                String pista;
                if (fila == filaTesoro) {
                    pista = columna < columnaTesoro ? "Más al este" : "Más al oeste";
                } else if (fila < filaTesoro){
                   if (columna == columnaTesoro) {
                       pista = "Más al sur";
                   } else {
                       pista = columna < columnaTesoro ? "Más al sureste" : "Más al suroeste";
                   }
                    pista = columna < columnaTesoro ? "Más al sur" : "Más al norte";
                } else {
                    pista = columna < columnaTesoro ? "Más al nordeste" : "Más al noroeste";
                }
                System.out.println("Pista: " + pista);
            }

        } while (intentos < MAX_INTENTOS && !tesoroEncontrado);

        if (tesoroEncontrado) {
            System.out.printf("Enhorabuena, has encontrado el tesoro en %d intentos.%n%n", intentos);
        } else {
            System.out.println("Has perdido :(");
        }
    }

    private static int leerEntero(int min, int max) {
        int num = -1;
        Scanner sc = new Scanner(System.in);
        boolean numCorrecto = false;
        do {
            try {
                num = sc.nextInt();
                if (num < min || num > max) {
                    System.out.printf("Debe ser un número entero entr %d y %d%n", min, max);
                } else {
                    numCorrecto = true;
                }
            } catch (Exception e){
                System.out.printf("Debe ser un número entero entr %d y %d%n", min, max);
                sc.nextLine();
            }


        } while (!numCorrecto);

        return num;
    }
}
