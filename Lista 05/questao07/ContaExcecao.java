package questao07;
public class ContaExcecao extends Exception {

    private String aviso;

    public String getAviso() {
        return aviso;
    }

    public void setAviso(String aviso) {
        this.aviso = aviso;
    }

    public ContaExcecao(String aviso) {
        this.aviso = aviso;
    }
    
    /*public static void Mensagem(String aviso){

        System.out.println("Erro: O saldo é insuficiente!" + aviso);
        
    }*/
    
}
