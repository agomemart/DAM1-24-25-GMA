package ud2.ejercicios;

import java.util.Scanner;

/*
 * Pide 10 números por teclado y da la media de todos ellos
 */
public class E0308 {
    public static void main(String[] args) {
        int contador = 0;
        double media = 0;
        int totalNum = 0;
        Scanner sc = new Scanner(System.in);

        while (contador <=10) {
            
            System.out.println("Escribe un número: ");
            int num = sc.nextInt();
            contador++;
            totalNum += num;
            media = totalNum/contador;
        }
        sc.close();
        System.out.println("La media de los números introducidos es de: " + media);
    }
}
