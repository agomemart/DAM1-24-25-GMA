package ud5.apuntesherencia;

public class HoraExacta extends Hora{
    int segundos;
    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = segundos;
    }

    public boolean setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
            return true;
        }
        return false;
    }

    public void inc() {
        if (segundos == 60) {
            minutos++;
            segundos = 0;
        } else if (minutos == 60){
            hora++;
            minutos = 0;
        } else if (hora == 24){
            hora = 0;
        } else {
            segundos++;
        }
    }
}
