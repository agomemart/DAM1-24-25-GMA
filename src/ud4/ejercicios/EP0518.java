package ud4.ejercicios;

import java.util.Scanner;

/*
* Escribe un programa que solicite los elementos de una matriz de tamaño 4 x 4. La
aplicación debe decidir si la matriz introducida corresponde a una matriz mágica, que es aquella
donde la suma de los elementos de cualquier fila o de cualquier columna valen lo mismo
* */
public class EP0518 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int sumaFila1 = 0;
        int sumaFila2 = 0;
        int sumaFila3 = 0;
        int sumaFila4 = 0;
        boolean esMagicaFila = false;
        for (int i = 0; i < matriz.length; i++) {
            sumaFila1 += matriz[i][0];
            sumaFila2 += matriz[i][1];
            sumaFila3 += matriz[i][2];
            sumaFila4 += matriz[i][3];
        }
        if (sumaFila1 == sumaFila2 && sumaFila3 == sumaFila4 && sumaFila2 == sumaFila4) {
            esMagicaFila = true;
        }

        int sumaColumna1 = 0;
        int sumaColumna2 = 0;
        int sumaColumna3 = 0;
        int sumaColumna4 = 0;
        boolean esMagicaColumna = false;

        for (int j = 0; j < matriz[0].length; j++) {
            sumaColumna1 += matriz[0][j];
            sumaColumna2 += matriz[1][j];
            sumaColumna3 += matriz[2][j];
            sumaColumna4 += matriz[3][j];
        }
        if (sumaColumna1 == sumaColumna2 && sumaColumna3 == sumaColumna4 && sumaColumna2 == sumaColumna4) {
            esMagicaColumna = true;
        }

        System.out.println(sumaFila1);
        System.out.println(sumaFila2);
        System.out.println(sumaFila3);
        System.out.println(sumaFila4);
        System.out.println(sumaColumna1);
        System.out.println(sumaColumna2);
        System.out.println(sumaColumna3);
        System.out.println(sumaColumna4);

        if (esMagicaFila && esMagicaColumna) {
            System.out.println("Es matríz mágica");
        } else {
            System.out.println("No es matríz mágica");
        }
    }
}
