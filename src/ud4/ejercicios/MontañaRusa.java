package ud4.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
* En una montaña rusa, llamamos "pico" a un punto del recorrido que está más alto que el
inmediatamente anterior y el inmediatamente siguiente.
Implementa la siguiente función que acepta como parámetro de entrada un array con el
registro de las alturas en metros del recorrido de una montaña rusa y devuelve el número de
picos.
* Ten en cuenta que las montañas rusas son circulares, y el punto de inicio de la entrada
¡podría ser un pico!
* */
public class MontañaRusa {
    static int contarPicos(int[] alturas) {
        int picos = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (!(i - 1 < 0) && i + 1 < alturas.length) {
                if (alturas[0] > alturas[1]) {
                    picos++;
                }
                if (alturas[0] == alturas[alturas.length - 1]) {
                    picos = 0;
                }
                if (alturas[i] > alturas[i - 1] && alturas[i] > alturas[i + 1]) {
                    picos++;
                }
            }
        }
        return picos;
    }

    @Test
    void testContarPicos_CasoBase() {
        int[] alturas = { 1, 2, 3, 2, 1 };
        assertEquals(1, contarPicos(alturas));
    }
    @Test
    void testContarPicos_MultiplesPicos() {
        int[] alturas = { 1, 2, 3, 2, 1, 0, 1, 2, 3, 2, 1 };
        assertEquals(2, contarPicos(alturas));
    }
    @Test
    void testContarPicos_PicoAlFinal() {
        int[] alturas = { 1, 2, 3, 4, 5 };
        assertEquals(1, contarPicos(alturas));
    }
    @Test
    void testContarPicos_PicoEnInicio() {
        int[] alturas = { 5, 4, 3, 2, 3, 4, 4 };
        assertEquals(1, contarPicos(alturas));
    }
    @Test
    void testContarPicos_MontañaCircularSinPicos() {
        int[] alturas = { 3, 2, 1, 2, 3 };
        assertEquals(0, contarPicos(alturas));
    }
    @Test
    void testContarPicos_MontañaCircularConVariosPicos() {
        int[] alturas = { 3, 2, 1, 2, 1, 2, 1, 2, 3 };
        assertEquals(2, contarPicos(alturas));
    }

}
