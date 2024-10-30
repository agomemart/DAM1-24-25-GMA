package ud2.ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa para emitir la factura de compra de un producto, introduciendo el precio del producto y el número de unidades compradas. 
 * La factura deberá añadir al total un IVA (Impuesto del Valor Añadido) del 21%. Si el precio final con IVA es superior a 100 euros se aplicará un descuento del 5%.

Ejemplos para pruebas:
Precio = 10 €, Unidades = 5 => Precio Final = 60,50 €
Precio = 20 €, Unidades = 7 => Precio Final = 160,93 €

 */
public class Factura {
    public static void main(String[] args) {
        double precioProducto;
        int udCompradas;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        precioProducto = sc.nextDouble();
        System.out.print("Introduce las unidades del producto: ");
        udCompradas = sc.nextInt();
        sc.close();

        double ivaProducto = 0.21*precioProducto;
        double totalCompra = (precioProducto + ivaProducto) * udCompradas;

        System.out.printf("IVA del producto: %.2f \n", ivaProducto);
        
        if (totalCompra > 100) {
            double totalCompraDescuento = totalCompra - totalCompra * 0.05;
            System.out.printf("La compra tiene un descuento de un 5 porciento. El precio total con IVA es de: %.2f \n", totalCompraDescuento);
        } else {
            System.out.printf("El precio total con IVA es de: %.2f \n", totalCompra);
        }
    }
}
