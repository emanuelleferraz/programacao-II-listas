package questao08;

import java.util.InputMismatchException;

public class TesteDuplo {

    public static void main(String[] args) {

        TesteException();
        
    }

    public static void TesteException(){
        System.out.println("Inicio do método");
        try{
            int[] array = new int [10];
    
            for (int i =0 ; i <= 15; i++){
    
                array[i] = i;
                System.out.println(i);
            }
            System.out.println("Fim do metodo");
        }
        catch(InputMismatchException e ){
            System.out.println("Erro: Entrada inválida!");
        }

    //Tratamento em outro escopo
    
        try{
            int[] array = new int [10];
    
            for (int i =0 ; i <= 15; i++){
    
                array[i] = i;
                System.out.println(i);
            }
            System.out.println("Fim do metodo");
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Erro: Posição inválida acessada!");
        }
    }

    
}
