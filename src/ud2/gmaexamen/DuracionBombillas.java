//Adrián Gómez Martínez
package ud2.gmaexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

/*Las bombillas tienen dos factores que marcan cuándo dejan de funcionar. Por un lado
tienen un número máximo de horas de iluminación y por otro tienen un número máximo de
encendidos. Si enciendes la bombilla y no la vuelves a apagar durará muchísimas horas.
Pero si la enciendes y apagas continuamente, dejará de funcionar mucho antes.
Escribe una función causaFinBombilla() que acepte como parámetros de entrada tres
números enteros positivos.
● El primero es el número de horas que aguanta la bombilla encendida.
● El segundo es el número de encendidos que es capaz de soportar.
● El último es el número de horas que se estima se mantendrá la lámpara encendida
en cada uso (como mucho 10).
La función deberá devolver la causa de la muerte de la bombilla LED como una de las
siguientes cadenas de caracteres:
● "HORAS" si se alcanza el número máximo de horas encendida.
● "ENCENDIDOS" si se alcanza el número máximo de encendidos.
● "ENCENDIDOS + HORAS" si se alcanzan ambos límites simultáneamenes.
● "ERROR" si alguno de los parámetros de entrada tiene un valor incorrecto. */
public class DuracionBombillas {
    public static String causaFinBombilla(int numHorasAguanteEncendida, int numEncendidos,
            int numHorasBombillaEncendida) {
        /*
         * if (numHorasAguanteEncendida > 0 && numEncendidos > 0 &&
         * numHorasBombillaEncendida > 0) {
         * if (numHorasBombillaEncendida >= 10 && numEncendidos > 10) {
         * return "ENCENDIDOS + HORAS";
         * } else if (numEncendidos > 10) {
         * return "ENCENDIDOS";
         * } else if (numHorasBombillaEncendida > numHorasAguanteEncendida ||
         * numHorasBombillaEncendida >= 10) {
         * return "HORAS";
         * } else {
         * return "ERROR";
         * }
         * } else {
         * return "ERROR";
         * }
         */
        String causaFinBombilla;
        if (numHorasAguanteEncendida > 0 && numEncendidos > 0 && numHorasBombillaEncendida <= 10) {
            int horasEstimadasUso = numEncendidos * numHorasBombillaEncendida;
            if (horasEstimadasUso > numHorasAguanteEncendida) {
                causaFinBombilla = "HORAS";
            } else if (horasEstimadasUso < numHorasAguanteEncendida) {
                causaFinBombilla = "ENCENDIDOS";
            } else {
                causaFinBombilla = "ENCENDIDOS + HORAS";
            }
        } else {
            causaFinBombilla = "ERROR";
        }
        return causaFinBombilla;
    }

    @Test
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(0, 10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }

    public static void main(String[] args) {
        causaFinBombilla(1000, 100, 1);
    }
}
