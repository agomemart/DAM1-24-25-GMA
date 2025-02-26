package ud5.herenciaejercicios.EP0825a7;

import java.util.Objects;

public class Suceso extends Punto3D{
    int tiempo;
    String descripcion;

    public Suceso(int x, int y, int z, int tiempo, String descripcion) {
        super(x, y, z);
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }
}
