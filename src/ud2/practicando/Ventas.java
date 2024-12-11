package ud2.practicando;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        double venta;
        char categoria;
        double desayuno = 0;
        double comida = 0;
        double merienda = 0;
        double cena = 0;
        double copa = 0;
        int contadorComidas = 0;

        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Inserta el importe de la venta: ");
                venta = sc.nextDouble();
                sc.nextLine();
                System.out.print("Elije entre D (desayuno), A (comida), M (merienda), I (Cena) y C (copas): ");
                categoria = sc.nextLine().toUpperCase().charAt(0);
                    switch (categoria) {
                        case 'D':
                            desayuno = desayuno += venta;
                            break;
                        case 'A':
                            comida = comida += venta;
                            contadorComidas++;
                            break;
                        case 'M':
                            merienda = merienda += venta;
                            break;
                        case 'I':
                            cena = cena += venta;
                            break;
                        case 'C':
                            copa = copa += venta;
                            break;
                        default:
                            System.out.println("Error, caracter insertado no válido.");
                            break;
                    }
            } while (categoria != 'N');
            double mediaTotalDia = (desayuno + comida + merienda + cena + copa) / 5;
            double mediaComidas = (comida / contadorComidas);
            if (mediaTotalDia > mediaComidas) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Error: dato en formato incorrecto");
        }
        sc.close();
    }
}
