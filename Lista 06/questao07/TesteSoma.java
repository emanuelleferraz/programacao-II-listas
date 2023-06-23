package questao07;

public class TesteSoma {

    public static void main(String[] args) {
        
        //Soma antes da alteração
        SomadorExistente existente = new SomadorExistente();
        
        //Soma após a alteração
        System.out.println("Soma após utilização do Adapter: ");
		SomadorEsperado adpter = new AdapterSoma(existente);
		Cliente c2 = new Cliente(adpter);
		c2.executar();
    }
    
}
