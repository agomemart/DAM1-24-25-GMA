package ud2.practicas;

/*
 * Diseñar un programa que simule el lanzamiento de un dado de 6 caras un número de veces
codificado como una constante NUM_LANZAMIENTOS.
El programa mostrará una estadística final que recoja el número de veces que ha salido cada cara
del dado y el porcentaje sobre el total de lanzamientos.
El porcentaje se mostrará como un número entero o como un número real con un máximo de 2
decimales, con una salida por pantalle similar a la siguiente:
 */
public class Dado {
    public static double porcentajeResultado(int cara, int numLanzamientos) {
        return (cara * 100) / numLanzamientos;
    }
    public static void main(String[] args) {
        final int NUM_LANZAMIENTOS = 10000;
        int cara1 = 0;
        int cara2 = 0;
        int cara3 = 0;
        int cara4 = 0;
        int cara5 = 0;
        int cara6 = 0;
        
        for (int i = 0; i < NUM_LANZAMIENTOS; i++) {
            int numAleatorio = (int) (Math.random() * 6) + 1;
            switch (numAleatorio) {
                case 1:
                    cara1++;
                    break;
                case 2:
                    cara2++;
                    break;
                case 3:
                    cara3++;
                    break;
                case 4:
                    cara4++;
                    break;
                case 5:
                    cara5++;
                    break;
                case 6:
                    cara6++;
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("Resultado de los lanzamientos: ");
        System.out.println("Cara 1: Ha salido " + cara1 + " veces (" + porcentajeResultado(cara1, NUM_LANZAMIENTOS) + "%)");
        System.out.println("Cara 2: Ha salido " + cara2 + " veces (" + porcentajeResultado(cara2, NUM_LANZAMIENTOS) + "%)");
        System.out.println("Cara 3: Ha salido " + cara3 + " veces (" + porcentajeResultado(cara3, NUM_LANZAMIENTOS) + "%)");
        System.out.println("Cara 4: Ha salido " + cara4 + " veces (" + porcentajeResultado(cara4, NUM_LANZAMIENTOS) + "%)");
        System.out.println("Cara 5: Ha salido " + cara5 + " veces (" + porcentajeResultado(cara5, NUM_LANZAMIENTOS) + "%)");
        System.out.println("Cara 6: Ha salido " + cara6 + " veces (" + porcentajeResultado(cara6, NUM_LANZAMIENTOS) + "%)");
        
    }
}
