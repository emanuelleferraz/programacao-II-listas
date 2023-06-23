package questao05;

public class FabricaFord extends FabricaCarros {

    @Override
    public CarroPopular criarCarroPopular(){
        return new Fiesta();
    }

    @Override
    public CarroSedan criarCarroSedan(){
        return new FiestaSedan();
    }
    
}
