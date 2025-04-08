package contornos;

public class GodLine {
    //A liña de código é moi longa e fai difícil a súa lectura e mantemento.
    public double calcularPrecioFinal(double precioBase, double descuento, double
            impuestos, double promocion, double tasaEnvio, double seguro, double
                                              cupomDescuento, double comisionVendedor) {
        return (precioBase - descuento + impuestos + promocion + tasaEnvio + seguro -
                cupomDescuento) * (1 - comisionVendedor);}

    public static void main(String[] args) {
        GodLine godLine = new GodLine();

        // Valores de ejemplo
        double precioBase = 100.0;
        double descuento = 10.0;
        double impuestos = 15.0;
        double promocion = 5.0;
        double tasaEnvio = 7.0;
        double seguro = 3.0;
        double cupomDescuento = 5.0;
        double comisionVendedor = 0.1; // 10% de comisión

        double precioFinal = godLine.calcularPrecioFinal(
                precioBase,
                descuento,
                impuestos,
                promocion,
                tasaEnvio,
                seguro,
                cupomDescuento,
                comisionVendedor
        );

        System.out.printf("El precio final es: %.2f\n", precioFinal);
    }
}
