package ud4.ejercicios;

import java.util.Scanner;

public class CuantasLlevo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String entrada = sc.nextLine();
            String[] numeros = entrada.split(" ");

            // Caso especial de salida
            if (numeros[0].equals("0") && numeros[1].equals("0")) {
                break;
            }

            String num1 = numeros[0];
            String num2 = numeros[1];

            // Aseguramos que los dos números tengan la misma longitud
            int maxLen = Math.max(num1.length(), num2.length());
            num1 = String.format("%" + maxLen + "s", num1).replace(' ', '0');
            num2 = String.format("%" + maxLen + "s", num2).replace(' ', '0');

            int acarreo = 0;
            int acarreosTotales = 0;

            // Recorremos de derecha a izquierda
            for (int i = maxLen - 1; i >= 0; i--) {
                int digito1 = num1.charAt(i) - '0'; // Convertimos de char a int
                int digito2 = num2.charAt(i) - '0'; // Convertimos de char a int

                int suma = digito1 + digito2 + acarreo;

                if (suma >= 10) {
                    acarreosTotales++;
                    acarreo = 1; // Si hay acarreo, lo sumamos a la siguiente posición
                } else {
                    acarreo = 0; // No hay acarreo si la suma es menor que 10
                }
            }

            // Mostramos el resultado para este caso de prueba
            System.out.println(acarreosTotales);
        }
        sc.close();

    }
}
