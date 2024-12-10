package ud2.practicando;

import java.util.Scanner;

public class AdivinaNumero {
    public static void numAleatorio() {
        Scanner sc = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * (100 - 1 + 1)) + 1;
        int numUsuario;
                do {
                    System.out.println("Adivina el número aleatorio entre 1 y 100: ");
                    numUsuario = sc.nextInt();
                    if (numUsuario < 1 || numUsuario > 100) {
                        System.out.println("Introduce un número entre 1 y 100");
                    } else if (numUsuario == aleatorio) {
                        System.out.println("Has acertado!! :)");
                    } else if (numUsuario > aleatorio) {
                        System.out.println("Pista: Inserta un número menor");
                    } else if (numUsuario < aleatorio){
                        System.out.println("Pista: Inserta un número mayor");
                    } else {
                        System.out.println("Has fallado. Vuelve a intentarlo. :(");
                    }
                } while (numUsuario != aleatorio);
        sc.close();
    }
    public static void main(String[] args) {
        numAleatorio();
    }
}
