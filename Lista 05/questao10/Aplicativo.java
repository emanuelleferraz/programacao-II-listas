package questao10;

public class Aplicativo {

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

        try{
            calc.div(1, 0);

        } catch(InvalidOperationException e) {
            System.out.println("Erro: Não é possível fazer divisão por 0!");
            e.printStackTrace();
        }

        try{
            calc.log10(-1);

        } catch(InvalidOperationException e){
            System.out.println("Erro: Não é possível realizar a operação com numero negativo!");
            e.printStackTrace();
        }
    }
    
}
