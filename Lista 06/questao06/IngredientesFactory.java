package questao06;

public class IngredientesFactory {

    public static SanduichesIngredientFactory CriarSanduiche(String sanduiche){
        if(sanduiche ==  null){
            return null;
        }
        if(sanduiche == "bola"){
            return new PaoBola();

        } else if(sanduiche == "francês"){
            return new PaoFrances();

        } else if(sanduiche == "integral"){
            return new PaoIntegral();

        } else if(sanduiche == "prato"){
            return new QueijoPrato();

        } else if(sanduiche == "cheddar"){
            return new QueijoCheddar();

        } else if(sanduiche == "mussarela"){
            return new QueijoMussarela();

        } else if(sanduiche == "frango"){
            return new PresuntoFrango();

        } else if(sanduiche == "peru"){
            return new PresuntoPeru();

        } else if(sanduiche == "sem verdura"){
            return new SaladaSemVerdura();

        } else if(sanduiche == "com verdura"){
            return new SaladaComVerdura();
        }
        return null;
    }
    
}
