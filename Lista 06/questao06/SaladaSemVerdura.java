package questao06;

public class SaladaSemVerdura implements FabricaSalada, SanduichesIngredientFactory {

    @Override
    public void exibirSalada(){
        System.out.println("Salada sem verdura");
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
