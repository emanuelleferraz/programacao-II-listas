package questao02;

public class Incremental {

    private static int count = 0;
	private static int numero;
	private static Incremental instancia = null;

	private Incremental() {
	}

	public static Incremental getInstancia() {
		if (instancia == null) {
			instancia = new Incremental();
		}
		numero = ++count;
		return instancia;
	}

	public String toString() {
		return "Incremental " + numero;
	}
    
}
