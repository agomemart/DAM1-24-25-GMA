package ud5.apuntesinterfaces.animales;

public class AppAnimal {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Caracol caracol = new Caracol();

        System.out.println(Sonido.version);
        System.out.println(perro.version);

        perro.voz();
        gato.voz();

        perro.vozDurmiendo();
        gato.vozDurmiendo();

        Leon leon = new Leon();
        leon.voz();
        leon.vozDurmiendo();

        Sonido.bostezo();

        Sonido s = perro;
        s.voz();
        s = gato;
        s.voz();

        Sonido[] sonidos = {perro, gato, leon};
        for (Sonido sonido : sonidos) {
            System.out.println("Esto es un " + sonido.getClass().getSimpleName());
            sonido.voz();
            sonido.vozDurmiendo();
        }
        Sonido son = new Sonido() {
            @Override
            public void voz() {
                System.out.println("Jajajjajajijijij");
            }
        };

        son.voz();
        son.vozDurmiendo();

    }
}
