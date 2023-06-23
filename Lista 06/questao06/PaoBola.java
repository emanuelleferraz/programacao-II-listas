package questao06;

public class PaoBola implements FabricaPaes, SanduichesIngredientFactory {

    @Override
    public void exibirPao(){
        System.out.println("Pão Bola");
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
