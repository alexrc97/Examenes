package trimestre2.POO1;

import java.util.Scanner;

public class TrianguloRectangulo {
	private double cateto1,cateto2;

	public TrianguloRectangulo(double cateto1, double cateto2) {
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}

	
	public double getCateto1() {
		return cateto1;
	}

	public void setCateto1(int cateto1) {
		this.cateto1 = cateto1;
	}

	public double getCateto2() {
		return cateto2;
	}

	public void setCateto2(int cateto2) {
		this.cateto2 = cateto2;
	}
	public double obtenerHipotenusa () {
		return Math.sqrt((cateto1*cateto1) + (cateto2*cateto2));
	}
	public double obtenerArea () {
		return (cateto1*cateto2)/2;
	}
	public double obtenerPerimetro () {
		return cateto1+cateto2+obtenerHipotenusa();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el primer cateto del triangulo rectangulo");
		double cateto1 = sc.nextDouble();
		System.out.println("Introduce el segundo cateto del triangulo rectangulo");
		double cateto2 = sc.nextDouble();
		TrianguloRectangulo t =new TrianguloRectangulo (cateto1,cateto2);
		System.out.println("La hipotenusa es: "+ t.obtenerHipotenusa());
		System.out.println("El perimetro es: "+t.obtenerPerimetro());
		System.out.println("El area es: "+t.obtenerArea());
		sc.close();
	}
}
