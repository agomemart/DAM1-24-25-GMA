package ud1.ejercicios.gma20241010;

import java.util.Scanner;

/*
 * Desarrolla un programa en Java que convierta unidades de almacenamiento entre bytes,
kilobytes (KB), megabytes (MB) y gigabytes (GB). Solicita al usuario la cantidad de datos y
la unidad de origen y destino.
● 1 KB = 1024 bytes
● 1 MB = 1024 KB
● 1 GB = 1024 MB
El programa deberá realizar la conversión correspondiente y mostrar el resultado.

 */
public class EP0133_ConversionAlmacenamientoDatos {
    public static void main(String[] args) {
        

        System.out.print("Introduce un valor que quieras convertir: ");
        Scanner sc = new Scanner(System.in);
        double numInsertado = sc.nextDouble();

        System.out.print("Pulsa 1 si insertaste B, 2 para KB, 3 para MB y 4 para GB: ");
        int udOrigen = sc.nextInt();

        System.out.print("Pulsa 1 si quieres convertir a B, 2 para KB, 3 para MB y 4 para GB: ");
        int udDestino = sc.nextInt();
        sc.close();

        double cantidadBytes = (udOrigen == 2) ? numInsertado*1024 : 
                        (udOrigen == 3) ? numInsertado * 1024 * 1024 :
                        (udOrigen == 4) ? numInsertado * 1024 * 1024 * 1024 : 
                        numInsertado;

        double resultado = (udDestino == 2) ? cantidadBytes / 1024 :
                        (udDestino == 3) ? cantidadBytes / (1024 * 1024) :
                        (udDestino == 4) ? cantidadBytes / (1024 * 1024 * 1024) :
                        cantidadBytes;

        System.out.printf("El resultado de la conversión que has insertado sería: %.2f", resultado);
    }
}
