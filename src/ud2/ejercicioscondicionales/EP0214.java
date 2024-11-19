package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*Escribe un programa que solicite al usuario un número comprendido entre 1 y 99.
El programa debe mostrario con letras, por ejemplo, para 56, se verá: “cincuenta y seis”. */
public class EP0214 {
    public static void unidadesALetra(int num) {
        switch (num) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;

            default:
                break;
        }
    }

    public static void numerosEspecialesALetra(int num) {
        switch (num) {
            case 11:
                System.out.println("once");
                break;
            case 12:
                System.out.println("doce");
                break;
            case 13:
                System.out.println("trece");
                break;
            case 14:
                System.out.println("catorce");
                break;
            case 15:
                System.out.println("quince");
                break;
            case 16:
                System.out.println("dieciseis");
                break;
            case 17:
                System.out.println("diecisiete");
                break;
            case 18:
                System.out.println("dieciocho");
                break;
            case 19:
                System.out.println("diecinueve");
                break;

            default:
                break;
        }
    }

    public static void decenasALetra(int num) {
        switch (num) {
            case 10:
                System.out.println("diez");
                break;
            case 20:
                System.out.println("veinte");
                break;
            case 30:
                System.out.println("treinta");
                break;
            case 40:
                System.out.println("cuarenta");
                break;
            case 50:
                System.out.println("cincuenta");
                break;
            case 60:
                System.out.println("sesenta");
                break;
            case 70:
                System.out.println("setenta");
                break;
            case 80:
                System.out.println("ochenta");
                break;
            case 90:
                System.out.println("noventa");
                break;

            default:
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre 1 y 99: ");
        int numUsuario = sc.nextInt();
        sc.close();

        if (numUsuario >= 1 && numUsuario <= 99) {
            if (numUsuario < 10) {
                unidadesALetra(numUsuario);

            } else if (numUsuario == 10) {
                decenasALetra(numUsuario);

            } else if (numUsuario < 20) {
                numerosEspecialesALetra(numUsuario);

            } else if (numUsuario >= 20) {
                int decena = numUsuario / 10;
                int unidad = numUsuario % 10;
               
                decenasALetra(decena);

                if (unidad > 0) {
                    decenasALetra(decena); 
                    unidadesALetra(unidad);
                }
            }
            
        } else {
            System.out.println("Número introducido fuera del rango. Introduce un número entre 1 y 99.");
        }
    }
}
