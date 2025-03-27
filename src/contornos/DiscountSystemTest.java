//Adrián Gómez Martínez
package contornos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountSystemTest {

    @Test
    void descuentoNoValido() {
        DiscountSystem ds = new DiscountSystem();
        assertThrows(IllegalArgumentException.class, () -> {
            DiscountSystem.applyDiscount(-1, false);}, "Debe lanzar excepción");
    }

    @Test
    void sinDescuento() {
        DiscountSystem ds = new DiscountSystem();
        assertEquals(49, DiscountSystem.applyDiscount(49,true), 0.1);
        assertEquals(49, DiscountSystem.applyDiscount(49,false), 0.1);
    }

    @Test
    void descuento5Porciento() {
        DiscountSystem ds = new DiscountSystem();
        assertEquals(47.5, DiscountSystem.applyDiscount(50,true), 0.1);
        assertEquals(47.5, DiscountSystem.applyDiscount(50,false), 0.1);
        assertEquals(95, DiscountSystem.applyDiscount(100,true), 0.1);
        assertEquals(95, DiscountSystem.applyDiscount(100,false), 0.1);
    }

    @Test
    void descuento10Porciento() {
        DiscountSystem ds = new DiscountSystem();
        assertEquals(90.9, DiscountSystem.applyDiscount(101,true), 0.1);
        assertEquals(90.9, DiscountSystem.applyDiscount(101,false), 0.1);
    }

    @Test
    void descuento5PorcientoAdicional() {
        DiscountSystem ds = new DiscountSystem();
        assertEquals(170.85, DiscountSystem.applyDiscount(201,true), 0.1);
    }

    @Test
    void noDescuento5PorcientoAdicional() {
        DiscountSystem ds = new DiscountSystem();
        assertEquals(180.9, DiscountSystem.applyDiscount(201,false), 0.1);
    }
}