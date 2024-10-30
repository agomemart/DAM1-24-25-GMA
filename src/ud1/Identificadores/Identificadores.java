package ud1.Identificadores;

public class Identificadores {
    public static void main(String[] args) {
        final int NUMERO_ALUMNOS = 33;
        
        String numeroDeTelefono = "666666666";
        double $totalVentas = 576.55;
        String miNombre = "Adri";
        boolean estaLloviendo = false;
        char letraPreferida = 'a';
        byte edad;
        edad = -0x10;
        float monedero = 3.4E38f -567.34f; //los literales de tipo float acaban en f
        edad = (byte) (edad + 1);
        long numEnorme = 9223372036854775807l;
        /*A continuación imprimo por pantalla
         * Mucho printl
         */
        System.out.print("Numero de teléfono: ");
        System.out.println(numeroDeTelefono);

        System.out.println("Total ventas: " + $totalVentas);

        System.out.println("Me llamo " + miNombre);

        System.out.println("Está lloviendo? " + estaLloviendo);
        System.out.println("Letra preferida: " + letraPreferida);
    }
}
