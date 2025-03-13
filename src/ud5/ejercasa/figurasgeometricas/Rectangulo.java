package ud5.ejercasa.figurasgeometricas;

public class Rectangulo extends Figura{
    int base;
    int altura;

    public Rectangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return base*altura;
    }

    @Override
    public String toString() {
        return super.toString() + ", base: " + base + ", altura: " + altura + ", área: "  + getArea();
    }
}
