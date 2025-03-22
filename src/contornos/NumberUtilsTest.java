package contornos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void primo() {
        NumberUtils nu = new NumberUtils();
        assertTrue(NumberUtils.isPrime(7));
        assertTrue(NumberUtils.isPrime(11));
    }

    @Test
    void noPrimo() {
        NumberUtils nu = new NumberUtils();
        assertFalse(NumberUtils.isPrime(10));
        assertFalse(NumberUtils.isPrime(2));
    }
}