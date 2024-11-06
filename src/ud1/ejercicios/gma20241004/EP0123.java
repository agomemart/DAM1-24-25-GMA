package ud1.ejercicios.gma20241004;

import java.util.Scanner;

/**
 * Escribe un programa que convierta unidades de masa entre kilogramos y libras o viceversa. El programa solicitará al usuario la cantidad de masa y la unidad de medida origen (kilogramos o libras).
1 kilogramo = 1000 gramos
1 libra = 453.592 gramos
El programa deberá manejar las conversiones automáticamente y mostrar el resultado al usuario. Utiliza el operador ternario para evaluar la unidad de medida introducida por el usuario. El programa mostrará por pantalla el resultado con la unidad de medida adecuada.

 */
public class EP0123 {
    public static void main(String[] args) {
        double masaOrigen, masaDestino;
        //byte unidadMedida;
        final double GRAMOS_LIBRA = 453.592;
        final double KILOS_LIBRAS = 1000 / GRAMOS_LIBRA;
        final double LIBRAS_KILOS = GRAMOS_LIBRA / 1000;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la masa de origen: ");
        masaOrigen = sc.nextDouble();
        sc.nextLine();

        char unidadMedida;
        System.out.print("Introduce la unidad de medida de origen (K=kg L=lb): ");
        unidadMedida = sc.nextLine().charAt(0);
        /*System.out.print("Introduce la unidad de medida de origen (1=kg 2=lb): ");
        unidadMedida = sc.nextByte();*/
        sc.close();

        masaDestino = unidadMedida == 'K' ? masaOrigen * KILOS_LIBRAS : masaOrigen * LIBRAS_KILOS;
        System.out.printf("La masa en la medida de destino es %.3f %s", masaDestino, unidadMedida == 1 ? "libras": "kilos");
    }
}
