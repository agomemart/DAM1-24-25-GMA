package ud5.herenciaejercicios.EP0825a7;

public class Punto {
    int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distancia(Punto otropunto) {
        if (otropunto == null) {
            return 1;
        } else {
            return Math.sqrt(Math.pow(x - otropunto.x, 2) + Math.pow(y - otropunto.y, 2));
        }
    }

    boolean equals(Punto p1, Punto p2) {
        if (p1.x == p2.x && p1.y == p2.y) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Punto punto = (Punto) o;
        return x == punto.x && y == punto.y;
    }
}