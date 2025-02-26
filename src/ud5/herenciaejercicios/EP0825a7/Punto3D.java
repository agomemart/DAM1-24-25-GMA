package ud5.herenciaejercicios.EP0825a7;

public class Punto3D extends Punto{
    int z;
    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    double distancia(Punto3D otropunto) {
        if (otropunto == null) {
            return 1;
        } else {
            return Math.sqrt(Math.pow(x - otropunto.x, 2) + Math.pow(y - otropunto.y, 2) + Math.pow(z - otropunto.z, 2));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Punto3D punto3D = (Punto3D) o;
        return z == punto3D.z;
    }
}