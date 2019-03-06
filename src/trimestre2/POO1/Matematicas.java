package trimestre2.POO1;

public class Matematicas {
	private double numero = 0;

	public Matematicas(double numero) {
		this.numero = numero;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public double raizCuadrada () {
		return Math.pow(numero, 2);
	}
	
	public double raizCubicaAbsoluta () {
		return Math.abs(Math.pow(numero, 3));
	}
	
	public int redondear () {
		return (int) Math.round(numero);
	}
	
	public int numeroAleatorio () {
		return (int) Math.abs(Math.round(Math.random()*numero));	
	}
	
	public static void main(String[] args) {
		Matematicas n = new Matematicas(5.6);
		System.out.println(n.redondear());
		System.out.println(n.numeroAleatorio());
	}
}
