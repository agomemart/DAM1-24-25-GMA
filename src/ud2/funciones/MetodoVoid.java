package ud2.funciones;

import java.util.Scanner;

public class MetodoVoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.print("Introduce cadena de texto: ");
        cadena = sc.nextLine();
        sc.close();
        cajaTexto(cadena); //llamada al método
    }
    // método que muestra un String rodeado por un borde 
    public static void cajaTexto(String str){
            imprimirLinea(str);
            System.out.println();
            System.out.println("# " + str + " #"); //cadena con un borde en cada lado              
            imprimirLinea(str);
            System.out.println();
    }
    public static void imprimirLinea(String str) {
            int n = str.length(); //longitud del String
            for (int i = 1; i <= n + 4; i++){ //borde de arriba
                 System.out.print("#"); 
            }
 }
}