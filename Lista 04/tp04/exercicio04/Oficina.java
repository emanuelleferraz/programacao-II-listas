package tp04.exercicio04;

import java.util.Random;

public class Oficina {


    public static Object proximo(){

        Random random = new Random();
        int aleatorio = random.nextInt(2);

        if(aleatorio == 0){
            return new Automovel();

        } else {
            return new Bicicleta();
        }
        
    }

    public void manutencao(Veiculo v){
        
        Automovel aut = new Automovel();
        Bicicleta bike = new Bicicleta();
        if(v.equals(aut)){
            aut.mudarOleo();
            v.ajustar();
            v.limpar();
            v.listarVerificadores();

        } else if(v.equals(bike)){
            v.ajustar();
            v.limpar();
            v.listarVerificadores();
        }
    }
    
}
