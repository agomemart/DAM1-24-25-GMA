//Adrián Gómez Martínez
package ud2.gmaexamen;

import java.util.Scanner;

/*
 * Crea un programa que muestre un menú como el siguiente.
1. Triángulo
2. Rectángulo
0. SALIR
A continuación se solicitará al usuario que introduzca por teclado la opción deseada.
Si el usuario introduce un valor incorrecto, por no ser un número entero o por no estar en el
rango de opciones, se le informará del error con el mensaje “Opción inválida”.
Además, el programa llevará la cuenta de las veces que el usuario haya introducido un valor
incorrecto, indicándole cada vez el número de errores que lleva y que el programa terminará
al llegar a 3 errores.
Si el usuario introduce la opción cero o si alcanza el número máximo de errores el programa
terminará con un mensaje de despedida.
La opción “1. Triángulo” solicitará por teclado un número entero entre 2 y 20 y dibujará un
triángulo de asteriscos con el número de niveles indicado.
La opción “2. Rectángulo” solicitará por teclado dos números enteros entre 2 y 20, uno
representando el número de filas y otro el de columnas, y dibujará un rectángulo de
asteriscos con con las dimensiones indicadas.
En ambas opciones, si los valores introducidos no son números enteros o si están fuera de
rango, se informará al usuario del error.
Una vez dibujadas las figuras o informado el usuario del error se volverá a mostrar el menú.
Estructura el programa en módulos para simplificar el programa y evitar duplicidades de
código.
 */
public class MenuFiguras {
    public static void mostarMenu() {
        System.out.println("Menú");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("0. Salir");
    }

    public static void dibujarRectagulo(int alto, int ancho) {
        if (ancho >= 2 && alto <= 20) {
            for (int j = 1; j <= alto; j++) {
                System.out.println("*");
                for (int i = 1; i <= ancho; i++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        } else {
            System.out.println("Números introducidos no válidos");
        }
    }

    public static void dibujarTriangulo(int alto, int ancho) {
        if (ancho >= 2 && alto <= 20) {
            for (int j = 0; j < alto; j++) {
                System.out.print("*");
                System.out.println("");
                for (int i = 0; i < ancho; i++) {
                    System.out.print("*");
                }
            }
        } else {
            System.out.println("Números introducidos no válidos");
        }
    }

    public static void main(String[] args) {
        int numFallos = 0;
        Scanner sc = new Scanner(System.in);
        mostarMenu();
        System.out.print("Escoge una opción: ");
        int opcionMenu = sc.nextInt();

        while (opcionMenu != 0 && numFallos < 2) {
            switch (opcionMenu) {
                case 1:
                    System.out.print("Que alto quieres que tenga el triángulo: ");
                    int altoTriangulo = sc.nextInt();
                    System.out.print("Que ancho quieres que tenga el triángulo: ");
                    int anchoTriangulo = sc.nextInt();
                    dibujarTriangulo(altoTriangulo, anchoTriangulo);
                    break;
                case 2:
                    System.out.print("Que alto quieres que tenga el rectángulo: ");
                    int altoRectangulo = sc.nextInt();
                    System.out.print("Que ancho quieres que tenga el rectángulo: ");
                    int anchoRectangulo = sc.nextInt();
                    dibujarRectagulo(altoRectangulo, anchoRectangulo);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción seleccionada no válida");
                    numFallos++;
                    break;
            }
            if (numFallos != 0) {
                System.out.println("El programa se cerrará en cuanto lleves 3 fallos");
                System.out.println("Llevas " + numFallos + " fallos");
            }
            mostarMenu();
            opcionMenu = sc.nextInt();
        }
        sc.close();
        System.out.println("Hasta pronto!");
    }
}
