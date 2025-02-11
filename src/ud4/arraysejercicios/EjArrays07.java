package ud4.arraysejercicios;

import java.util.Scanner;

/* Leer N alturas y calcular la altura media. Calcular cuántas hay superiores a la media y cuántas inferiores.*/
public class EjArrays07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuántas alturas quieres introducir: ");
        int numAlturas = sc.nextInt();

        double[] alturas = new double[numAlturas];
        double sumaAltura = 0;
        int contadorSuper = 0, contadorInfer = 0;

        for (int i = 0; i < numAlturas; i++) {
            System.out.print("Inserta una altura: ");
            alturas[i] = sc.nextDouble();
            sumaAltura += alturas[i];
        }

        sc.close();

        double mediaAltura = sumaAltura / numAlturas;
        System.out.println("\nAltura media: " + mediaAltura);

        for (int i = 0; i < numAlturas; i++) {
            if (alturas[i] > mediaAltura) {
                contadorSuper++;
            } else if (alturas[i] < mediaAltura) {
                contadorInfer++;
            }
        }

        // Imprimir resultados
        System.out.println("Alturas superiores a la media: " + contadorSuper);
        System.out.println("Alturas inferiores a la media: " + contadorInfer);
    }
}
