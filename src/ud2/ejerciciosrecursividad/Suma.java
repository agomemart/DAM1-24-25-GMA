package ud2.ejerciciosrecursividad;
/*Escribe un programa que sume los números enteros desde 1 hasta n utilizando
recursividad. */
public class Suma {
    public static int sumaRecursiva(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumaRecursiva(num - 1);
    }
    public static void main(String[] args) {
        System.out.println(sumaRecursiva(10));
    }
}
