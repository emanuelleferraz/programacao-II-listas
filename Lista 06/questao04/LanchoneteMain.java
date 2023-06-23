package questao04;

public class LanchoneteMain {

    public static void main(String[] args) {
        
        Sanduiche sanduiche = new Sanduiche("bola", "cheddar", "frango", "sem verdura");
        
        System.out.println("Sanduiche composto de: ");
        
        FabricaIngredientes pao = sanduiche.getPao();
        pao.exibirIngrediente();

        FabricaIngredientes queijo = sanduiche.getQueijo();
        queijo.exibirIngrediente();

        FabricaIngredientes presunto = sanduiche.getPresunto();
        presunto.exibirIngrediente();

        FabricaIngredientes salada = sanduiche.getSalada();
        salada.exibirIngrediente();

    }
    
}
