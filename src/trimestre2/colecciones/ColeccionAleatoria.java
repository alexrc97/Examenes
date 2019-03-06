package trimestre2.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColeccionAleatoria {
	private static int [] lista1 = new int [100];
	public ColeccionAleatoria () {
		for (int i = 0; i < lista1.length; i++) {
			lista1[i] = (int) (Math.random()*100);
		}
	}
	public int valorMedio () {
		int sum = 0;
		for (int i = 0; i < lista1.length; i++) {
			sum += lista1[i];
		}
		return sum/lista1.length;
	}
	public int[] ordenarArray (int [] lista2) {
		Arrays.sort(lista2);
		return lista2;
	}
	public List<Integer> pares (int [] lista) {
		List<Integer> listaPares = new ArrayList<>();
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] % 2 == 0) {
				listaPares.add(lista[i]);
			}	
		}
		return listaPares;
	}
	public static String valorMaximoyMinimo () {
		int valorMaximo  = Integer.MIN_VALUE;
		for (int i : lista1) {
			if(lista1[i]>valorMaximo) {
				valorMaximo = lista1[i];
			}
		}
		int valorMinimo  = Integer.MAX_VALUE;
		for (int i : lista1) {
			if(lista1[i]<valorMinimo) {
				valorMinimo = lista1[i];
			}
		}
		return "El valor maximo es " + valorMaximo + " y el valor minimo es " + valorMinimo;
	}
}
