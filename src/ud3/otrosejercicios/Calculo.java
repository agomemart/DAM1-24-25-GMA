package ud3.otrosejercicios;

import java.util.Scanner;

public class Calculo {
    private double base, altura;

    public Calculo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return base * 2 +altura * 2;
    }
    public static void main(String[] args) {
        double base, altura = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta la base: ");
        base = sc.nextDouble();
        
        System.out.print("Inserta la altura: ");
        altura = sc.nextDouble();
        sc.close();
        
        Calculo c1 = new Calculo(base, altura);
        Calculo c2 = new Calculo(14.8, 20.5);

        System.out.println("Área rectángulo: " + c1.calcularArea());
        System.out.println("Área rectángulo: " + c2.calcularArea());
        System.out.println("Perímetro rectángulo: " + c1.calcularArea());
        System.out.println("Perímetro rectángulo: " + c2.calcularArea());
    }
}
