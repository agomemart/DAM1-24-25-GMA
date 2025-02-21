package ud5.apuntesherencia;

public class HoraExacta extends Hora {
    byte segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        if (!setSegundos(segundos)) {
            throw new IllegalArgumentException("El segundo debe estar entre 0 y 59");
        }
    }

    boolean setSegundos(int valor) {
        if (valor >= 0 && valor < 60) {
            segundos = (byte) valor;
            return true;
        }
        return false;
    }

    public void inc() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HoraExacta that = (HoraExacta) o;
        return hora == that.hora && minutos == that.minutos && segundos == that.segundos;
    }


    public static void main(String[] args) {
        HoraExacta h = new HoraExacta(8, 10, 0);
        System.out.println(h);
        HoraExacta h2 = new HoraExacta(23, 59, 59);
        h2.inc();
        System.out.println(h2);
        HoraExacta h3 = new HoraExacta(0, 0, 0);
        System.out.println(h2.equals(h3));
    }
}
