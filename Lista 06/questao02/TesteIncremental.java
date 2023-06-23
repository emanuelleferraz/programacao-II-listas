package questao02;

public class TesteIncremental {

    public static void main(String[] args) {
        
        for(int i = 0; i < 10; i++){
            Incremental inc = Incremental.getInstancia();
            System.out.println("Objeto " + i + ": " + inc);
        }
    }
    
}
