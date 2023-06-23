package questao07;

public class Conta {

    private double saque;
    private double saldo;
    private double deposito;
    
    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public Conta(double saque, double saldo, double deposito) {
        this.saque = saque;
        this.saldo = saldo;
        this.deposito = deposito;
    }

    public void SaldoAtual(){
        saldo = saldo + deposito;
    }

    public void SaldoNaConta(){

        double valor =  saldo - saque;

        if(valor > 0){
            System.out.println("Saldo: " + valor);

        } else {
            System.out.println("Saldo: " + saldo);
        }

    }

    public void saca() throws ContaExcecao{

        if(this.saldo < this.saque){
            ContaExcecao exception = new ContaExcecao("Erro: O saldo é insuficiente para a transação!");

            throw exception;

        } else {
            System.out.println("Saque realizado com sucesso!");
        }
    }
    
}
