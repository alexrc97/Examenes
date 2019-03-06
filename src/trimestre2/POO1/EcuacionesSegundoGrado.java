package trimestre2.POO1;

public class EcuacionesSegundoGrado {
	private float a;
	private float b;
	private float c;
	public EcuacionesSegundoGrado(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public boolean esResoluble () {
		if (b*b - 4*a*c >= 0 && 2*a>0) {
			return true;
		}
		return false;
	}
	public float primeraSolucion() {
		return (float)((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	}
	public float segundaSolucion() {
		return (float)((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	}

	public static void main(String[] args) {
		EcuacionesSegundoGrado ecuacion = new EcuacionesSegundoGrado(2, 1, 1);
		System.out.println("¿Es resoluble?" + ecuacion.esResoluble());
		System.out.println("La primera solucion es " + ecuacion.primeraSolucion());
		System.out.println("La segunda solucion es " + ecuacion.segundaSolucion());

	}
	
}
