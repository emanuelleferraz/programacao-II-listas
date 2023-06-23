package questao01;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

    public static void main(String[] args) {
        
        Set<String> nome = new HashSet<>();

        nome.add("Carlos");
        nome.add("Laura");
        nome.add("João");
        nome.add("Amanda");
        nome.add("João");
        nome.add("Laura");

        System.out.println(nome);

        //Remover nome
        if(nome.remove("Carlos")){
            System.out.println("Nome removido!");

        } else {
            System.out.println("Erro: nome não pertence ao conjunto!");
        }

        System.out.println(nome);

        //Verificação de nome armazenado
        if(nome.contains("Amanda")){
            System.out.println("Nome cadastrado!");

        } else {
            System.out.println("Nome não está cadastrado!");
        }

        //Apagando todo o conjunto
        nome.clear();
        System.out.println("Conjunto removido!");
        System.out.println(nome);
    }
    
}
