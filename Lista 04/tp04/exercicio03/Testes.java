package tp04.exercicio03;

public class Testes extends Number {
    
    public static void main(String[] args) {
        
        Number num = new Number();
        Number num2 = new Number();
        Number num3 = new Number();

        num.setNumero(3);
        num2.setNumero(2);
        num3.setNumero(3);

        //Fazendo o teste do equals para comparar se os numeros são iguais
        //False para: não são iguais e true para: são iguais.
        System.out.println(num.equals(num2));
        System.out.println(num.equals(num3));
        System.out.println(num2.equals(num3));

        //Utilizando o método ToString para mostrar o valor armazenado
        System.out.println(num.toString());
        System.out.println(num2.toString());
        System.out.println(num3.toString());

        //Utilizando o método hashCode para mostrar o valor armazenado
        System.out.println(num.hashCode());
        System.out.println(num2.hashCode());
        System.out.println(num3.hashCode());
    }
}
