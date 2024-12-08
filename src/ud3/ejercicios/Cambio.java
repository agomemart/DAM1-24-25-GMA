package ud3.ejercicios;

public class Cambio {
    private double cambio;
    
    public Cambio(double cambio) {
        this.cambio = cambio;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
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

    public static int desgloseEuros(int euros) {
        euros = desglosarDenominacion(euros, 50, "billetes de 50€");
        euros = desglosarDenominacion(euros, 20, "billetes de 20€");
        euros = desglosarDenominacion(euros, 10, "billetes de 10€");
        euros = desglosarDenominacion(euros, 5, "billetes de 5€");
        euros = desglosarDenominacion(euros, 2, "monedas de 2€");
        euros = desglosarDenominacion(euros, 1, "monedas de 1€");
        return euros;
    }

    public static int desgloseCentimos(int centimos) {
        centimos = desglosarDenominacion(centimos, 50, "monedas de 50 céntimos");
        centimos = desglosarDenominacion(centimos, 20, "monedas de 20 céntimos");
        centimos = desglosarDenominacion(centimos, 10, "monedas de 10 céntimos");
        centimos = desglosarDenominacion(centimos, 5, "monedas de 5 céntimos");
        centimos = desglosarDenominacion(centimos, 2, "monedas de 2 céntimos");
        centimos = desglosarDenominacion(centimos, 1, "monedas de 1 céntimo");
        return centimos;
    }
    public static int desglosarDenominacion(int cantidad, int denominacion, String descripcion) {
        int numElementos = cantidad / denominacion;
        if (numElementos > 0) {
            System.out.printf("%d %s%n", numElementos, descripcion);
            cantidad %= denominacion;
        }
        return cantidad;
    }
}
