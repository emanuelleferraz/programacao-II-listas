package tp04.exercicio02;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        
        ArrayList<CartaoWeb> cartoes = new ArrayList<>();

        Aniversario a = new Aniversario("Maria");
        Natal n = new Natal("Márcia");
        DiaDosNamorados dn = new DiaDosNamorados("Marcelo");

        cartoes.add(a);
        cartoes.add(n);
        cartoes.add(dn);

        for(CartaoWeb c : cartoes){
            c.showMessege();
        }
    }
    
}
