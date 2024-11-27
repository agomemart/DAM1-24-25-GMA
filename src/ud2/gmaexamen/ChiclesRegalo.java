//Adrián Gómez Martínez
package ud2.gmaexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

/*
 * Para tener contentos a sus clientes y de paso intentar que no tiren al suelo los envoltorios
de los chicles, la empresa BubbaGum ha decidido dar chicles gratis a aquellos que lleven
los envoltorios de otros chicles ya consumidos.
Ha empezado regalando un chicle por cada cinco envoltorios. Eso significa que si
compramos 25 chicles podremos en realidad disfrutar de 31: al comernos los 25 comprados
tendremos 5 chicles más gratis con los que conseguimos otros 5 envoltorios adicionales con
los que podemos ir a la tienda a por otro más. Si la estrategia funciona, la empresa probará
a realizar otras ofertas.
La pregunta que nos hacemos es ¿cuántos chicles nos podremos comer según la oferta
que haya en ese momento?
Implementa la función totalChicles() que devolverá el número total de chicles que
podremos comernos según el número de chicles comprados inicialmente y la oferta actual
que se indique en los parámetros de entrada.
La función recibe como parámetros de entrada tres números enteros no negativos.
● Si alguno de los tres números es negativo la función devolverá el valor de error -1.
● El primer número indica el número de chicles comprados inicialmente.
● El segundo número indica cuántos envoltorios hay que reunir según la oferta actual
para conseguir chicles gratis. Si vale cero significa que no hay oferta y la función
devolverá el número de chicles comprados inicialmente.
● El tercer número indica cuántos chicles gratis se darán al reunir el número de
envoltorios anterior. Si hay oferta este número deberá ser menor que el segundo, ya
que no tendría sentido una oferta en la que se den más chicles gratis que el número
de envoltorios que se entregan. Si este tercer parámetro es mayor que el segundo la
función también devolverá el valor de error -1.

 */
public class ChiclesRegalo {
    public static int totalChicles(int numChiclesComprados, int envoltoriosChicleGratis, int chiclesGratis) {
        int totalChicles = 0;
        if (numChiclesComprados >= 0 || envoltoriosChicleGratis >= 0 || chiclesGratis >= 0) {
            if (envoltoriosChicleGratis == 0) {
                return numChiclesComprados;
            } else {
                while (numChiclesComprados >= envoltoriosChicleGratis) {
                    chiclesGratis = numChiclesComprados / envoltoriosChicleGratis;
                    totalChicles += chiclesGratis;
                    numChiclesComprados = chiclesGratis + numChiclesComprados % envoltoriosChicleGratis;
                }
                return totalChicles;
            }
        } else {
            return -1;
        }
    }

    @Test
    public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1));
        assertEquals(111, totalChicles(100, 10, 1));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
        assertEquals(-1, totalChicles(-1, 2, 1));
        assertEquals(-1, totalChicles(10, 1, -1));
        assertEquals(-1, totalChicles(20, 2, 2));
        assertEquals(10, totalChicles(7, 3, 1));
        assertEquals(40, totalChicles(27, 3, 1));
        assertEquals(21, totalChicles(11, 2, 1));
        assertEquals(31, totalChicles(16, 2, 1));
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(100, totalChicles(100, 0, 1));
        assertEquals(0, totalChicles(0, 0, 1));
        assertEquals(0, totalChicles(0, 2, 1));
    }

    public static void main(String[] args) {
        System.out.println(totalChicles(25, 5, 1));
    }
}