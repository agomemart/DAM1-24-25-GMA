package ud5.apuntesherencia;

public class Hora {
    int hora;
    int minutos;

    public Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public void inc() {
        if (minutos == 59) {
            hora++;
            minutos = 0;
        } else if (hora == 24){
            hora = 0;
        } else {
            minutos++;
        }
    }

    public boolean setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
            return true;
        }
        return false;
    }

    public boolean setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hora{" +
                "hora=" + hora +
                ", minutos=" + minutos +
                '}';
    }

}
