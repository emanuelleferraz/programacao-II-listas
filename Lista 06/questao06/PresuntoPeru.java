package questao06;

public class PresuntoPeru implements FabricaPresunto, SanduichesIngredientFactory {

    @Override
    public void exibirPresunto(){
        System.out.println("Presunto de Peru");
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
