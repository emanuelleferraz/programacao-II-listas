package questao06;

public class SaladaComVerdura implements FabricaSalada, SanduichesIngredientFactory {

    @Override
    public void exibirSalada(){
        System.out.println("Salada com verdura");
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
