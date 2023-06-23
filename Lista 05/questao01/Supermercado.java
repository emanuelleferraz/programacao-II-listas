package questao01;

import java.util.HashSet;
import java.util.Set;

public class Supermercado {

    public static void main(String[] args) {
        
        Set<Produto> produtos = new HashSet<>();

        Produto p1 = new Produto(1111, "Danix", 2.50);
        Produto p2 = new Produto(2222, "Skala", 10.49);
        Produto p3 = new Produto(1111, "Danix", 2.60);
        Produto p4 = new Produto(3333, "Pirakids", 1.49);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        if(produtos.equals(produtos)){
            System.out.println("Erro: Produto já esta cadastrado!");
        }

        for(Produto produto : produtos){
            System.out.println(produto.toString());
        }

    }
    
}
