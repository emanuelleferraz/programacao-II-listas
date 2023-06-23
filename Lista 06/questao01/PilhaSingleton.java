package questao01;

public class PilhaSingleton {

    private static PilhaSingleton instancia = null;

    private PilhaSingleton(){

    }

    public static PilhaSingleton GetInstancia(){
        if(instancia == null ){
            instancia = new PilhaSingleton();

        } 
        return instancia;
    }
    
}
