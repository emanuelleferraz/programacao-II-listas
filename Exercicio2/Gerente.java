package Exercicio2;

public class Gerente extends Empregado {

    private String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override

    public String toString(){
        return "Nome: " + getNome() + "  Idade: " + getIdade() + "  Matrícula: " + getMatricula() + "  Nome da Gerencia: " + getNomeGerencia() + "  Valor do Inss: " + valorInss();
    }
    
}
