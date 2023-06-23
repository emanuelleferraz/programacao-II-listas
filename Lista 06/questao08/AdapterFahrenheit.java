package questao08;

public class AdapterFahrenheit implements MedidorCelsiusIF {

    private MedidorFahrenheit temp;

    public AdapterFahrenheit(MedidorFahrenheit temp) {
        this.temp = temp;
    }

    @Override
    public double medirTemperatura(){
        double F = temp.getTemperaturaFahrenheit();
        return (F - 32) / 1.8;
    }
    
}
