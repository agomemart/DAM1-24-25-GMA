package contornos;

public class MathUtils {
        public static int factorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("O número debe ser positivo");
            }
            int resultado = 1;
            for (int i = 1; i <= n; i++) { // Erro: debería ser i++
                resultado *= i;
            }
            return resultado;
        }
}
