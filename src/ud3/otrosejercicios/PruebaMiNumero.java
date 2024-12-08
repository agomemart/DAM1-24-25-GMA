package ud3.otrosejercicios;

import java.util.Scanner;

public class PruebaMiNumero {
    public static void main(String[] args) {
        MiNumero n1 = new MiNumero();
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta un número: ");
        int num = sc.nextInt();
        sc.close();
        MiNumero n2 = new MiNumero(num);
        
        n1.cambiarNumero(5);
        n1.resta(1);
        n2.suma(n1.getValor());

        System.out.println(n1.getValor());
        System.out.println(n2.getValor());
        System.out.println(n1.getDoble());
        System.out.println(n1.getTriple());



    }
}
