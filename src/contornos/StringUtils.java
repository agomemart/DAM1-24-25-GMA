package contornos;

public class StringUtils {
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) { // Codigo cambiado por completo
        return false;}
        String reves = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reves);
    }
}
