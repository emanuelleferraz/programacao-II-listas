package questao10;

public class Calculator {

    public double div(double numero, double valor) throws InvalidOperationException{

        double resultado = numero / valor;
        if(valor < 0){
            InvalidOperationException ex = new InvalidOperationException("Erro: Não é possível dividir por 0!");
            throw ex;

        } else {
            System.out.println("Resultado: " + resultado);
        }

        return 0;

    }

    public double log10(double decimal) throws InvalidOperationException{

        double log = decimal * 10 ;

    if (decimal == 0  || decimal < 0){
       
        InvalidOperationException exc = new InvalidOperationException("Erro: Não é possível realizar a operação com 0 e número negativo!");
        throw exc;
    }
    else {
        System.out.print("Resultado: " + log);
    }
        return 0;
    }
    
}
