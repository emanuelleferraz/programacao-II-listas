package Exercicio2;

public class Empregado extends Pessoa {

    private double salario;
    private String matricula;

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double valorInss(){

        double formula = salario * 0.11;

        return formula;
    }
    
}
