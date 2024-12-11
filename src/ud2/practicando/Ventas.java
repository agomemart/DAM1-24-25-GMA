package ud2.practicando;

import java.util.Scanner;

public class Ventas {
    public static String diaSemana(int dia) {
        return switch (dia){
            case 0: yield "MARTES";
            case 1: yield "MIERCOLES";
            case 2: yield "JUEVES";
            case 3: yield "VIERNES";
            case 4: yield "SABADO";
            case 5: yield "DOMINGO";
            default: yield "ERROR";
        }
    }
    public static void main(String[] args) {
        double max = 0, min = 0, media = 0;
        int diaMax, diaMin;
        double recaudacion;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            recaudacion = sc.nextDouble();
        if (i == 0) {
            min = recaudacion;
            max = recaudacion;
            diaMin = 0;
            diaMax = 0;
        } else {
            if (recaudacion < min) {
                min = recaudacion;
                diaMin = i;
            } else if (recaudacion > max) {
                max = recaudacion;
                diaMax = i;
            }
        }
            media += recaudacion;
        }

        media /= 6;

        System.out.println(diaSemana(diaMax) + "" + diaSemana(diaMin) + recaudacion > media ? "SI" : "NO");
    }

}
