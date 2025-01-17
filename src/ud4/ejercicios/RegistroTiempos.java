package ud4.ejercicios;
/*
 * Crea un programa que registre y almacene los segundos transcurridos 
desde el inicio del programa hasta cada vez que se pulsa la tecla Enter. La entrada de 
tiempos finalizará cuando se introduzca la letra “F” o “f”, contabilizando también esta 
entrada en el registro. 
 
Imagina que se trata del cronómetro utilizado por un profesor de Educación física para 
cronometrar los segundos que tarda el alumnado en dar 5 vueltas al campo. 
 
Al terminar la introducción de datos, el programa imprimirá los tiempos recogidos (en 
segundos), calculará la media y contabilizará el número de tiempos registrados por encima 
de la media, imprimiendo los resultados. 
 
Ejemplos:  
1.  Se inicia el programa y el usuario pulsa Enter al cabo de 3, 7, y 12 segundos, e 
introduce una “F” 20 segundos después de iniciado el programa.  
El programa imprimirá lo siguiente: 
 
[3, 7, 12, 20] 
Media = 10.5 
Número de registros por encima de la media: 2 
 
2.  Se inicia el programa y el usuario introduce una “F” al cabo de 5 segundos.  
El programa imprimirá lo siguiente: 
 
[5] 
Media = 5 
Número de registros por encima de la media: 0 
 
Nota: Usa el método now() de la clase LocalTime para obtener la hora del sistema. 
 */

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class RegistroTiempos {
    public static void main(String[] args) {
        int[] cronometro = new int[0];
        
        Scanner sc = new Scanner(System.in);
        String entrada;
        
        System.out.println("Pulsa enter para iniciar el croonometro");
        
        LocalTime horaInicio = LocalTime.now();
        do {
        entrada = sc.nextLine();
        LocalTime horaFin = LocalTime.now();
            int segundosTotales = horaFin.toSecondOfDay() - horaInicio.toSecondOfDay();
            cronometro = Arrays.copyOf(cronometro, cronometro.length);
            cronometro[cronometro.length - 1] = segundosTotales;
            System.out.println("Segundos transcurridos: " + segundosTotales);
        } while(entrada.equalsIgnoreCase("F"));
        System.out.println(Arrays.toString(cronometro));
        int suma = 0;
        for (int t : cronometro) {
            suma += t;
        }
        double media = (double)suma / cronometro.length;
        System.out.println("Media: " + media);

        int contMayores = 0;
        for (int t : cronometro) {
            if (t > media) {
                contMayores++;
            }
        }
        System.out.println("Por encima de la media: " + contMayores);
        
        sc.close();
    }
}
