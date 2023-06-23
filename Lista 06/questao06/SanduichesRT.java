package questao06;

public class SanduichesRT {

    private SanduichesIngredientFactory pao;
    private SanduichesIngredientFactory presunto;
    private SanduichesIngredientFactory queijo;
    private SanduichesIngredientFactory salada;

    public void SanduicheRT(String pao, String presunto, String queijo, String salada){
        this.pao = IngredientesFactory.CriarSanduiche(pao); 
        this.presunto = IngredientesFactory.CriarSanduiche(presunto);
        this.queijo = IngredientesFactory.CriarSanduiche(queijo);
        this.salada = IngredientesFactory.CriarSanduiche(salada);
    }

    public SanduichesIngredientFactory getPao() {
        return pao;
    }

    public SanduichesIngredientFactory getPresunto() {
        return presunto;
    }

    public SanduichesIngredientFactory getQueijo() {
        return queijo;
    }

    public SanduichesIngredientFactory getSalada() {
        return salada;
    }
    
}
