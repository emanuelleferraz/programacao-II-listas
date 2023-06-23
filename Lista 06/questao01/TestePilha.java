package questao01;

public class TestePilha {

    public static void main(String[] args) {
        
        PilhaSingleton pilha = PilhaSingleton.GetInstancia();
        System.out.println("Objeto 1: " + pilha);

        PilhaSingleton pilha2 = PilhaSingleton.GetInstancia();
        System.out.println("Objeto 2: " + pilha2);

        PilhaSingleton pilha3 = PilhaSingleton.GetInstancia();
        System.out.println("Objeto 3: " + pilha3);
    }
    
}
