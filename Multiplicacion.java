public class Multiplicacion {

	private int n;
	private int v;
	
	Multiplicacion(int n, int v) {
		this.n = n;
		this.v = v;
	}

	public int getMultiplicacion() {
		return calcular(n,v);
	}

	private int calcular(int n, int v) {
		if(v == 1) {
			return n;
		}
			
		return n + calcular(n, v - 1);
	}

}