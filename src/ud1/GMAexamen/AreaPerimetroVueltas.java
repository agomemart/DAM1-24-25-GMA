package ud1.GMAexamen;
//Adrián Gómez Martínez
import java.util.Scanner;
/*
 * Diseña un programa que calcule el área y el perímetro de un terreno con la forma de la
figura a partir de los datos de largo y ancho que se introducirán por teclado en metros.
Utiliza para los cálculos las fórmulas de área y perímetro de un círculo:
Área círculo = 𝑃𝐼 𝑥 𝑅2
Perímetro círculo = 2 𝑥 𝑃𝐼 𝑥 𝑅
Siendo 𝑅 el radio del círculo
En dicho terreno se pretende organizar una media maratón, es decir, una carrera en la que
los participantes deberán correr una distancia de 21.097 metros. El programa deberá
calcular y mostrar el número de vueltas completas que deberán dar los participantes y el
número de metros “sobrantes” redondeando hacia arriba
 */
public class AreaPerimetroVueltas {
    public static void main(String[] args) {
        final int DISTANCIA_MARATON = 21097;
        double largo;
        double ancho;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el largo: ");
        largo = sc.nextDouble();
        System.out.print("Inserta el ancho: ");
        ancho = sc.nextDouble();
        sc.close();

        double areaCirculo = Math.PI * Math.pow(ancho / 2, 2);
        double areaRectángulo = ancho * largo - areaCirculo; 
        double areaTotal = areaCirculo + areaRectángulo;

        double perimetroCirculo = 2 * Math.PI * (ancho / 2);
        double perimetroRectangulo = (ancho * 2 + largo * 2) - perimetroCirculo;
        double perimetroTotal = perimetroCirculo + perimetroRectangulo;

        double vueltas = DISTANCIA_MARATON / perimetroTotal;
        int vueltasEntero = (int)vueltas;
        double restoDistancia = (vueltas - vueltasEntero) * perimetroTotal;

        System.out.println("El area total de la figura es de: " + areaTotal);
        System.out.println("El perímetro total de la figura es de: " + perimetroTotal);
        System.out.println("El número de vueltas completas que tienen que dar los participantes sería de: " + vueltasEntero);
        System.out.printf("El número de metros sobrantes sería de: %.0f", restoDistancia);
    }
}
