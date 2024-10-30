package ud1.ejercicios;

import java.util.Scanner;

/*
 * Desarrolla un programa en Java que convierta unidades de presión entre pascales (Pa), atmósferas (atm) y milímetros de mercurio (mmHg). 
 * El usuario deberá ingresar la presión y las unidades de origen y destino.
1 atm = 101,325 Pa
1 atm = 760 mmHg
El programa deberá realizar la conversión correcta según los datos ingresados.
 */
public class EP0135_ConversionPresion {
    public static void main(String[] args) {
        double numConversion;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número que quieres convertir: ");
        numConversion = sc.nextDouble();

        System.out.print("Pulsa 'p' si introdujiste pascales, 'a' para atmósferas y 'm' para mm de mercurio: ");
        char udOrigen = sc.next().charAt(0);
        System.out.print("Pulsa 'p' para convertir a pascales, 'a' para atmósferas y 'm' para mm de mercurio: ");
        char udDestino = sc.next().charAt(0);
        sc.close();

        double atmosferas = (udOrigen == 'a') ? numConversion :
                            (udOrigen == 'p') ? numConversion/101.325 :
                            (udOrigen == 'm') ? numConversion/760 :
                            numConversion;
        
        double resultado = (udDestino == 'a') ? atmosferas :
                           (udDestino == 'p') ? atmosferas*101.325 :
                           (udDestino == 'm') ? atmosferas*760.0 :
                           atmosferas;
        
        String udResultado = (udDestino == 'a') ? "atmósferas" :
                             (udDestino == 'p') ? "pascales" :
                             (udDestino == 'm') ? "milímetros de mercurio" :
                            "la unidad introducida es erronea";
        
        System.out.printf("La conversión a %s es de %.2f", udResultado, resultado);

    }
}
