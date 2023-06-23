package questao08;

public class TesteConverteTemp {

    public static void main(String[] args) {
        
        MedidorFahrenheit fanhrenheit = new MedidorFahrenheit();
        MedidorCelsiusIF celsius = new AdapterFahrenheit(fanhrenheit);
        
        System.out.println(celsius.medirTemperatura());
    }
    
}
