package ud5.apuntesinterfaces;

public class Leon implements Sonido{
    @Override
    public void voz() {
        System.out.println("Grrrr");
    }

    @Override
    public void vozDurmiendo() {
        System.out.println("Grrrrrrrrrrrrrr");
    }
}
