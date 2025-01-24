package ud4.ejercicios;

import java.util.Arrays;
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
    static int[] getMontañasAbadias(int[] t) {
        int[] abadias = new int[0];
        int maxAltitud = -1;

        for (int i = t.length - 1; i >= 0; i--) {
            if (t[i] > maxAltitud) {
                maxAltitud = t[i];
                abadias = Arrays.copyOf(abadias, abadias.length + 1);
                abadias[abadias.length - 1] = i + 1;
            }
        }
        Arrays.sort(abadias);
        return abadias;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_MONTAÑAS = 1000;
        int[] altitudes = new int[0];

        //Lectura anticipada
        System.out.print("Introduce la altura de las montañas de oeste a este: ");
        int alturaMontaña = sc.nextInt();

        while (alturaMontaña >= 0 && altitudes.length < MAX_MONTAÑAS) {
            altitudes = Arrays.copyOf(altitudes, altitudes.length + 1);
            altitudes[altitudes.length - 1] = alturaMontaña;
            //Lectura repetida
            alturaMontaña = sc.nextInt();
        }

        System.out.println(Arrays.toString(altitudes));
        if (altitudes.length > 0) {
            int[] abadias = getMontañasAbadias(altitudes);
            System.out.println("Se pueden construir " + abadias.length + " abadias en la cordillera.");
        } else{
            System.out.println("No hay montañas");
        }
    }
}
