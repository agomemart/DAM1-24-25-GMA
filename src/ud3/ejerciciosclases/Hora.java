package ud3.ejerciciosclases;

import java.util.Scanner;

/*
 *  Escribir un programa que lea por teclado una hora cualquiera y un número n que
representa una cantidad en segundos. El programa mostrará la hora introducida y las n
siguientes, que se diferencian en un segundo. Para ello hemos de diseñar previamente la
clase Hora que dispone de los atributos hora, minuto y segundo. Los valores de los
atributos se controlaran mediante métodos set/get.
 */
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public Hora() {

    }
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void mostrarHora() {
        System.out.println(getHora() + ":" + getMinuto() + ":" + getSegundo());
    }

    public void incrementar1Segundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto ++;
            if(minuto == 60) {
                minuto = 0;
                hora++;
                if(hora == 24) {
                    hora = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una hora: ");
        Hora hora = new Hora();
        hora.setHora(sc.nextInt());
        hora.setMinuto(sc.nextInt());
        hora.setSegundo(sc.nextInt());

        System.out.println(hora.getHora() + ":" + hora.getMinuto() + ":" + hora.getSegundo());

        System.out.print("Introduce el numero de incrementos en segundos: ");
        int n = sc.nextInt();
        sc.close();

        for(int i = 0; i < n; i++) {
            hora.incrementar1Segundo();
            hora.mostrarHora();
                    }
                }
            
                
}
