package ud5.ejercasa.figurasgeometricas;

public class Circulo extends Figura{
    double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getArea() {
        return (Math.PI * radio * radio);
    }

    @Override
    public String toString() {
        return super.toString() + ", radio: " + radio + ", área: " + getArea();
    }
}
