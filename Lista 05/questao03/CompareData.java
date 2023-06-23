package questao03;

import java.util.Comparator;

public class CompareData implements Comparator<Funcionarios> {

    @Override
    public int compare(Funcionarios f1, Funcionarios f2) {

        if (f1.getData().compareTo(f2.getData()) > 0){

            return 1 ;
 

        }
        else {
            return -1 ;
        }
        
    }
    
}
