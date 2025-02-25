package ud5.herenciaejercicios;

public class CajaCarton extends Caja{
    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo);
        double volCajaCarton = getVolumen() * 0.8;
    }

}
