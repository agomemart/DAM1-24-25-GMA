package ud3.ejercicios;

import java.util.Scanner;

public class EP0717 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el DNI: ");
        String dni = sc.nextLine();
        System.out.print("Inserta el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Inserta la posición: ");
        Posicion posicion = Posicion.valueOf(sc.nextLine().toUpperCase());

        Jugador j1 = new Jugador(dni, nombre, posicion);
        j1.mostrar();
        System.out.print("Cambiar posición: ");
        Posicion posicion2 = Posicion.valueOf(sc.nextLine().toUpperCase());
        j1.cambiar(posicion2);
        j1.mostrar();
        sc.close();
    }
}
