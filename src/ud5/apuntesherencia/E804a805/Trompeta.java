package ud5.apuntesherencia.E804a805;

import java.util.Arrays;

public class Trompeta extends Instrumento{

    @Override
    public void interpretar() {
        System.out.println("Sonido de trompeta" + Arrays.toString(melodia));
    }
}
