package trimestre2.colecciones;

import java.util.ArrayList;
import java.util.List;

public class DeclaracionArrays {

	public static void main(String[] args) {
		//Estaticas
		int [] forma1 = new int [6]; 
		int forma2 [] = {1,2,3,4,5};
		int forma3Matriz [][]= {{1,2,3,4},{5,6,7,8}};
		int [][] otraMatriz = new int [5][6];
		//Dinamicas
		
		List<String> listaCadenas = new ArrayList<>();
	}
	public static void lectorDeColecciones ( int [] lista) {
		for (int i = 0; i < lista.length; i++) {
			int numero = 0;
			lista [i] = numero;
			System.out.println(numero);
		}
	}
}
