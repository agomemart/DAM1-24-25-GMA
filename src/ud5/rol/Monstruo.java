package ud5.rol;

public class Monstruo {
    String nombre;
    int ataque, defensa, velocidad, puntosVida;

    public Monstruo(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.puntosVida = puntosVida;
    }

    void atacar(Monstruo m) {

    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Putos de vida: " + puntosVida);
    }

    @Override
    public String toString() {
        if (nombre != null) {
            return nombre + getClass() + "(" + puntosVida + ")";
        } else {
            return getClass() + "(" + puntosVida + ")";
        }
    }

    Monstruo generaMonstruoAleatorio() {
        Monstruo m;
        return null;
    }
}
