package questao05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento {

    public static void main(String[] args) {
        
        int x;
        int y;
        int r;

        try {
            try (Scanner teclado = new Scanner (System.in)) {
                System.out.println ("Eu sei dividir");
                System.out.println("Informe o primeiro valor: ");
                x = teclado.nextInt();
                System.out.println("Informe o segundo valor: ");
                y =  teclado.nextInt();
            }
            r = x/y;
            
            System.out.println("O resultado da divisao:" +r);
    }
        catch (ArithmeticException e){
            System.out.println("Erro: Não é permitida divisão por 0!");
           
        }

        catch(InputMismatchException e){
            System.out.println("Erro: Entrada inválida. Informe somente numeros inteiros!");
        }

        System.out.println("Finalizando programa...");   
    }
    
}
