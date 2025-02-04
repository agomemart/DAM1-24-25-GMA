package ud4.ejercicios;

public class EP0518Correcion {
    static boolean esMagica(int[][] t) {
        if (t == null || t.length == 0 || t[0].length != t.length) {
            return false;
        }

        Integer constanteMagica = null;
        for (int i = 0; i < t.length; i++) {
            int suma = 0;
            for (int j = 0; j < t[i].length; j++) {
                suma += t[i][j];
            }
            if (constanteMagica == null) {
                constanteMagica = suma;
            } else if (constanteMagica != suma) {
                return false;
            }
        }
        for (int i = 0; i < t.length; i++) {
            int suma = 0;
            for (int j = 0; j < t[i].length; j++) {
                suma += t[j][i];
            }
            if (constanteMagica != suma) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] t = {{1, 2, 3, 4}, {2, 3, 4, 1}, {3, 4, 1, 2}, {4, 1, 2, 3}};
        System.out.println(esMagica(t));
    }
}
