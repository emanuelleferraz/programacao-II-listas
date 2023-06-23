package questao06;

public class QueijoMussarela implements FabricaQueijos, SanduichesIngredientFactory {

    @Override
    public void exibirQueijo(){
        System.out.println("Queijo Mussarela");
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
