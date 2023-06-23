package questao07;

import java.util.ArrayList;
import java.util.List;

public class AdapterSoma implements SomadorEsperado {

    private SomadorExistente somador;

    public AdapterSoma(SomadorExistente somador) {
        this.somador = somador;
    }

    @Override
    public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int numero : vetor) {
			lista.add(numero);
		}

		return somador.somaLista(lista);
	}
}
