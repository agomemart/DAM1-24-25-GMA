package ud1.conversiones;
public class Conversiones {
    public static void main(String[] args) {
        byte b = (byte) 127;
        b++;
        int num = 65;
        char letra = (char) num;
        letra++;
        boolean mayuscula = letra >= 'A' && letra <= 'Z';
        System.out.println(letra + " es mayúscula? " + mayuscula);
        System.out.println("En minúsculas sería " + (char)(letra + 32));
        System.out.println(b);
    }
}