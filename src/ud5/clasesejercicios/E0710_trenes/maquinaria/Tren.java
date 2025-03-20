package ud5.clasesejercicios.E0710_trenes.maquinaria;

import ud5.clasesejercicios.E0710_trenes.personal.Maquinista;
import ud5.clasesejercicios.E0710_trenes.personal.Mecanico;
import ud5.clasesejercicios.E0710_trenes.personal.especialidad;

public class Tren {
    Locomotora locomotora;
    Vagon vagon1;
    Vagon vagon2;
    Vagon vagon3;
    Maquinista maquinista;

    public Tren(Locomotora locomotora, Vagon vagon1, Vagon vagon2, Vagon vagon3, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagon1 = vagon1;
        this.vagon2 = vagon2;
        this.vagon3 = vagon3;
        this.maquinista = maquinista;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "locomotora=" + locomotora +
                ", vagon1=" + vagon1 +
                ", vagon2=" + vagon2 +
                ", vagon3=" + vagon3 +
                ", maquinista=" + maquinista +
                '}';
    }

    public static void main(String[] args) {
        Mecanico mecanico1 = new Mecanico("Pepe", "6666666", especialidad.motor);
        Locomotora locomotora1 = new Locomotora("1111", 200, 200, mecanico1);
        Vagon vagon1 = new Vagon(01, 100, 20, "Madera");
        Vagon vagon2 = new Vagon(02, 100, 60, "Hierro");
        Vagon vagon3 = new Vagon(03, 100, 80, "Pasajeros");
        Maquinista maquinista1= new  Maquinista("Marcos", "77777777L", 6520.3,"Oficial");
        Tren tren1 = new Tren(locomotora1, vagon1, vagon2, vagon3, maquinista1);

        System.out.println(tren1.toString());
    }
}
