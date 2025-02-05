package ud4.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
*  Implementa una función que dado un verbo en infinitivo lo conjugue en presente y
devuelva un array de String con los resultados de la conjugación para cada una de las 6
personas verbales.
*
* */
public class ConjugarVerbos {
    static String[] conjugarPresente(String verbo) {
        String[] terminaciones1 = {"o", "as", "a", "amos", "ais", "an"};
        String[] terminaciones2 = {"o", "es", "e", "mos", "éis", "en"};
        String[] terminaciones3 = {"o", "es", "e", "imos", "ís", "en"};

        String verboConjugar = verbo.substring(0, verbo.length() - 2);

        String[] verboConjugado = new String[terminaciones1.length];

        if (verbo.endsWith("ar")) {
            for (int i = 0; i < terminaciones1.length; i++) {
                verboConjugado[i] = verboConjugar + terminaciones1[i];
            }
        } else if (verbo.endsWith("er")){
            for (int i = 0; i < terminaciones1.length; i++) {
                verboConjugado[i] = verboConjugar + terminaciones2[i];
            }
        } else {
            for (int i = 0; i < terminaciones1.length; i++) {
                verboConjugado[i] = verboConjugar + terminaciones3[i];
            }
        }
        return verboConjugado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un verbo: ");
        String verbo = sc.nextLine();

        System.out.println(Arrays.toString(conjugarPresente(verbo)));
    }

}
