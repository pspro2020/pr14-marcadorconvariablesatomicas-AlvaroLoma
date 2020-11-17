package dados;

public class Tarea implements Runnable {
	private Dado dado;
	

	public Tarea(Dado dado) {
		
		this.dado = dado;
	}


	@Override
	public void run() {
		
		for (int i = 0; i < 10000; i++) {
			dado.lanzar();
		}
		
		
	}

}
