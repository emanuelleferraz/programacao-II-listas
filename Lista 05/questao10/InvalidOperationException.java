package questao10;

public class InvalidOperationException extends RuntimeException {

    private String aviso;

    public String getAviso() {
        return aviso;
    }

    public void setAviso(String aviso) {
        this.aviso = aviso;
    }

    public InvalidOperationException(String aviso) {
    
        this.aviso = aviso;
    }
    
}
