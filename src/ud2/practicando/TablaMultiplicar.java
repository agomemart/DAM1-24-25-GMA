package ud2.practicando;

public class TablaMultiplicar {
    public static void tablaMultiplicar(int num) {
        for(int i = 0; i <= 10; i++) {
            int resultado = i*num;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
    public static void main(String[] args) {
        tablaMultiplicar(4);
    }
}
