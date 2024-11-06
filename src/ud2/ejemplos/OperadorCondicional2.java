package ud2.ejemplos;

import java.util.*;
public class OperadorCondicional2 {                                                                       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;       
        System.out.println("Introduzca numero: ");
        num = sc.nextInt();
        sc.close();
        System.out.println(num%2 == 0 ? "PAR" : "IMPAR");                                                         
    }
}