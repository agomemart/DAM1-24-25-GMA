//Adrián Gómez Martínez

package contornos;

public class DiscountSystem {
    public static double applyDiscount(double amount, boolean isLoyalCustomer) {
        if (amount < 0) {
            throw new IllegalArgumentException("O importe non pode ser negativo");
        }

        double discount = 0.0;

        if (amount >= 50 && amount <= 100) {
            discount = 0.05;
        } else if (amount > 100) {
            discount = 0.10;
        }

        if (isLoyalCustomer && amount >= 200) {
            discount += 0.05; //Aquí debería de ser += porque si no se está restando el descuento adiccional en vez de sumárselo
        }

        double finalAmount = amount - (amount * discount);

        return finalAmount;
    }
}
