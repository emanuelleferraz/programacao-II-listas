package questao03;

public class Funcionarios {

    private String nome;
    Double salario;
    private int ID;
    Double data;

    public Funcionarios(String nome, double salario, int iD, Double data) {
        this.nome = nome;
        this.salario = salario;
        ID = iD;
        this.data = data;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public Double getData() {
        return data;
    }

    public void setData(Double data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data: " + data + ", ID: " + ID + ", Nome: " + nome + ", Salario: " + salario ;
    }

}
