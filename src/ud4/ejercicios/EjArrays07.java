package ud4.ejercicios;

import java.util.Scanner;

/* Leer N alturas y calcular la altura media. Calcular cuántas hay superiores a la media y cuántas inferiores.*/
public class EjArrays07 {
    public static void main(String[] args) {
        int numAlturas = 0;
        double altura = 0;
        double sumaAltura = 0;
        int contadorSuper = 0;
        int contadorInfer = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas alturas quieres introducir: ");
        numAlturas = sc.nextInt();

        int[] t = new int[numAlturas];
        System.out.println("Inserta una altura: ");
        altura = sc.nextDouble();
        sc.close();
        System.out.println(contadorInfer);
        System.out.println(contadorSuper);
        for(int i = 0; i < t.length; i++) {
            altura += sumaAltura;
        }

        double mediaAltura = sumaAltura / numAlturas;

        for(int i = 0; i < t.length; i++) {
            if (altura > mediaAltura) {
                contadorSuper++;
            } else if (altura > mediaAltura) {
                contadorInfer++;
            }
        }
    }
}
