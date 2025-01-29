package ud4.apuntes;

import java.util.Arrays;

public class E0612 {
    public static void main(String[] args) {
        System.out.println(sonAnagrama("amor", "roma")); //true
        System.out.println(sonAnagrama("Amor", "Roma")); //true
        System.out.println(sonAnagrama("amor", "rollo")); //false
    }
        
    private static boolean sonAnagrama(String cad1, String cad2) {
        char[] t1 = cad1.toLowerCase().toCharArray();
        char[] t2 = cad2.toLowerCase().toCharArray();

        Arrays.sort(t1);
        Arrays.sort(t2);

        return Arrays.equals(t1, t2);
    }
}
