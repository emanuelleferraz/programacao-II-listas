package tp04.exercicio02;

public class Natal extends CartaoWeb {

    public Natal(String destinatario){
        super(destinatario);
    }

    @Override
    public void showMessege(){
        System.out.println(getDestinatario());
        System.out.println("Feliz Natal!");
    }
    
}
