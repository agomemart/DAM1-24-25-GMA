package ud5.herenciaejercicios.EP0812a3;

public class CajaCarton extends Caja {

    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.CM);
    }
    @Override
    public double getVolumen() {
        return super.getVolumen() * 0.8;
    }

    double getSuperficie() {
        return 2 * alto * ancho + 2 * alto * fondo + 2 * ancho * fondo;
    }
}
