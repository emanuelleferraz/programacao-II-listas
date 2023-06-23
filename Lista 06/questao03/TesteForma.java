package questao03;

public class TesteForma {

    public static void main(String[] args) {

        Forma geometrica = new Forma("quadrado");

        FormasGeometricas forma = geometrica.getForma();
        forma.desenhar();
        
    }
    
}
