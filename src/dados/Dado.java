package dados;

import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;

public class Dado {
	
	private final AtomicIntegerArray numeros;

	public Dado(int numero) {
	
		this.numeros = new AtomicIntegerArray(numero);
	}

	public void lanzar() {
		
		numeros.addAndGet(new Random().nextInt(6), 1);
	}
	
    public int obetnerElemento(int i) {
        return numeros.get(i);
    }
	

}
