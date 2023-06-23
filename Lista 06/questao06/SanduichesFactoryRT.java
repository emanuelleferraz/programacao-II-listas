package questao06;

public class SanduichesFactoryRT implements SanduichesIngredientFactory {

    @Override
    public SanduichesCG criarSanduicheCG(){
        return new SanduichesCG();
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
