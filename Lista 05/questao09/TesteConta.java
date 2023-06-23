package questao09;

public class TesteConta {

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }

    public static void someMethod2() throws InsufficientFundsException {
        throw new InsufficientFundsException("Saldo insuficiente!");
    }

    public static void someMethod() throws InsufficientFundsException {
        try {
            someMethod2();
        } catch (InsufficientFundsException e) {
            throw e; 
        }
    }
    
}
