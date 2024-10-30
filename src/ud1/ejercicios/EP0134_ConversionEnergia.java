package ud1.ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa que permita convertir unidades de energía entre julios (J), calorías
(cal) y kilovatios-hora (kWh). El usuario deberá ingresar la cantidad de energía, así como la
unidad de origen y destino.
● 1 cal = 4.184 J
● 1 kWh = 3,600,000 J
El programa deberá realizar la conversión y mostrar el resultado.
 */
public class EP0134_ConversionEnergia {
    public static void main(String[] args) {
        final double CAL_JULIOS = 4.184;
        final double KW_JULIOS = 3600000;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el número a convertir: ");
        double num = sc.nextDouble();

        System.out.print("Inserta 'j' si vas a insertar julios, 'c' para calorías y 'k' para kwh: ");
        char udOrigen = sc.next().charAt(0);

        System.out.print("Inserta 'j' para convertir a julios, 'c' para calorías y 'k' para kwh: ");
        char udDestino = sc.next().charAt(0);
        sc.close();

        double julios = (udOrigen == 'j') ? num :
                        (udOrigen == 'c') ? num*CAL_JULIOS :
                        (udOrigen == 'k') ? num*KW_JULIOS : 
                        num;

        double resultado =  (udDestino == 'j') ? julios :
                            (udDestino == 'c') ? julios/CAL_JULIOS :
                            (udDestino == 'k') ? julios/KW_JULIOS : 
                            num;
        
        String udResultado = (udDestino == 'j') ? "julios" :
                            (udDestino == 'c') ? "calorías" :
                            (udDestino == 'k') ? "KWh" :
                            "unidad desconocida";

        System.out.printf("La conversión del número insertado sería de: %.2f %s", resultado, udResultado);
    }
}
