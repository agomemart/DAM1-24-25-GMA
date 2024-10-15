package ud1.ejercicios;

import java.util.Scanner;

/*
 * Realiza un programa que simule el funcionamiento de un cajero automático. El programa
solicitará al usuario el importe en efectivo que desea retirar, que será un número entero de
euros (€). El programa calculará el número mínimo de billetes de 50, 20, 10 y 5 euros para
obtener dicho importe y presentará la información al usuario.
Si el importe introducido por el usuario no es múltiplo de 5 se informará también al usuario
del importe que el cajero no es capaz de satisfacer por no disponer de billetes de esa
cantidad. Por ejemplo, si el usuario introduce 78 €, el programa informará de que se
retirarán 75 € en los billetes que corresponda y que 3 € no se pueden retirar por no existir
billetes tan pequeños.

 */
public class CajeroAutomatico {
    public static void main(String[] args) {
        int importeEfectivo;
        int nMinBilletes5, nMinBilletes10, nMinBilletes20, nMinBilletes50;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el importe que quieres sacar en efectivo: ");
        importeEfectivo = sc.nextInt();
        sc.close();

        int multipo5 = importeEfectivo%5;
        int hacerMultiplo5 = importeEfectivo - multipo5;
        int numMultiplo5 = (multipo5 == 0) ? importeEfectivo : 
                            1;
        String esMultiplo5 = (numMultiplo5 == 1) ? "El número introducido no es múltiplo de 5" :
                            "El número introducido es múltiplo de 5 por lo que se puede sacar la cantidad introducida";

        String noMultiplo5 = (hacerMultiplo5 > 0) ? "Como no es múltiplo de 5 la cantidad a sacar es la siguiente: " + hacerMultiplo5 :
                            "La cantidad a sacar es la introducida al principio del programa" + importeEfectivo;
                            
        nMinBilletes50 = importeEfectivo/50;
        nMinBilletes20 = (importeEfectivo % 50) / 20;
        nMinBilletes10 = (importeEfectivo % 50 % 20) / 10;
        nMinBilletes5 = (importeEfectivo % 50 % 20 % 10) / 5;

        System.out.println(esMultiplo5);
        System.out.println(noMultiplo5);
        System.out.println("La cantidad introducida se puede sacar en " + nMinBilletes5 + " billetes de 5 euros");
        System.out.println("La cantidad introducida se puede sacar en " + nMinBilletes10 + " billetes de 10 euros");
        System.out.println("La cantidad introducida se puede sacar en " + nMinBilletes20 + " billetes de 20 euros");
        System.out.println("La cantidad introducida se puede sacar en " + nMinBilletes50 + " billetes de 50 euros");
    }
}
