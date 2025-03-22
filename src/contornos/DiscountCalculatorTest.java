package contornos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    @Test
    void descuentoNoValido() {
        DiscountCalculator dc = new DiscountCalculator();
        assertThrows(IllegalArgumentException.class, () -> {
            DiscountCalculator.applyDiscount(100,-1);}, "Debe lanzar excepción");
        assertThrows(IllegalArgumentException.class, () -> {
            DiscountCalculator.applyDiscount(100,101);}, "Debe lanzar excepción");
    }

    @Test
    void descuentoValido() {
        DiscountCalculator dc = new DiscountCalculator();
        assertEquals(99, DiscountCalculator.applyDiscount(100,1));
        assertEquals(0, DiscountCalculator.applyDiscount(100,100));
    }
}