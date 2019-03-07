package trimestre2.cadenas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseoFichero {

	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File ("Datos/nombres_mujer.txt");
		Scanner sc = new Scanner (fichero);
		
		List<String> listaEmpiezanporA = new ArrayList<>();
		List<String> listaNoAcabaEnVocal = new ArrayList<>();
		List<String> listaPalabrasMasLargas = new ArrayList<>();
		List<String> listaPalabrasMasCortas = new ArrayList<>();

		int cantidadPalabras = 0;
		String lineaLeida;
		int nombreMayor = Integer.MIN_VALUE;
		int nombreMenor = Integer.MAX_VALUE;
		while (sc.hasNextLine()) {
			lineaLeida = sc.nextLine();
			cantidadPalabras++;
			if (lineaLeida.matches("^[AaáÁ].*")) {
				listaEmpiezanporA.add(lineaLeida);
			}
			if (!lineaLeida.matches(".*[aeiouáéíóúÁÉÍÓÚÜüAEIOU]$")) {
				listaNoAcabaEnVocal.add(lineaLeida);
			}
			if(lineaLeida.length()>nombreMayor) {
				nombreMayor = lineaLeida.length();
				listaPalabrasMasLargas.clear();
				listaPalabrasMasLargas.add(lineaLeida);
			} else if (lineaLeida.length() == nombreMayor) {
				listaPalabrasMasLargas.add(lineaLeida);
			}
			if(lineaLeida.length()<nombreMenor) {
				nombreMenor = lineaLeida.length();
				listaPalabrasMasCortas.clear();
				listaPalabrasMasCortas.add(lineaLeida);
			} else if (lineaLeida.length() == nombreMenor) {
				listaPalabrasMasCortas.add(lineaLeida);
			}
		}
		System.out.printf("El fichero %s tiene %d palabras %n",fichero,cantidadPalabras);
		System.out.println(listaEmpiezanporA);
		System.out.println(listaNoAcabaEnVocal);
		System.out.println(listaPalabrasMasCortas);
		System.out.println(listaPalabrasMasLargas);
	}

}
