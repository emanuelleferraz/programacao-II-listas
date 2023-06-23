package questao06;

public class TesteSaque {
    
    public static void main(String[] args) {
        
        Conta minhConta = new Conta(100, 50, 25);
        minhConta.SaldoAtual();

        try{
            minhConta.saca();

        } catch (ContaExcecao e){
            System.out.println("Erro: Não é possível realizar a transação. Valor do saldo é inferior ao valor do saque.");

        }
        System.out.println("Finalizando programa...");
    }
}
