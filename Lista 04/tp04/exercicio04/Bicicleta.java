package tp04.exercicio04;

public class Bicicleta extends Veiculo {

    @Override
    public void listarVerificadores(){
        System.out.println("Listar Verificadores da Bicicleta");
    }

    @Override
    public void limpar(){
        System.out.println("Limpar a Bicicleta");
    }

    @Override
    public void ajustar(){
        System.out.println("Ajustar a Bicicleta");
    }
    
}
