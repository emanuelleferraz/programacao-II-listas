package questao04;
public class ExceptionTratamento {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1(){
        System.out.println("Inicio do moetodo1");
        metodo2();
        System.out.println("Fim do metodo1");

    }

    static void metodo2() {
        
        System.out.println("Inicio do metodo2");

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
    System.out.println("Finalizando o programa...");
   
    }
    
}
