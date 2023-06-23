package tp04.exercicio02;

public class DiaDosNamorados extends CartaoWeb {
    
    public DiaDosNamorados(String destinatario){
        super(destinatario);
    }

    @Override
    public void showMessege(){
        System.out.println(getDestinatario());
        System.out.println("Feliz Dia dos Namorados. Amo você!");
    }
}
