package questao02;
public class Funcionario {

    private String ID;
    private String nome;
    private String cargo;
    private double salario;
    
    public Funcionario(String iD, String nome, String cargo, double salario) {
        ID = iD;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario: [ID:" + ID + ", cargo:" + cargo + ", nome:" + nome + ", salario:" + salario + "]";
    }
    
}
