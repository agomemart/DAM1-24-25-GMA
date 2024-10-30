package ud2.ejemplos;

import java.util.Scanner;

public class CondicionalSimple1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print("Nota: ");
        int nota = sc.nextInt();
        sc.close();
        
        if (nota >= 5){//----------------------inicio de la condición                                             
            System.out.println("Enhorabuena!!");
            System.out.println("Has aprobado");
        }//-------------------------------------fin de la condición
        System.out.println("Hasta Pronto!");
    }
}
