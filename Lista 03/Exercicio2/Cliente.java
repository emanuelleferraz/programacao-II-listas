package Exercicio2;

public class Cliente extends Pessoa {

    private double valorDivida;
    private int anoNascimento;

    public double getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override

    public String toString(){
        return "Nome: " + getNome() + "  Idade: " + getIdade() + "  Sexo: " + getSexo() + "  Ano de Nascimento: " + getAnoNascimento() + "  Valor da Divida: " + getValorDivida();
    }
    
}
