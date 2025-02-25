package ud5.herenciaejercicios;

public class Caja {
    int ancho;
    int alto;
    int fondo;
    String etiqueta;

    public Caja(int ancho, int alto, int fondo) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }

    public double getVolumen() {
        return ancho*alto*fondo;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
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
