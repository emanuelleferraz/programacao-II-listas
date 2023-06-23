package tp04.exercicio04;

public class Teste {
    
    public static void main(String[] args) {
        
        Oficina o = new Oficina();
        Veiculo v;

        for(int i = 0; i < 4; i++){
            v = (Veiculo) Oficina.proximo();
            o.manutencao(v);
        }
    }
}
