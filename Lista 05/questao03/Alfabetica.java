package questao03;

import java.util.Comparator;

public class Alfabetica implements Comparator<Funcionarios> {

    @Override
    public int compare(Funcionarios f1, Funcionarios f2) {

        if (f1.getNome().compareTo(f2.getNome()) > 0){

            return 1 ;
 

        }
        else {
            return -1 ;
        }
        
    }
    
}
