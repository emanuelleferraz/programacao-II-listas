package questao03;

import java.util.Comparator;

public class Crescente implements Comparator<Funcionarios> {

    @Override
    public int compare(Funcionarios f1, Funcionarios f2) {

        if (f1.getSalario().compareTo(f2.getSalario()) > 0){

            return 1 ;
 

        }
        else {
            return -1 ;
        }
        
    }


    
}
