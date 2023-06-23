package questao02;

import java.util.HashMap;
import java.util.Map;

public class TesteFuncionario {

    public static void main(String[] args) {
        
        Map<String, String> funcionario = new HashMap<>();

        funcionario.put("a1234", "Steve Jobs");
        funcionario.put("a1235","Scott McNealy");
        funcionario.put("a1236" ,"Jeff Bezos");
        funcionario.put("a1237", "Larry Ellison");
        funcionario.put("a1238", "Bill Gates");

        //Teste com funcionario não mapeado:
        System.out.println(funcionario.get("a2134"));

        System.out.println("Funcionario: " + funcionario.get("a1234"));
        System.out.println("Funcionario: " + funcionario.get("a1235"));

        System.out.println("Funcionario: " + QualquerCaso(funcionario, "A1234"));
        System.out.println("");

        //Collection<String> chaves = funcionario.keySet();
        System.out.println("Funcionarios: ");
        for(String chave : funcionario.keySet()){
            System.out.println(chave + "  " + funcionario.get(chave));
        }
        System.out.println("");

        System.out.println("Funcionarios: ");
        for(String chave : funcionario.keySet()){
            System.out.println(chave + "  " + funcionario.get(chave));
        }
        System.out.println("");

    }

     //Método para funcionar em qualquer caso:
     public static String QualquerCaso(Map<String, String> mapa, String chave) {
        String chavePadrao = chave.toLowerCase();
        return mapa.get(chavePadrao);
    }
 
    
}
