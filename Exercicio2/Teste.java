package Exercicio2;

public class Teste {

    public static void main(String[] args) {

        System.out.println("Cliente:");
        Cliente c1 = new Cliente();
        c1.setNome("Kevin");
        c1.setIdade(22);
        c1.setSexo("Masculino");
        c1.setAnoNascimento(2000);
        c1.setValorDivida(1250);

        System.out.println("" +c1.toString());
        System.out.println("---------------------------");

        System.out.println("Gerente:");
        Gerente g1 = new Gerente();
        g1.setNome("Karina");
        g1.setIdade(28);
        g1.setMatricula("9999");
        g1.setNomeGerencia("Gerente de Marketing");
        g1.valorInss();

        System.out.println("" +g1.toString());
        System.out.println("---------------------------");

        System.out.println("Vendedor:");
        Vendedor v1 = new Vendedor();
        v1.setNome("Danielle");
        v1.setSalario(1200);
        v1.setQntVendas(30);
        v1.setValorVendas(100);

        System.out.println("" +v1.toString());

    }
    
}
