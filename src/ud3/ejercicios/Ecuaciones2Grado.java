package ud3.ejercicios;

public class Ecuaciones2Grado {
    private double x;
    private double y;
    private double z;
    
    public Ecuaciones2Grado(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getDiscriminante() {
        return y * y - 4 * x * z;
    }

    public boolean esDiscriminantePositivo() {
        return getDiscriminante() > 0;
    }

    public void mostrarSoluciones() {
        double discriminante = getDiscriminante();

        if (discriminante < 0) {
            System.out.println("No tiene solución real");
        } else if (discriminante == 0) {
            double solucionUnica = -y / (2 * x);
            System.out.println("Tienen una única solución. x = " + solucionUnica);
        } else {
            double raizDiscriminante = Math.sqrt(discriminante);
            double solucion1 = (-y +raizDiscriminante) / (2 * x);
            double solucion2 = (-y - raizDiscriminante) / (2 * x);

            System.out.println("Tiene 2 soluciones. x1 = " + solucion1 + " x2 = " + solucion2);
        }
    }

    public void mostrarEcuacion() {
        System.out.println("Ecuación: " + x + "x^2" + y + "x" + z + " = 0");
    }
}
