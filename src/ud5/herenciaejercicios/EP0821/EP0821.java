package ud5.herenciaejercicios.EP0821;

public class EP0821 {
    static boolean esNumero(Object ob) {
        return ob instanceof Integer;
    }
    static boolean sumar(Object a, Object b) {
        if (a instanceof String && b instanceof String) {
            System.out.println((String) a + (String) b);
        } else if (a instanceof Number && b instanceof Number) {
            double suma = ((Number) a).doubleValue() + ((Number) b).doubleValue();
            System.out.println(suma);
        } else {
            System.out.println("No se puede sumar");
        }
        return false;
    }
}
