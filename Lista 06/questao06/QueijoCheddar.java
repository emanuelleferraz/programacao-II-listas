package questao06;

public class QueijoCheddar implements FabricaQueijos, SanduichesIngredientFactory {

    @Override
    public void exibirQueijo(){
        System.out.println("Queijo Cheddar");
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
