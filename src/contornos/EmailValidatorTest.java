//Adrián Gómez Martínez
package contornos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    void contieneArroba() {
        EmailValidator e = new EmailValidator();
        boolean resultado = e.isValid("hola@hola.com");
        assertEquals(true, resultado);
    }

    @Test
    void noContieneArroba() {
        EmailValidator e = new EmailValidator();
        boolean resultado = e.isValid("holahola.com");
        assertEquals(false, resultado);
    }

    @Test
    void tiene2Partes() {
        EmailValidator e = new EmailValidator();
        boolean resultado = e.isValid("info@info.com");
        assertEquals(true, resultado);
    }

    @Test
    void noTiene2Partes() {
        EmailValidator e = new EmailValidator();
        boolean resultado = e.isValid("info@info@info.com");
        assertEquals(false, resultado);
    }

    @Test
    void contienePunto() {
        EmailValidator e = new EmailValidator();
        boolean resultado = e.isValid("prueba@prueba.com");
        assertEquals(true, resultado);
    }

    @Test
    void noContienePunto() {
        EmailValidator e = new EmailValidator();
        boolean resultado = e.isValid("prueba@pruebacom");
        assertEquals(false, resultado);
    }
}