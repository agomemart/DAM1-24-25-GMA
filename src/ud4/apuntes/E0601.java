package ud4.apuntes;
/*
* Escribir un programa que muestre todos los caracteres Unicode junto a su code
point, cuyo valor esté comprendido entre \u0000 y \uFFFF.
* */
public class E0601 {
    public static void main(String[] args) {
        for (int i = 0; i < 512; i++) {
            System.out.println(i + " -> " + (char) i);
        }
    }
}
