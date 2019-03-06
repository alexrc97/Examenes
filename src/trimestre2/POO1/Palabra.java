package trimestre2.POO1;

public class Palabra {
	private String word;
	
	public Palabra(String word) {
		this.word = word;
	}
	public String mayuscula () {
		return word.toUpperCase();
	}
	public String minuscula () {
		return word.toLowerCase();
	}
	@Override
	public String toString() {
		return "" + word + "";
	}
	public int numeroLetras () {
		return word.length();
	}
	public char primeraLetra () {
		return word.charAt(0);
	}
	public char ultimaLetra () {
		return word.charAt(word.length()-1);
	}
	public static void main(String[] args) {
		Palabra p = new Palabra("Hola");
		System.out.printf("La palabra es %s%n",p.toString());
		System.out.println("Y en minuscula es " + p.minuscula());
		System.out.println("Y en mayuscula es " + p.mayuscula());
		System.out.println("La primera letra es " + p.primeraLetra());
		System.out.println("la ultima letra es " + p.ultimaLetra());

		
	}
}
	