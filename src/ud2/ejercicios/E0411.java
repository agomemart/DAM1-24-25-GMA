package ud2.ejercicios;

/*
Escribir una función que calcule de forma recursiva el máximo común divisor de
dos números. Para ello sabemos:
mcd(a,b) =
mcd(a - b, b) si a >= b
mcd(a, b - a) si b > a
a si b = 0
b si a = 0
*/

public class E0411 {

    public static int mcd(int a, int b) {
        int maxComDiv = 0;
        if (b == 0){
            maxComDiv = a;
        } else if (a == 0) {
            maxComDiv = b;
        } else if (a >= b){
            maxComDiv =  mcd(a - b, b);
        } else if (b > a) {
            maxComDiv = mcd(a, b - a);
        } 
        return maxComDiv;
    }
    public static void main(String[] args) {
        System.out.println(mcd(8, 16));
   }
}
