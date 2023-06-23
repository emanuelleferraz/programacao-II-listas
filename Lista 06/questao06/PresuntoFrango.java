package questao06;

public class PresuntoFrango implements FabricaPresunto, SanduichesIngredientFactory {

    @Override
    public void exibirPresunto(){
        System.out.println("Presunto de Frango");
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
