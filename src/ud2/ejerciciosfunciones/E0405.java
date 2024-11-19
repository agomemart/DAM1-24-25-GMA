package ud2.ejerciciosfunciones;

public class E0405 {
    public static boolean esVocal(char letra) {
        
        switch (Character.toLowerCase(letra)) {
            case 'a', 'e', 'i', 'o', 'u' : return true;  
            default: return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(esVocal('a'));
        System.out.println(esVocal('A'));
        System.out.println(esVocal('b'));
    }
}
