//Adrián Gómez Nartínez
package ud4.gmaexamen;

public class ComplejidadCiclomática {
    static int complejidadCiclomatica(int[][] grafo) {
        int region = 0;
        if (grafo == null || grafo.length == 0) {
            return -1;
        }

        for (int i = 0; i < grafo.length; i++) {
            if (grafo[i].length != 0) {
                if (i + 1 >= grafo.length || i - 1 <= 0){
                    if (grafo[i].length == 1 || grafo[i + 1].length > 1) {
                        region++;
                    } else if (grafo[i].length > 1 || grafo[i - 1].length < 1){
                        region++;
                    }
                }

            }
        }

        return region;
    }

    public static void main(String[] args) {
        int[][] grafo1 = {
                {1},
                {3, 5},
                {1},
                {2, 4},
                {6},
                {6},
                {}
        };
        int[][] grafo2 = {
                {1, 6},
                {2, 5},
                {3, 4},
                {4},
                {1},
                {0},
                {}
        };
        System.out.println(complejidadCiclomatica(grafo1));
        System.out.println(complejidadCiclomatica(grafo2));
    }
}
