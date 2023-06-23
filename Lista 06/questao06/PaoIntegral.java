package questao06;

public class PaoIntegral implements FabricaPaes, SanduichesIngredientFactory {

    @Override
    public void exibirPao(){
        System.out.println("Pão Integral");
    }

    
    @Override
    public SanduichesCG criarSanduicheCG(){
        return null;
    }

    @Override
    public SanduichesRT criarSanduicheRT(){
        return null;
    }

    @Override
    public SanduichesJP criarSanduicheJP(){
        return null;
    }
    
}
