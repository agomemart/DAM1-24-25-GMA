package ud4.ejercicios;

import java.util.Random;

/*
 * Los siguientes términos corresponden a conceptos que el alumnado de programación en 
Java debe conocer:  
 
"Algoritmo", 
"Lenguaje de programación", "Entorno de desarrollo", 
"Compilación", 
"Ejecución", 
"Código fuente", 
"Bytecode", 
"Código objeto" 
 
Realiza un programa que almacene los términos anteriores en un array de datos de tipo 
String y que muestre uno de ellos por pantalla elegido al azar.  
 
Para ello implementa una función que devuelva uno de los términos del array elegido al 
azar, con el siguiente prototipo: 
 
static String fraseAleatoria(String[] t) 
 */
public class ConceptosProgramacion {
    static String fraseAleatoria(String[] t) {
        String conceptos[] = {"Algoritmo", "Lenguaje de programación", "Entorno de desarrollo", "Compilación", "Ejecución", 
        "Código fuente", "Bytecode", "Código objeto"};
        Random rnd = new Random();
        int posicionAleatoria = rnd.nextInt(0, conceptos.length);
        return conceptos[posicionAleatoria];
    }
    public static void main(String[] args) {
        String conceptos[] = {"Algoritmo", "Lenguaje de programación", "Entorno de desarrollo", "Compilación", "Ejecución", 
        "Código fuente", "Bytecode", "Código objeto"};
        System.out.println(fraseAleatoria(conceptos));
    }
}
