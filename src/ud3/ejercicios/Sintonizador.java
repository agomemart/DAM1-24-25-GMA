package ud3.ejercicios;

public class Sintonizador {
    private double frecuencia;

    private double memoria1;
    private double memoria2;
    private double memoria3;

    public Sintonizador() {
        this.frecuencia = 80;
    }

    public Sintonizador(double frecuencia) {
       setFrecuencia(frecuencia);
    }

    public void up() {
        if (frecuencia >= 108) {
            frecuencia = 80;
        } else {
            frecuencia += 0.5;
        }
        
    }
    public void down() {
        if (frecuencia == 80) {
            frecuencia = 108;
        } else {
            frecuencia -= 0.5;
        }
    }

    public void upThin() {
        if (frecuencia >= 108) {
            frecuencia = 80;
        } else {
            frecuencia += 0.1;
        }
        
    }
    public void downThin() {
        if (frecuencia == 80) {
            frecuencia = 108;
        } else {
            frecuencia -= 0.1;
        }
    }

    public void display() {
        System.out.println("Frecuencia sintonizada: " + frecuencia + " MHz");
    }
    
    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        if (frecuencia >= 80 && frecuencia <= 108) {
            this.frecuencia = frecuencia;
        }
    }

    //Gestión de memorias
    public void setMemoria1() {
        this.memoria1 = frecuencia;
    }
    public void setMemoria2() {
        this.memoria2 = frecuencia;
    }
    public void setMemoria3() {
        this.memoria3 = frecuencia;
    }
   
    public double sintonizarMemoria1() {
        if (memoria1 != 0) 
            frecuencia = memoria1;
        return memoria1;
    }

    public double sintonizarMemoria2() {
        if (memoria2 != 0) 
            frecuencia = memoria2;
        return memoria2;
    }

    public double sintonizarMemoria3() {
        if (memoria3 != 0) 
            frecuencia = memoria3;
        return memoria3;
    }

    

    
    
}
