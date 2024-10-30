package ud1.Identificadores;

public class TiposPrimitivos {
    public static void main(String[] args) {
        short numShort = 32763;
        int numInt = 2147483647;
        long numLong = 9223372036854775807l;
        float numFloat = 3.4E10f;
        double numDouble = 1.8E10d;
        char letra = 'a';
        boolean verdaderoFalso = false;
        String varString = "DAM";

        System.out.println("Tipo    NumBits   Valor");
        System.out.println("------------------------");
        System.out.println("byte      8         124");
        System.out.println("short    16         " + numShort);
        System.out.println("int      32         " + numInt);
        System.out.println("long     64         " + numLong);
        System.out.println("float    32         " + numFloat);
        System.out.println("double   64         " + numDouble);
        System.out.println("char     16         " + letra);
        System.out.println("boolean   1         " + verdaderoFalso);
        System.out.println("String    ?         " + varString);
    }
}
