package contornos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void palindromo() {
        StringUtils st1 = new StringUtils();
        assertTrue(StringUtils.isPalindrome("ana"));
        assertTrue(StringUtils.isPalindrome("reconocer"));
    }

    @Test
    void noEsPalindromo() {
        StringUtils st1 = new StringUtils();
        assertFalse(StringUtils.isPalindrome("pagar"));
        assertFalse(StringUtils.isPalindrome("buscar"));
    }
}