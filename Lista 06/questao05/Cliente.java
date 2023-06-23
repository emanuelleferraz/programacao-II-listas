package questao05;

public class Cliente {

    public static void main(String[] args) {
        
        //Criando carro Popular
        FabricaCarros fiat = new FabricaFiat();
        CarroPopular carro = fiat.criarCarroPopular();
        carro.exibirInfoPopular();

        FabricaCarros ford = new FabricaFord();
        CarroPopular carro2 = ford.criarCarroPopular();
        carro2.exibirInfoPopular();

        //Criando carro Sedan
        FabricaCarros fiat2 = new FabricaFiat();
        CarroSedan carro3 = fiat2.criarCarroSedan();
        carro3.exibirInfoSedan();

        FabricaCarros ford2 = new FabricaFord();
        CarroSedan carro4 = ford2.criarCarroSedan();
        carro4.exibirInfoSedan();
    }
    
}
