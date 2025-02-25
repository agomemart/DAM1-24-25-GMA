package ud5.herenciaejercicios.EP0812a3;

public class Caja {
    int ancho;
    int alto;
    int fondo;
    enum Unidad {CM, M}
    String etiqueta;


    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        Unidad u = Unidad.CM;
        Unidad u2 = Unidad.M;

    }

    public double getVolumen() {
        return ancho*alto*fondo;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() <= 30) {
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
