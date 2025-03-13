package contornos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void tieneMenosCaracteres() {
        PasswordValidator p = new PasswordValidator();
        boolean resultado = p.isValid("A000000");
        assertEquals(false, resultado);
    }

    @Test
    void tienIgualCaracteres() {
        PasswordValidator p = new PasswordValidator();
        boolean resultado = p.isValid("A0000000");
        assertEquals(true, resultado);
    }

    @Test
    void tieneMasCaracteres() {
        PasswordValidator p = new PasswordValidator();
        boolean resultado = p.isValid("A00000000");
        assertEquals(true, resultado);
    }

    @Test
    void noTieneLetraMayuscula() {
        PasswordValidator p = new PasswordValidator();
        boolean resultado = p.isValid("abc12300");
        assertEquals(false, resultado);
    }

    @Test
    void tieneLetraMayuscula() {
        PasswordValidator p = new PasswordValidator();
        boolean resultado = p.isValid("Abc123..");
        assertEquals(true, resultado);
    }

    @Test
    void noTieneDigito() {
        PasswordValidator p = new PasswordValidator();
        boolean resultado = p.isValid("Abcdefgh");
        assertEquals(false, resultado);
    }

    @Test
    void tieneDigito() {
        PasswordValidator p = new PasswordValidator();
        boolean resultado = p.isValid("Abcdef00");
        assertEquals(true, resultado);
    }
}