package ud1.expresiones;

import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        double gradosf;

        Scanner sc = new Scanner (System.in);

        System.out.print("Temperatura en grados Farenheit: ");
        gradosf = sc.nextDouble();
        

        double fraccion = 5/9.0;
        double num = 32.0;
        double gradosc = fraccion * (gradosf-num);

        System.out.println("En grados celsius serían: "+ gradosc);
        sc.close();
    }
}
