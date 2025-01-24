package ud4.ejercicios;

import java.util.Scanner;

/*
* Es bien sabido que los monjes, en las abadías, se levantan muy temprano para rezar durante
maitines, observando la salida del sol.
La localización de las abadías y monasterios es por tanto de vital importancia para que se
pueda observar el sol aparecer en el horizonte. Los monjes prefieren las localizaciones que no
tengan montañas altas hacia el Este, que les impedirían ver salir el sol.
Esto es un problema especial en los Pirineos, la cordillera montañosa que va de Oeste a Este y
separa la Península Ibérica del resto del continente europeo. Los Pirineos están llenos de
lugares tranquilos y mágicos, por lo que son emblemáticos para la meditación y el rezo. Pero al
estar orientados de Oeste a Este, tienen una limitación en el número de localizaciones
candidatas a construir abadías, es decir las que reciben el sol en los primeros momentos de la
mañana. Este problema lo sufren también otras cordilleras en todo el mundo. Es por eso que los
monjes sólo construyen abadías en aquellas montañas que non tengan montañas más altas al
este que les puedan hacer sombra durante la mañana.
Realiza un programa que permita introducir por teclado las alturas (en metros, sin decimales) de
las montañas que componen una determinada cordillera montañosa, de Oeste a Este. La
entrada terminará cuando se introduzca una altura negativa o se llegue al límite de 1000
montañas.
Sólo se pueden construir abadías en las cimas que sean más altas que todas las montañas que
tengan al Este.
El programa debe indicar el número máximo de abadías que se pueden construir en esa
cordillera montañosa y adicionalmente el listado de índices de montañas en las que se pueden
construir (comenzando en 1 para la montaña situada más al Oeste).
* */
public class AbadiasPirenaicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alturasMontaña = new int[0];
        int montañaMayor = 0;
        int alturaMontaña = 0;
        int contador = 0;

        //Inserción de datos
        do {
            System.out.print("Introduce la altura de las montañas de oeste a este: ");
            alturaMontaña = sc.nextInt();
            alturasMontaña[contador] = alturaMontaña;
            contador++;
            if (alturaMontaña <= 0) {
                break;
            }
        } while(alturaMontaña <= 0 || contador == 999);

        //Cálculo montañas más altas del derecha a izquierda
        for (int i = alturasMontaña.length; i > 0 ; i--) {
            if (alturasMontaña[alturasMontaña.length] > alturasMontaña[alturasMontaña.length - 1]) {
                montañaMayor = alturasMontaña[alturasMontaña.length];
            } else {
                montañaMayor = alturasMontaña[i + 1];
            }
        }

        //Muestro montaña más alta
        System.out.println("La montaña más alta en la que se pueden construir abadias es: " + montañaMayor);


    }
}
