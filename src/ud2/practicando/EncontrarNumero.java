package ud2.practicando;

public class EncontrarNumero {
    public static int numeroCercano(int t) {
        int arriba = t;
        int abajo = t;

        while (true) {
            if(arriba % 3 == 0 || arriba % 5 == 0) {
                return arriba;
            }
            if (abajo > 0 && abajo % 3 == 0 || abajo % 5 == 0) {
                return abajo;
            }
            arriba++;
            abajo--;
        }
        
        
    }
    public static void main(String[] args) {
        System.out.println(numeroCercano(44));
    }
}
