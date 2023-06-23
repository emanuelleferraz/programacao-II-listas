package tp04.exercicio02;

public class Aniversario extends CartaoWeb {
    
    public Aniversario(String destinatario){
        super(destinatario);
    }

    @Override
    public void showMessege(){
        System.out.println(getDestinatario());
        System.out.println("Feliz Aniversário. Muitos anos de vida!");
    }
}
