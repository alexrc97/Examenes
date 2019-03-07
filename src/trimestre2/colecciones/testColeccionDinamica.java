package trimestre2.colecciones;

import java.util.Scanner;

public class testColeccionDinamica {

	public static void main(String[] args) {
		ColeccionDinamica c = new ColeccionDinamica();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cadenaIntroducida = sc.nextLine();
		while(!cadenaIntroducida.equalsIgnoreCase("fin") && sc.hasNext()) {
			cadenaIntroducida = sc.nextLine();
			c.addCadena(cadenaIntroducida);
		}
		System.out.println(c.cadenasMayorLongitud());
	}

}
