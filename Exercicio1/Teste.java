package Exercicio1;

public class Teste {

    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro("Totó");
        c1.setPeso(35);
        c1.setRaca("chow chow");

        System.out.println(" " +c1.toString());

        Peixe p1 = new Peixe("Peixoto");
        p1.setPeso(10);
        p1.setTipoHabitat("água doce");

        System.out.println(" " +p1.toString());
    }
    
}
