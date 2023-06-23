package Exercicio1;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro (String nome){
        super(nome);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override

    public String toString(){
        return "nome: " + getNome() + "  peso: " + getPeso() + "  raca: " + getRaca();
    }

}
