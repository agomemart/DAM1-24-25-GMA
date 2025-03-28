//Adrián Gómez Martínez
package ud4.gmaexamenrec;

public class DiagonalesIguales {
    static boolean diagonalesIguales(int[][] t) {
        if (t == null || t.length == 0) {
            return false;
        }
        if (t.length != t[0].length) {
            return false;
        }

        int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < t.length; i++) {
            sumaDiagonalPrincipal += t[i][i];
        }

        int sumaDiagonalSecundaria = 0;
        for (int j = 0; j < t.length; j++) {
            sumaDiagonalSecundaria += t[t.length - 1 - j][j];
        }

        if (sumaDiagonalPrincipal == sumaDiagonalSecundaria) {
            return true;
        }

        return false;
    }
}