package ud1.ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa en Java que calcule el precio final de un producto después de aplicar un descuento basado en su precio original. 
 * Utiliza operadores ternarios para determinar el porcentaje de descuento y calcular el precio final.
Reglas de descuento:
Si el precio es menor a 50€, no hay descuento.
Si el precio es entre 50€ y 100€, el descuento es del 10%.
Si el precio es entre 100€ y 200€, el descuento es del 20%.
Si el precio es mayor a 200€, el descuento es del 30%.
Requisitos:
El programa debe solicitar el precio original del producto al usuario.
Debe utilizar operadores ternarios para calcular el descuento y el precio final.
Muestra el precio original, el descuento aplicado y el precio final.
 */
public class DescuentoProducto {
    public static void main(String[] args) {
        double precioProducto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        precioProducto = sc.nextDouble();
        sc.close();

        String descuentoAplicadoS = (precioProducto >= 0 && precioProducto < 50 ) ? "No se aplica descuento" :
                                   (precioProducto >= 50 && precioProducto < 100) ? "El descuento a aplicar es del 10%" :
                                   (precioProducto >= 100 && precioProducto < 200) ? "El descuento a aplicar es del 20%" :
                                   (precioProducto >= 200) ? "El descuento a aplicar es del 30%" :
                                   "Numero introducido erroneo";

        double descuentoAplicadoD = (precioProducto >= 0 && precioProducto < 50 ) ? precioProducto :
                                   (precioProducto >= 50 && precioProducto < 100) ? precioProducto - precioProducto*(10/100.0) :
                                   (precioProducto >= 100 && precioProducto < 200) ? precioProducto - precioProducto*(20/100.0) :
                                   (precioProducto >= 200) ? precioProducto - precioProducto*(30/100.0) :
                                   precioProducto;
        
        System.out.println(descuentoAplicadoS + " por lo que el precio final del producto sería de: " + descuentoAplicadoD);
        System.out.println("El predio original era de: " + precioProducto);
    }
}
