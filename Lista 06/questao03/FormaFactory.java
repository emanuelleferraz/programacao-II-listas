package questao03;

public class FormaFactory {

    public static FormasGeometricas CriarForma(String forma){
        if(forma == null){
            return null;
        }

        if(forma.equalsIgnoreCase("circulo")){
            return new Circulo();

        } else if(forma.equalsIgnoreCase("quadrado")){
            return new Quadrado();

        } else if(forma.equalsIgnoreCase("triangulo")){
            return new Triangulo();
        }
        return null;
    }
    
}
