package questao06;

public class LanchoneteMain {

    public static void main(String[] args) {
        
        SanduichesIngredientFactory sanduiche = new SanduichesFactoryCG();
        SanduichesCG lanche1 = sanduiche.criarSanduicheCG();
        lanche1.SanduicheCG("Bola", "Peru", "Cheddar", "Com Verdura");
        System.out.println(lanche1);

        SanduichesIngredientFactory sanduiche1 = new SanduichesFactoryJP();
        SanduichesJP lanche2 = sanduiche1.criarSanduicheJP();
        lanche2.SanduicheJP("Integral", "Peru", "Prato", "Sem Verdura");
        System.out.println(lanche2);

        SanduichesIngredientFactory sanduiche3 = new SanduichesFactoryRT();
        SanduichesRT lanche3 = sanduiche3.criarSanduicheRT();
        lanche3.SanduicheRT("Frances", "Frango", "Mussarela", "Com Verdura");
        System.out.println(lanche3);
        
    }
    
}
