package contornos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit() {
        BankAccount b1 = new BankAccount(100);
        b1.deposit(50);
        assertEquals(150, b1.getBalance());
    }

    @Test
    void withdraw() {
        BankAccount b1 = new BankAccount(100);
        b1.withdraw(30);
        assertEquals(70, b1.getBalance());
    }

    @Test
    void withdrawInsuficiente() {
        BankAccount b1 = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> {
            b1.withdraw(100);
        }, "Debe lanzar excepción");
    }

    @Test
    void depositNegativeAmount() {
        BankAccount b1 = new BankAccount(100);
        b1.deposit(-20);
        assertEquals(100, b1.getBalance(), "No debe cambiar si el saldo del deposito es negativo");
    }
}