package ud3.ejercicios;

public class EP0716 {
    public static void main(String[] args) {
        Punto p1 = new Punto(1.5, 4.6);
        Punto p2 = new Punto(4.0, 1.2);

        p1.muestra();
        p1.desplazaX(2.0);
        p1.desplazaY(-1.0);
        p1.muestra();
        p1.desplaza(1.0, 1.0);
        p1.muestra();

        double distancia = p1.distanciaEuclidea(p2);
        System.out.println("Distancia entre p1 y p2: " + distancia);
    }
}
