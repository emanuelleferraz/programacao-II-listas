package questao03;

import java.util.ArrayList;
import java.util.Collections;

public class Testes {

    public static void main(String[] args) {
        
        ArrayList<Funcionarios> lista = new ArrayList<>();

        Funcionarios f1 = new Funcionarios("Maria", 1.320, 1111, 3.2021);
        Funcionarios f2 = new Funcionarios("Joana", 1.720, 2222, 12.2022);
        Funcionarios f3 = new Funcionarios("João", 2.420, 3333, 11.2020);
        Funcionarios f4 = new Funcionarios("Clarice", 5.320, 4444, 1.2017);
        Funcionarios f5 = new Funcionarios("Camila", 7.320, 5555, 5.2019);

        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);
        lista.add(f5);

        System.out.println("Funcionarios organizados por ordem crescente de salário: ");
        Collections.sort(lista, new Crescente());
        for(Funcionarios salario : lista){
            System.out.println(salario);
        }
        System.out.println("");

        System.out.println("Funcionarios organizados por ordem alfabética:");
        Collections.sort(lista, new Alfabetica());
        for(Funcionarios nome : lista){
            System.out.println(nome);
        }
        System.out.println("");

        System.out.println("Maior Salário: " + Collections.max(lista, new CompareSalario()));
        System.out.println("Menor Salário: " + Collections.min(lista, new CompareSalario()));
        System.out.println("");

        System.out.println("Funcionário mais experiente: " + Collections.min(lista, new CompareData()));
        System.out.println("Funcionário mais experiente: " + Collections.max(lista, new CompareData()));
        


    }
    
}
