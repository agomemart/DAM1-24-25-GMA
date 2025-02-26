package ud5.herenciaejercicios.EP0812a3;

public class Caja {
    final int ancho, alto, fondo;

    enum Unidad {CM, M}

    String etiqueta;


    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        int multiplicador = switch (unidad) {
            case CM -> 1;
            case M -> 100;
            default -> 0;
        };

        if (ancho <= 0 || alto <= 0 || fondo <= 0) {
            throw new IllegalArgumentException("Ancho, alto o fondo incorrecto");
        }

        this.ancho = ancho * multiplicador;
        this.alto = alto * multiplicador;
        this.fondo = fondo * multiplicador;
    }

    public double getVolumen() {
        return ancho * alto * fondo / 1000000.0;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta != null && etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        }
    }

    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", etiqueta='" + etiqueta + '\'' +
                '}';
    }
}
