package tp04.exercicio04;

public class Automovel extends Veiculo {

    @Override

    public void listarVerificadores(){
        System.out.println("Listar verificadores do Automóvel");
    }

    @Override
    public void ajustar(){
        System.out.println("Ajustar Automóvel");
    }

    @Override
    public void limpar(){
        System.out.println("Limpar Automóvel");
    }

    public void mudarOleo(){
        System.out.println("Mudar óleo do Automóvel");
    }
    
}
