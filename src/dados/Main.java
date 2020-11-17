package dados;

public class Main {

	public static void main(String[] args) {
		int acumulador=0;
		Dado dado = new Dado(6);
		Thread hilos[] = new Thread[3];
		for (int i = 0; i < hilos.length; i++) {
			hilos[i] = new Thread(new Tarea(dado));
		}
		for (int i = 0; i < hilos.length; i++) {
			hilos[i].start();
		}
		for (int i = 0; i < hilos.length; i++) {
			try {
				hilos[i].join();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("Numero %d: %d \n",i+1, dado.obetnerElemento(i));
			acumulador+=dado.obetnerElemento(i);
		}
		System.out.println("En total se ha lanzado el dado: "+acumulador+" veces");

		

	}

}
