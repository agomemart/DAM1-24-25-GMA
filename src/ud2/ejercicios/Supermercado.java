package ud2.ejercicios;

import java.util.Scanner;

/*
 * Implementa un programa que simule el proceso de cobro en la caja de un supermercado.

Para calcular el importe total que debe pagar cada cliente el programa solicitará introducir el precio de cada producto, 
expresado en euros con hasta 2 decimales, y la cantidad de unidades del mismo, expresado como un número entero.
El programa deberá controlar los posibles errores o excepciones en la entrada de datos por teclado, informando al usuario y permitiendo repetir la entrada. 
La condición para finalizar la introducción de productos queda a criterio del programador. Puede ser, por ejemplo, introducir un importe igual a cero o negativo.
Una vez terminado de introducir los productos, el programa mostrará el importe total de la compra y solicitará al usuario el medio de pago elegido por el cliente: 
“con tarjeta” o “en efectivo”.
Si el método de pago elegido es “con tarjeta”, se dará por finalizada la compra de ese cliente.
Si el método de pago elegido es “en efectivo”, entonces se solicitará el importe pagado por el cliente y se calculará el cambio a devover, 
desglosando dicha cantidad en billetes y monedas de € y de 1 céntimos de euro.
Una vez finalizada la compra de un cliente el programa solicitará si se desea repetir el proceso para un nuevo cliente.

Implementa el programa utilizando programación modular para descomponer el problema en subproblemas más sencillos implementados con funciones.

 */
public class Supermercado {
    public static double importeTotalProducto(double precio, int ud) {
        return precio * ud;
    }
    public static void metodoPago(int menuPago) {
        switch (menuPago) {
            case 1:
                System.out.println("Pago con tarjeta. Compra finalizada.");
                break;
            case 2:
                System.out.println("Pago con efectivo");
                break;
            default:
                System.out.println("Método de pago introducido incorrectamente");
                break;
        }
    }
    public static boolean numDoubleIntroducido(double numIntroducido) {
        if (numIntroducido <= 0 ) {
            System.out.println("Número introducido no válido");
            return false;
        } else {
            return true;
        }
    }
    public static boolean numIntIntroducido(int numIntroducido) {
        if (numIntroducido <= 0 ) {
            System.out.println("Número introducido no válido");
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        double precioProducto = 0; 
        double precioTotal = 0;
        int udPruducto, menuPago;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la caja del supermercado! Introduzca el precio del producto y las unidades. Cuando finalice pulse -1.");
        while (precioProducto != -1) {
            System.out.print("Introduce el precio del producto: ");
            precioProducto = sc.nextDouble();
            System.out.print("Introduce las unidades del producto: ");
            udPruducto = sc.nextInt();

            if (numDoubleIntroducido(precioProducto) == true && numIntIntroducido(udPruducto) == true) {
                precioTotal += importeTotalProducto(precioProducto, udPruducto);
                
                System.out.printf("Total artículos: %.2f euros \n", precioTotal);
            } else {
                System.out.println("Introduzca datos correctos para la próxima :)");
            }
        }

        System.out.printf("El total de la compra es de: %.2f euros \n", precioTotal);
        System.out.print("Como desea pagar: (Pulse 1 para tarjeta y 2 para efectivo: ");
        menuPago = sc.nextInt();

        if (numIntIntroducido(menuPago) == true) {
            metodoPago(menuPago);
            if (menuPago == 2) {
                System.out.print("Entrega efectivo: ");
                double efectivoCliente = sc.nextDouble();
                numDoubleIntroducido(efectivoCliente);
                if (efectivoCliente < precioTotal) {
                    System.out.println("La cantidad pagada no es suficiente para pagar toda la compra. Introduzca más efectivo.");
                } else {
                    System.out.println("Procesando compra...");
                    double devolucionEfectivo = efectivoCliente - precioTotal;
                    if (devolucionEfectivo == 0) {
                        System.out.println("Gracias por su compra! Que tenga un buen dia :)");
                    } else {
                        System.out.printf("Su cambio: %.2f euros", devolucionEfectivo);
                    }
                }
            }
        } else {
            System.out.println("Introduzca datos correctos para la próxima :)");
        }
        sc.close();
    }
}
