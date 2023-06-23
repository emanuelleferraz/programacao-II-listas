package Exercicio1;

public class Peixe extends Animal {

    private String tipoHabitat;

    public Peixe (String nome){
        super(nome);
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override

    public String toString(){
        return "nome: " + getNome() +"  peso: " + getPeso() + "  tipoHabitat: " + getTipoHabitat();
    } 

}
