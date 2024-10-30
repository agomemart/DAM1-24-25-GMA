package ud1.GMAexamen;
//Adrián Gómez Martínez
import java.util.Scanner;

/*
 * Tres amig@s deciden juntar el dinero en efectivo que llevan encima para comprar un
artículo para compartir (por ejemplo, una pelota, un libro, un disco, etc.). Haz un programa
que permita introducir el precio del artículo (en euros) y el dinero que aporta cada amig@ y
que informe si el dinero aportado es suficiente o no para adquirir el artítulo.
Si el dinero no es suficiente el programa informará de cuánto falta, y si sobra, se indicará el
importe del dinero sobrante que guardará como bote para futuras compras conjuntas.

 */
public class CompraConjunta {
    public static void main(String[] args) {
        double articulo;
        double aporteAmigo1;
        double aporteAmigo2;
        double aporteAmigo3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el importe del artículo (euros): ");
        articulo = sc.nextDouble();

        System.out.print("Introduce cuanto va a aportar el primer amigo (euros): ");
        aporteAmigo1 = sc.nextDouble();
        System.out.print("Introduce cuanto va a aportar el segundo amigo (euros): ");
        aporteAmigo2 = sc.nextDouble();
        System.out.print("Introduce cuanto va a aportar el tercer amigo (euros): ");
        aporteAmigo3 = sc.nextDouble();
        sc.close();

        double aporteTotal = aporteAmigo1 + aporteAmigo2 + aporteAmigo3;

        String puedeComprar = (articulo <= aporteTotal) ? "Se puede comprar el artículo. Sobrarían: " :
                              "No se puede comprar el artículo porque no llega el dinero aportado. Faltan: ";

        double resultado = (articulo <= aporteTotal) ? aporteTotal - articulo : articulo - aporteTotal;

        System.out.println(puedeComprar + resultado + " euros");

    }
}
