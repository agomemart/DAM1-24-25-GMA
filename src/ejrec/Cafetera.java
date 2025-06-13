package ejrec;

public class Cafetera {
    private int capacidad;
    private int cantidadActual;
    static final int CAPACIDAD_MINIMA = 50;
    static final int CAPACIDAD_MAXIMA = 1000;

    public Cafetera() {
        this.capacidad = CAPACIDAD_MAXIMA;
        this.cantidadActual = 0;
    }

    public Cafetera(int capacidad) {
        if (capacidad < CAPACIDAD_MINIMA || capacidad > CAPACIDAD_MAXIMA) {
            this.capacidad = CAPACIDAD_MAXIMA;
        } else {
            this.capacidad = capacidad;
        }
        this.cantidadActual = this.capacidad;
    }

    public Cafetera(int capacidad, int cantidadActual) {
        if (capacidad < CAPACIDAD_MINIMA || capacidad > CAPACIDAD_MAXIMA) {
            this.capacidad = CAPACIDAD_MAXIMA;
        } else {
            this.capacidad = capacidad;
        }

        if (cantidadActual < 0) {
            this.cantidadActual = 0;
        } else if(cantidadActual > this.capacidad) {
            this.cantidadActual = this.capacidad;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    public void setCantidadActual(int cantidadActual) {
        if (cantidadActual < 0) {
            this.cantidadActual = 0;
        } else if (cantidadActual > this.capacidad) {
            this.cantidadActual = this.capacidad;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    void llenarCafetera() {
        this.cantidadActual = this.capacidad;
    }

    public boolean servirTaza(int capacidadTaza) {
        if (capacidadTaza < 0) {
            return false;
        }
        if (cantidadActual >= capacidadTaza) {
            cantidadActual -= capacidadTaza;
            return true;
        } else {
            cantidadActual = 0;
            return false;
        }
    }

    void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    int agregarCafe(int cantidad) {
        int sobrante = 0;
        if (cantidad < 0) {
            return 0;
        }
        int espacioDisponible = this.capacidad - this.cantidadActual;
        if (cantidad > espacioDisponible) {
            this.cantidadActual = this.capacidad;
            sobrante = cantidad - espacioDisponible;
        } else {
            this.cantidadActual += cantidad;
        }
        return sobrante;
    }

    void mostrar() {
        System.out.println("Capacidad máxima: " + getCapacidad());
        System.out.println("Cantidad actual café: " + getCantidadActual());
    }

    @Override
    public String toString() {
        return "Capacidad máxima: " + capacidad;
    }

    public static void main(String[] args) {
        Cafetera cafeteraBasica = new Cafetera();
        Cafetera cafeteraPequenha = new Cafetera(500);
        Cafetera cafeteraGrande = new Cafetera(2000, 1500);
        cafeteraBasica.mostrar();
        cafeteraBasica.llenarCafetera();
        cafeteraBasica.servirTaza(150);
        cafeteraBasica.mostrar();
        cafeteraPequenha.mostrar();
        for(int i = 0; i < 4; i++)
            cafeteraPequenha.servirTaza(150);
        cafeteraPequenha.mostrar();
        cafeteraGrande.mostrar();
        cafeteraGrande.vaciarCafetera();
        cafeteraGrande.agregarCafe(200);
        cafeteraGrande.mostrar();
    }
}
