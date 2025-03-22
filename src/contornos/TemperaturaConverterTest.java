package contornos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class TemperaturaConverterTest {

    @Test
    void prueba1() {
        TemperaturaConverter convertirTemperatura = new TemperaturaConverter();
        Assertions.assertEquals(32, TemperaturaConverter.celsiusToFahrenheit(0.0));
    }

    @Test
    void prueba2() {
        TemperaturaConverter convertirTemperatura = new TemperaturaConverter();
        Assertions.assertEquals(104, TemperaturaConverter.celsiusToFahrenheit(40.0));
    }

    @Test
    void prueba3() {
        TemperaturaConverter convertirTemperatura = new TemperaturaConverter();
        Assertions.assertEquals(59, TemperaturaConverter.celsiusToFahrenheit(15.0));
    }
}