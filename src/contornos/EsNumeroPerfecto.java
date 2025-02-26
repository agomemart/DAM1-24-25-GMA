package contornos;

public class EsNumeroPerfecto {
    public boolean esNumeroPerfecto(int num) {
        int divisor, sumaDivisores;
        divisor = 1;
        sumaDivisores = 0;

        while (divisor < num / 2) {
            if (num % divisor == 0) {
                sumaDivisores = sumaDivisores + divisor;
            }
            divisor++;

        }
        if (num == sumaDivisores) {
            return true;
        } else {
            return false;
        }
    }


}
