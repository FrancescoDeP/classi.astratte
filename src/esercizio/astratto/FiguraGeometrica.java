package esercizio.astratto;

public abstract class FiguraGeometrica {
	
	private int altezza;
	private int larghezza;
	
	public FiguraGeometrica() {
		
	}
	
//	public FiguraGeometrica(int altezza) {
//		this.altezza = altezza;
//	}
	
	public FiguraGeometrica(int altezza, int larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	public int getAltezza() {
		return altezza;
	}
	
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	public int getLarghezza() {
		return larghezza;
	}
	
	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}
	
	public abstract int calcoloArea(int a, int b);
	
	public abstract int calcoloPerimetro(int a, int b);
	
	@Override
	public String toString() {
		return "Altezza: " + altezza + "\n"
				+ "Larghezza: " + larghezza;
	}
	
	

}
