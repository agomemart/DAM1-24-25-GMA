//Adrián Gómez Martínez

package ud3.gmaexamen;

public class CocheCarreras {
    private String nombre;
    private int velocidadMax, maxTurbos, autonomiaMax, autonomiaRestante, turboRestante, distanciaRecorrida;
    private int contadorRepostaje, distanciaRecorridaTurbo;

    public CocheCarreras(String nombre, int velocidadMax, int autonomia) {
        this.nombre = nombre;
        if (velocidadMax > 0 && velocidadMax <= 100) {
            this.velocidadMax = velocidadMax;
        } else {
            this.velocidadMax = 1;
        }
        this.autonomiaMax = autonomia;
        this.maxTurbos = 3;
        this.distanciaRecorrida = 0;
    }

    public CocheCarreras(String nombre, int velocidadMax, int maxTurbos, int autonomiaMax) {
        this.nombre = nombre;
        this.velocidadMax = velocidadMax;
        if (maxTurbos >= 0 && maxTurbos <= 10) {
            this.maxTurbos = maxTurbos;
        }
        if (autonomiaMax > 0 && autonomiaMax <= 500) {
            this.autonomiaMax = autonomiaMax;
        }
        this.distanciaRecorrida = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAutonomiaRestante() {
        return autonomiaRestante;
    }

    public int getTurboRestante() {
        return turboRestante;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public int getContadorRepostaje() {
        return contadorRepostaje;
    }

    public int getDistanciaRecorridaTurbo() {
        return distanciaRecorridaTurbo;
    }

    public int avanzar() {
        @SuppressWarnings("unused")
        int distanciaAleatoria = (int) (Math.random() * velocidadMax) + 1;
        distanciaAleatoria += distanciaRecorrida;
        autonomiaRestante = autonomiaMax - distanciaRecorrida;

        return distanciaRecorrida;
    }

    public int usarTurbo() {
        if (turboRestante > 0) {
            turboRestante--;
            distanciaRecorridaTurbo = 150 / 100 * velocidadMax;
            distanciaRecorridaTurbo += distanciaRecorrida;
            autonomiaRestante = autonomiaMax - distanciaRecorrida;
        }
        return distanciaRecorrida;
    }

    public void repostar() {
        autonomiaRestante = autonomiaMax;
        turboRestante = maxTurbos;
        contadorRepostaje++;
    }

    public void reiniciarDistancia() {
        distanciaRecorrida = 0;
    }

    public void mostrar() {
        System.out.println("Coche: " + nombre);
        System.out.println("Velocidad máxima: " + velocidadMax + " mps");
        System.out.println("Turbos: " + turboRestante + "/" + maxTurbos);
        System.out.println("Autonomia: " + autonomiaRestante + "/" + autonomiaMax);
    }

    public static void main(String[] args) {
        System.out.println("RAYO");
        System.out.println("====");
        CocheCarreras rayo = new CocheCarreras("Rayo", 90, 400);
        rayo.mostrar();
        rayo.avanzar();
        rayo.usarTurbo();
        rayo.mostrar();
        System.out.println("TRUENO");
        System.out.println("======");
        CocheCarreras trueno = new CocheCarreras("Trueno", 60, 5, 300);
        trueno.mostrar();
        while (trueno.getAutonomiaRestante() != 0) {
            trueno.usarTurbo();
            trueno.mostrar();
            trueno.repostar();
            trueno.mostrar();
        }
        
    }

}
