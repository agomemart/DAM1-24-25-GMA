//Adrián Gómez Martínez
package ud4.gmaexamenrec;

public class Sumas {
    static int[] sumas(int t[]) {
        int sumaElementos = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        if (t == null) {
            return null;
        }

        for (int i = 0; i < t.length; i++) {
            sumaElementos += t[i];
            if(t[i] % 2 == 0) {
                sumaPares += t[i];
            } else {
                sumaImpares += t[i];
            }
        }

        int[] arrayResultante = {sumaElementos, sumaPares, sumaImpares};

        return arrayResultante;
    }
}