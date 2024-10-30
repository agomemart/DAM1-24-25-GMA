package ud1.ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa en Java que solicite la edad de una persona y, utilizando operadores ternarios, determine y muestre en qué categoría se encuentra según su edad:

Categorías:
Infantil: 0 a 12 años
Adolescente: 13 a 17 años
Adulto: 18 a 64 años
Adulto mayor: 65 años en adelante
Requisitos:
El programa debe pedir la edad.
Utiliza operadores ternarios para clasificar la edad en una de las categorías.
Si la edad es negativa, debe mostrar un mensaje de error diciendo que no es válida.
 */
public class ClasificacionEdad {
    public static void main(String[] args) {
        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una edad: ");
        edad = sc.nextInt();
        sc.close();

        String clasifEdad = (edad >= 0 && edad <= 12) ? "Infantil" : 
                          (edad >= 13 && edad <= 17) ? "Adolescente" :
                          (edad >= 18 && edad <= 64) ? "Adulto" :
                          (edad >=65) ? "Jubilado" : 
                          "La edad introducida no es válida";
        
        System.out.println("La edad introducida corresponde con: " + clasifEdad);
    }
}
