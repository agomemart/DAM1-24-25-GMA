package ud2.practicas;

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
        while (numIntroducido <= 0) {
            System.out.println("Número introducido no válido");
            return false;
        }
        return true;
    }

    public static boolean numIntIntroducido(int numIntroducido) {
        while (numIntroducido <= 0) {
            System.out.println("Número introducido no válido");
            return false;
        }
        return true;
    }

    public static void procesarPagoEnEfectivo(double efectivoCliente, double totalCompra) {
        Scanner sc = new Scanner(System.in);
        do {
            if (efectivoCliente < totalCompra) {
                System.out.print("La cantidad entregada no es suficiente. Introduzca otra cantidad: ");
                efectivoCliente = sc.nextDouble();
            }
        } while (efectivoCliente < totalCompra);

        double cambio = efectivoCliente - totalCompra;
        if (efectivoCliente == totalCompra) {
            System.out.println("Pago exacto. No hay cambio");
        } else {
            System.out.printf("Su cambio es de: %.2f euros \n", cambio);
        }
        sc.close();
    }

    public static void desglosarCambio(double cambio) {
        int euros = (int) cambio;
        int centimos = (int) Math.round((cambio - euros) * 100);

        System.out.println("Desglose de cambio:");

        euros = desgloseEuros(euros);

        centimos = desgloseCentimos(centimos);

        if (euros == 0 && centimos == 0) {
            System.out.println("El cambio ha sido completamente desglosado.");
        }
    }

    private static int desgloseEuros(int euros) {
        euros = desglosarDenominacion(euros, 50, "billetes de 50€");
        euros = desglosarDenominacion(euros, 20, "billetes de 20€");
        euros = desglosarDenominacion(euros, 10, "billetes de 10€");
        euros = desglosarDenominacion(euros, 5, "billetes de 5€");
        euros = desglosarDenominacion(euros, 2, "monedas de 2€");
        euros = desglosarDenominacion(euros, 1, "monedas de 1€");
        return euros;
    }

    private static int desgloseCentimos(int centimos) {
        centimos = desglosarDenominacion(centimos, 50, "monedas de 50 céntimos");
        centimos = desglosarDenominacion(centimos, 20, "monedas de 20 céntimos");
        centimos = desglosarDenominacion(centimos, 10, "monedas de 10 céntimos");
        centimos = desglosarDenominacion(centimos, 5, "monedas de 5 céntimos");
        centimos = desglosarDenominacion(centimos, 2, "monedas de 2 céntimos");
        centimos = desglosarDenominacion(centimos, 1, "monedas de 1 céntimo");
        return centimos;
    }

    private static int desglosarDenominacion(int cantidad, int denominacion, String descripcion) {
        int numElementos = cantidad / denominacion;
        if (numElementos > 0) {
            System.out.printf("%d %s%n", numElementos, descripcion);
            cantidad %= denominacion;
        }
        return cantidad;
    }

    public static void main(String[] args) {
        double precioProducto = 0;
        double precioTotal = 0;
        int udPruducto, menuPago;
        boolean continuarCompra;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(
                    "Bienvenido a la caja del supermercado! Introduzca el precio del producto y las unidades. Cuando finalice pulse -1.");
            while (precioProducto != -1) {
                System.out.print("Introduce el precio del producto: ");
                precioProducto = sc.nextDouble();
                System.out.print("Introduce las unidades del producto: ");
                udPruducto = sc.nextInt();

                if (numDoubleIntroducido(precioProducto) == true && numIntIntroducido(udPruducto) == true) {
                    precioTotal += importeTotalProducto(precioProducto, udPruducto);

                    System.out.printf("Total artículos: %.2f euros \n", precioTotal);
                } else {
                    System.out.println("Por favor, introduzca los datos correctamente :)");
                }

                System.out.printf("El total de la compra es de: %.2f euros \n", precioTotal);

            }
            do {
                System.out.print("Como desea pagar: (Pulse 1 para tarjeta y 2 para efectivo: ");
                menuPago = sc.nextInt();
                if (numIntIntroducido(menuPago) == true) {
                    switch (menuPago) {
                        case 1:
                            System.out.println("Ha seleccionado pago con tarjeta");
                            System.out.println("Gracias por su compra! Hasta pronto!");
                            break;
                        case 2:
                            System.out.println("Ha seleccionado pago con efectivo");
                            System.out.print("Introduce el importe entregado en efectivo: ");
                            double efectivoCliente = sc.nextDouble();
                            procesarPagoEnEfectivo(efectivoCliente, precioTotal);
                            desglosarCambio(efectivoCliente - precioTotal);
                            break;
                        default:
                            System.out.println("Introduce 1 o 2");
                            break;
                    }
                }

            } while (menuPago != 1 && menuPago != 2);
            System.out.print("Desea realizar otra compra? 1 (Si) 2 (No): ");
            continuarCompra = sc.nextInt() == 1;

        } while (continuarCompra);
        System.out.println("Gracias por su compra. Que tenga un buen día!");
        sc.close();
    }
}
