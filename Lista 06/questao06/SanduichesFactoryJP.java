package questao06;

public class SanduichesFactoryJP implements SanduichesIngredientFactory {

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
        return new SanduichesJP();
    }
    
}
