package tp04.exercicio03;

public class Number {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getValue(int numero){
        return numero;
    }

    @Override

    public boolean equals(Object obj){

        if(obj != null && obj instanceof Number){

            return (getNumero() == ((Number) obj).getNumero());

        }  else {
            return false;

        }
    }  
    
    @Override
    public int hashCode(){
        return getNumero();
    }

    @Override
    public String toString(){
        return "Valor armazenado: " + getNumero();
    }
}
