package questao07;

public class Teste {

    public static void main(String[] args) {

        Conta minhaConta = new Conta(100, 50, 25);
        minhaConta.SaldoAtual();

        try{
            minhaConta.saca();

        } catch (ContaExcecao e){
            System.out.println("Erro: Não é possível realizar a transação. Valor do saldo é inferior ao valor do saque.");

        }
        System.out.println("Valor do saque: " + minhaConta.getSaldo());
        minhaConta.SaldoNaConta();
        System.out.println("Finalizando programa...");

    }
    
}
