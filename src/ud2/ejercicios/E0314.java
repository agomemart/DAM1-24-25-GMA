package ud2.ejercicios;

/* Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10. */
public class E0314 {
    public static void main(String[] args) {
        int numUsuario = 0;
        System.out.println("Tablas de multiplicar:");
        for (numUsuario = 0; numUsuario <= 10; numUsuario++) {
            for (int contador = 0; contador <= 10; contador++){
                if (numUsuario > 0 & numUsuario <=10) {
                    int resulMultip = numUsuario * contador;
                    System.out.println(numUsuario + " x " + contador + " = " + resulMultip);
                }
            }
            System.out.println("---------------------");
        }
    }
}
