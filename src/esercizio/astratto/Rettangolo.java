package esercizio.astratto;

public class Rettangolo extends FiguraGeometrica{
	
	public Rettangolo() {
		
	}
	
	public Rettangolo(int altezza, int larghezza) {
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
		return "Base: " + getLarghezza() + "\n"
				+ "Altezza: " + getAltezza();
	}

}
