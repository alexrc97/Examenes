package trimestre2.cadenas;

import java.util.Scanner;

public class testClaveSegura {
	final static String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNñÑoOpPqQrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&{}";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Itroduce la longitud que quieres "
				+ "que tenga tu clave segura");
		int longitudClave = sc.nextInt();
		sc.close();
		StringBuilder sB = new StringBuilder();
		for (int i = 0; i < longitudClave; i++) {
			sB.append(obtenerCaracterAleatorio());
		}
		ClaveSegura claveSegura = new ClaveSegura(sB.toString());
		System.out.printf("Es la clave %s una clave segura? %B %n",
				claveSegura.getClave(),claveSegura.esClaveSegura());
	}

	public static char obtenerCaracterAleatorio() {

		return FUENTE_CARACTERES.charAt((int) (Math.random()*FUENTE_CARACTERES.length()));
	}

}
