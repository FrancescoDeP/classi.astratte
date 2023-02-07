package esercizio.astratto;

public class Quadrato extends FiguraGeometrica{
	
	public Quadrato() {
		
	}
	
	public Quadrato(int altezza, int larghezza) {
		super(altezza, larghezza);
	}

	@Override
	public int calcoloArea(int a, int b) {
		return a * b;	
	}

	@Override
	public int calcoloPerimetro(int a, int b) {
		return (a + b) * 2;
	}
	
	@Override
	public String toString() {
		return "Lato: " + getAltezza();
	}

}
