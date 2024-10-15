/*
 * Escribe un programa que permita convertir unidades de energía entre julios (J), calorías (cal) y kilovatios-hora (kWh). El usuario deberá ingresar la cantidad de energía, así como la unidad de origen y destino.

1 cal = 4.184 J
1 kWh = 3,600,000 J
El programa deberá realizar la conversión y mostrar el resultado.

 */
package ud1.ejercicios;
import java.util.Scanner;

public class ConversionEnergia {
    public static void main(String[] args) { 
        final double CALORIA_JULIO = 4.187;
        final double KWH_JULIO = 3600000;

        Scanner sc = new Scanner(System.in);
        System.out.print("Pulsa 1 si quieres introducir julios, 2 para calorias y 3 para KWh: ");
        int selecUdIntroducida = sc.nextInt();

        System.out.print("Introduce el número que quieres convertir: ");
        double numConversion = sc.nextDouble();

        System.out.print("Pulsa 1 si quieres convertir a julios, 2 para calorias y 3 para KWh: ");
        int selecUdDestino = sc.nextInt();
        sc.close();

        double julios = (selecUdIntroducida == 2) ? numConversion*CALORIA_JULIO :
                        (selecUdIntroducida == 3) ? numConversion*KWH_JULIO: 
                        numConversion;

        double conversion = (selecUdDestino == 2) ? julios/CALORIA_JULIO:
                            (selecUdDestino == 3) ? julios/KWH_JULIO:
                            numConversion;

        System.out.printf("El resultado de la conversión es de: %.2f", conversion);

    }
}