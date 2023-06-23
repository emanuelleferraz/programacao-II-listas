package questao05;

public class FabricaFiat extends FabricaCarros {

    @Override
    public CarroSedan criarCarroSedan(){
        return new Siena();
    }

    @Override
    public CarroPopular criarCarroPopular(){
        return new Palio();
    }
    
}
