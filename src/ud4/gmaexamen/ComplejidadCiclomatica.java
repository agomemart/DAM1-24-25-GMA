package ud4.gmaexamen;

public class ComplejidadCiclomatica {
    static int complejidadCiclomatica(int[][] grafo) {
        int complCiclo = 1;
        if (grafo.length == 0 || grafo[0].length == 0) {
            return 0;
        }
        for (int i = 0; i < grafo.length; i++) {
            for (int j = 0; j < grafo[i].length; j++) {
                if (grafo[i].length >= 2) {
                    complCiclo ++;
                    break;
                }
            }
        }
        return complCiclo;
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
