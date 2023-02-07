package esercizio.astratto;

public class Main {

	public static void main(String[] args) {
		
		Quadrato q = new Quadrato();
		System.out.println(q.calcoloArea(2, 2));
		System.out.println(q.calcoloPerimetro(2, 2));
		
		System.out.println("------------------");
		
		Rettangolo r = new Rettangolo();
		System.out.println(r.calcoloArea(3, 7));
		System.out.println(r.calcoloPerimetro(3, 7));

	}

}
