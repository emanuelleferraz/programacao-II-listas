package questao03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Intervalo {

    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            Random gerar = new Random();
            Integer num = gerar.nextInt(99);
            
            numeros.add(num);
        }

        System.out.println("Lista de Numeros:");
        System.out.println(numeros);
        System.out.println("");

        System.out.println("Maior numero: " + Collections.max(numeros));
        System.out.println("Menor numero: " + Collections.min(numeros));

        System.out.println("Numero de vezes que o menor numero apareceu: " + Collections.frequency(numeros, Collections.min(numeros)));
        System.out.println("");

        System.out.println("Lista de numero em ordem CRESCENTE: ");
        Collections.sort(numeros);
    }
    
}
