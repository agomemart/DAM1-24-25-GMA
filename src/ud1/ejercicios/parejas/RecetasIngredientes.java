package ud1.ejercicios.parejas;

import java.util.Scanner;

/*
 * Dada la siguiente receta de compota de manzana, u otra similar que encuentres en Internet,
realiza un programa que haga lo siguiente:
1. Mostrar un nombre o título adecuado en pantalla:
2. Mostrar la URL de la receta elegida:
3. Mostrar el número de personas y las cantidades necesarias de manzana, agua,
azúcar y limón para las que está pensada la receta elegida.
4. Opcionalmente puedes mostrar los otros ingredientes en otra línea de salida.
5. Solicitar por teclado al usuario un número de personas para el cual adaptar la receta.
6. Mostrar por pantalla las cantidades de manzana, agua, azúcar y limón necesarias
para elaborar la receta para el número de personas introducido.
7. Como extra, basándote en los precios de los ingredientes principales (manzanas y
azúcar) de un supermercado a tu elección, indica el coste de cada uno de los
ingredientes de la receta a elaborar y la suma total en euros, con hasta 2 decimales.
8. Opcionalmente puedes mostrar una recomendación de reducir al máximo la cantidad
de azúcar para que la receta sea más saludabl
 */
//Adrian Gomez controlador
//El Houssaine navegador
public class RecetasIngredientes {
    public static void main(String[] args) {
        double manzana = 1.5; 
        int agua = 330;
        int azucar = 120;
        int zumoLimon = 1;
        int pielNaranja = 1; 
        int ramaCanela = 1;
        int personas = 6;

        System.out.println("Receta de compota de manzana");
        System.out.println("https://www.recetasderechupete.com/compota-de-manzana-casera/12509/");
        System.out.println("Ingredientes: ");
        System.out.println("Para " + personas + " personas");
        System.out.println(manzana + "kg de manzanas");
        System.out.println(agua + "ml de agua");
        System.out.println(azucar + "g de azúcar");
        System.out.println(zumoLimon + "cucharadita de zumo de limón");
        System.out.println("La piel de " + pielNaranja + " naranja");
        System.out.println(ramaCanela + "ramita de canela");

        Scanner sc = new Scanner(System.in);
        System.out.println("Para cuántas personas quieres adaptar esta receta: ");
        int personasFinal = sc.nextInt();
        sc.close();

        double manzanaFinal = personasFinal*manzana/personas;
        double aguaFinal = personasFinal*agua/personas;
        double azucarFinal = personasFinal*azucar/personas;
        double zumoLimonFinal = personasFinal*zumoLimon/personas;
        double pielNaranjaFinal = personasFinal*pielNaranja/personas;
        double ramaCanelaFinal = personasFinal*ramaCanela/personas;

        System.out.println("Para " + personasFinal + " personas las cantidades serían las siguientes: ");
        System.out.println(manzanaFinal + "kg de manzanas");
        System.out.println(aguaFinal + "ml de agua");
        System.out.println(azucarFinal + "g de azúcar");
        System.out.println(zumoLimonFinal + "cucharadita de zumo de limón");
        System.out.println("La piel de " + pielNaranjaFinal + " naranja");
        System.out.println(ramaCanelaFinal + "ramita de canela");


    }
}
