//Adrián Gómez Martínez
package ud4.gmaexamen;

import java.util.Random;
import java.util.Scanner;

/*
* Implementa un xogo no que o xogador terá que localizar un tesouro agachado nunha casilla
oculta dun mapa bidimensional.
Ao inicio o programa solicitará ao usuario o número de filas e columnas do mapa e a
continuación agachará o tesouro nunha casilla elexida ao chou.
A partir de ahí o programa solicitará repetidamente ao usuario o número de fila e columna
no que pensa que está o tesouro ata que acerte.
Se o usuario non acerta a ubicación do tesouro, o programa daralle unha pista indicando en
que dirección se atopa: “Máis ao {norte|nordés|leste|sueste|sur|suroeste|oeste|noroeste}
O usuario terá un número máximo de intentos para atopar o tesouro que se calculará como
un 10% de casillas do mapa. Por exemplo, para un mapa de 10x15, é dicir de 150 casillas, o
usuario terá un maximo de 15 intentos.
O programa rematará cando se esgoten o número de intentos ou se atope o tesouro,
informando ao usuario do resultado e do número total de intentos requeridos.
O programa deberá ser robusto e soportar entradas inválidas do usuario, tanto por introducir
caracteres alfanuméricos cando se agardan números como por introducir números de fila ou
columna fora de rango.
* */
public class BuscaTesouro {
    static void mostrarMapa(int[][] mapa){
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                System.out.print(mapa[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta las filas: ");
        int filas = sc.nextInt();
        System.out.print("Inserta las columnas: ");
        int columnas = sc.nextInt();

        int [][] mapa = new int[filas][columnas];

        mostrarMapa(mapa);

        Random random = new Random();
        int filaAleatoria = random.nextInt(0,filas - 1);
        int colAleatoria = random.nextInt(0,columnas - 1);

        mapa[filaAleatoria][colAleatoria] = 1;

        int NUM_MAX_FALLOS = ((filas * columnas) * 10) / 100;
        int numErrores = 0;

        do {
            System.out.print("Inserta la fila en la que quieres buscar: ");
            int filaBuscar = sc.nextInt();
            System.out.print("Inserta la columna en la que quieres buscar: ");
            int columnaBuscar = sc.nextInt();
            columnaBuscar =  columnaBuscar - 1;
            filaBuscar = filaBuscar - 1;

            while (filaBuscar > mapa.length || filaBuscar < 0 || columnaBuscar > mapa[0].length || columnaBuscar < 0) {
                System.out.println("Inserte una fila y una columna dentro del rango del mapa.");
                System.out.print("Inserta la fila en la que quieres buscar: ");
                filaBuscar = sc.nextInt();
                System.out.print("Inserta la columna en la que quieres buscar: ");
                columnaBuscar = sc.nextInt();
                columnaBuscar =  columnaBuscar - 1;
                filaBuscar = filaBuscar - 1;
            }

            if (mapa[filaBuscar][columnaBuscar] == 1) {
                System.out.println("Has encontrado el tesoro. Enhorabuena!!!");
                mostrarMapa(mapa);
                break;
            } else {
                System.out.println("Has fallado :) Te quedan " + (NUM_MAX_FALLOS - numErrores) + " fallos");
                if (colAleatoria > columnaBuscar) {
                    System.out.println("Está mas hacia el sur.");
                } else if (filaAleatoria > filaBuscar) {
                    System.out.println("Pista: Está más hacia el oeste");
                } else if (filaAleatoria < filaBuscar) {
                    System.out.println("Pista: Está más hacia el este");
                } else if (colAleatoria < columnaBuscar) {
                    System.out.println("Pista: Está más hacia el norte");
                } else if (filaAleatoria == filaBuscar) {
                    System.out.println("Pista: Está en esa misma fila");
                } else {
                    System.out.println("Pista: Está en la misma columna");
                }
                numErrores++;
            }
        } while(numErrores <= NUM_MAX_FALLOS);
        System.out.println("FIN PROGRAMA");
    }
}
