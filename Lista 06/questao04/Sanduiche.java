package questao04;

public class Sanduiche {

    private FabricaIngredientes pao;
    private FabricaIngredientes queijo;
    private FabricaIngredientes presunto;
    private FabricaIngredientes salada;

    public Sanduiche(String pao, String queijo, String presunto, String salada){
        this.pao = IngredientesFactory.CriarSanduiche(pao);
        this.queijo = IngredientesFactory.CriarSanduiche(queijo);
        this.presunto = IngredientesFactory.CriarSanduiche(presunto);
        this.salada = IngredientesFactory.CriarSanduiche(salada);
    }

    public FabricaIngredientes getPao(){
        return this.pao;
    }

    public FabricaIngredientes getQueijo() {
        return queijo;
    }

    public FabricaIngredientes getPresunto() {
        return presunto;
    }

    public FabricaIngredientes getSalada() {
        return salada;
    }
    
}
