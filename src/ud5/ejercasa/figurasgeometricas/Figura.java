package ud5.ejercasa.figurasgeometricas;

public class Figura {
    String color;

    public Figura(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " de color " + color;
    }

    public static void main(String[] args) {
        Figura figura = new Figura("Red");
        Circulo c1 = new Circulo("Rojo", 5);
        Rectangulo r1 = new Rectangulo("Azul", 4, 6);

        System.out.println(c1.toString());
        System.out.println(r1.toString());
    }
}
