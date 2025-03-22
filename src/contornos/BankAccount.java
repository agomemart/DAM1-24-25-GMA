package contornos;

public class BankAccount {
        private double balance;
        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;//Cambio de -= a +=
            }
        }
        public void withdraw(double amount) {
            if (amount >= balance) {//Añado >=
                throw new IllegalArgumentException("Saldo insuficiente");
            }
            balance -= amount;
        }
        public double getBalance() {
            return balance;
        }
}