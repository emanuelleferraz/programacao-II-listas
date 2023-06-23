package questao01;

public class Produto {

    private int ID;
    private String nome;
    private double preco;

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(int ID, String nome, double preco){
        this.ID = ID;
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (ID != other.ID)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [ID: " + ID + ", nome: " + nome + ", preco: " + preco + "]";
    }
}
