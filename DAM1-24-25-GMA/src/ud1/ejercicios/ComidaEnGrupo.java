package ud1.ejercicios;
/*
 * Un grupo de persoas salen a comer juntas. Al terminar piden la cuenta conjunta. Haz un
programa que tenga como entrada el número de personas y el importe total de la comida,
que podrá tener decimales, y que tenga como salida la cantidad a pagar por cada comensal
que se presentará con hasta 2 decimales.

 */
import java.util.Scanner;

public class ComidaEnGrupo {
    public static void main(String[] args) {
        int npersonas;
        double importeTotal;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el número de personas que sois en la comida: ");
        npersonas = sc.nextInt();

        System.out.print("Inserta el importe total de la comida: ");
        importeTotal = sc.nextDouble();
        sc.close();

        double importePersona = importeTotal/npersonas;

        System.out.printf("El importe total por persona es de: %.2f", importePersona);

    }
}
