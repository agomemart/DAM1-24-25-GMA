package ud2.ejemplos;

import java.util.Scanner;
public class OperadorCondicional {
    public static void main(String[] args) {                                                                      
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduzca numero: ");
        num = sc.nextInt();
        sc.close();
        System.out.println(num >= 0 ? "POSITIVO" : "NEGATIVO");                                                   
    }
}