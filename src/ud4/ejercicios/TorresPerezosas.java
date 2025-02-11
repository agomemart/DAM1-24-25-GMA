package ud4.ejercicios;

public class TorresPerezosas {
    public static void main(String[] args) {
        char[][] tablero1 = {
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'}
        };
        char[][] tablero2 = {
                {'.', '.', '.'},
                {'X', '.', '.'},
                {'.', '.', '.'}
        };
        char[][] tablero3 = {
                {'.', '.', '.'},
                {'.', 'X', '.'},
                {'.', '.', '.'}
        };

        System.out.println(caminosDistintos(tablero1)); //6
        System.out.println(caminosDistintos(tablero2)); //3
        System.out.println(caminosDistintos(tablero3)); //2
    }

    private static int caminosDistintos(char[][] t) {

        int[][] tr = new int[t.length][t[0].length];

        for (int j = 0; j < t.length ; j++) {
            for (int i = t.length - 1; i >= 0; i--) {
                if (j == 0  && i == t.length - 1){
                    tr[i][j] = 1;
                } else if (t[i][j] != 'X'){
                    if (j > 0) {
                        tr[i][j] = tr[i][j-1];
                    }
                    if (i < t.length - 1) {
                        tr[i][j] += tr[i+1][j];
                    }
                }
            }
        }

        return tr[0][tr.length - 1];
    }
}
