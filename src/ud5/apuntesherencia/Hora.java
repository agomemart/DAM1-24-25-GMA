package ud5.apuntesherencia;

public class Hora {
    byte hora;
    byte minutos;

    public Hora(int hora, int minutos) {
        if (!setHora(hora)){
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
        if (!setMinutos(minutos)){
            throw new IllegalArgumentException("El minuto debe estar entre 0 y 59");
        }
    }

    public void inc() {
        minutos++;
        if (minutos == 60) {
            hora++;
            minutos = 0;
            if (hora == 24){
                hora = 0;
            }
        }
    }

    boolean setMinutos(int valor) {
        if (valor >= 0 && valor < 60) {
           minutos = (byte)valor;
            return true;
        }
        return false;
    }

    boolean setHora(int valor) {
        if (valor >= 0 && valor < 24) {
            hora = (byte)valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minutos);
    }

    public static void main(String[] args) {
        Hora hora = new Hora(8,10);
        System.out.println(hora);
        hora.inc();
        System.out.println(hora);
        hora.setMinutos(59);
    }

}
