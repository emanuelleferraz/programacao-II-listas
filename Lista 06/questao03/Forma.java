package questao03;

public class Forma {

    private FormasGeometricas forma;

    public Forma(String forma){
        this.forma = FormaFactory.CriarForma(forma);
    }

    public FormasGeometricas getForma(){
        return this.forma;
    }
    
}
