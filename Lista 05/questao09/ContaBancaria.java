package questao09;

public class ContaBancaria {

    private double balance;
    private double saldo;
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double saldo) {
        balance += saldo;
    }

    public void saque(double saldo) throws InsufficientFundsException {
        if (balance < saldo) {
            throw new InsufficientFundsException("Saldo insuficiente!");
        }
        balance -= saldo;
    }
}


