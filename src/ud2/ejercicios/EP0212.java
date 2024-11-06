package ud2.ejercicios;

import java.util.Scanner;

/*
 * EI DNI consta de un entero de 8 digitos seguido de una letra que se obtiene a
partir del número de la siguiente forma:
letra = número DNI módulo 23
Basándote en esta información, elige la letra a partir de la numeración de la siguiente tabla:
y diseña una aplicación en la que, dado un número de DNI, calcule la letra que le
corresponde. Observa que un número de 8 digitos está dentro del rango del tipo int.

 */
public class EP0212 {
   public static void main(String[] args) {
    int nDni, restoModulo;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Inserta el número del DNI: ");
    nDni = sc.nextInt();
    sc.close();
    restoModulo = nDni % 23;
    
    if (nDni <= 99999999 && nDni >= 10000000) {
        char letraDNI;
        switch (restoModulo) {
            case 0:
                letraDNI = 'T';
                break;
            case 1:
                letraDNI = 'R';
                break;
            case 2:
                letraDNI = 'W';
                break;
            case 3:
                letraDNI = 'A';
                break;
            case 4:
                letraDNI = 'G';
                break;
            case 5:
                letraDNI = 'M';
                break;
            case 6:
                letraDNI = 'Y';
                break;
            case 7:
                letraDNI = 'F';
                break;
            case 8:
                letraDNI = 'P';
                break;
            case 9:
                letraDNI = 'D';
                break;
            case 10:
                letraDNI = 'X';
                break;
            case 11:
                letraDNI = 'B';
                break;
            case 12:
                letraDNI = 'N';
                break;
            case 13:
                letraDNI = 'J';
                break;
            case 14:
                letraDNI = 'Z';
                break;
            case 15:
                letraDNI = 'S';
                break;
            case 16:
                letraDNI = 'Q';
                break;
            case 17:
                letraDNI = 'V';
                break;
            case 18:
                letraDNI = 'H';
                break;
            case 19:
                letraDNI = 'L';
                break;
            case 20:
                letraDNI = 'C';
                break;   
            case 21:
                letraDNI = 'K';
                break;
            case 22:
                letraDNI = 'E';
                break;
            default:
            letraDNI = ' ';
                break;
        }
        System.out.println("Tu DNI con letra sería: "+ nDni + letraDNI);
    } else {
        System.out.println("Número de DNI no válido. Inserta otro número.");
    }
   } 
}
