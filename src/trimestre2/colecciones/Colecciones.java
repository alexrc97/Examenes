package trimestre2.colecciones;

import java.util.Arrays;

public class Colecciones {
	private static int [] lista1 = new int [10];
	private static int [] lista2 = new int [10];
	
	public Colecciones (int numero) {
		for (int i = 0; i < lista1.length; i++) {
			lista1[i] = numero;
		}
		Arrays.fill(lista2, 4);
	}
	public static void mostrarDatos () {
//		for (int i : coleccion1) {
//			for (int j : coleccion2) {
//				System.out.println(i+" "+j);
//			}
//		}
		for (int i = 0; i < lista1.length; i++) {
				System.out.printf("%5d%5d%n",lista1[i], lista2[i]);
		}
		
	}
	public static void main(String[] args) {
		Colecciones c = new Colecciones(6);
		mostrarDatos();
	}
}
