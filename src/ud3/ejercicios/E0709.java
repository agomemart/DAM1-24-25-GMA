package ud3.ejercicios;

public class E0709 {
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        Bombilla b3 = new Bombilla();

        b1.encender();
        b2.encender();

        System.out.println(b1.estado());
        System.out.println(b3.estado());
    }
}