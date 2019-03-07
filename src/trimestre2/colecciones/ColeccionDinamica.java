package trimestre2.colecciones;

import java.util.ArrayList;
import java.util.List;


public class ColeccionDinamica {
	private List<String> lista = new ArrayList<>();

	public boolean existeCadena (String  cadena) {
		return lista.contains(cadena);	
	}
	public void addCadena (String cadena) {
		 lista.add(cadena);
	}
	public void quitarCadena (String cadena) {
		lista.remove(cadena);
	}
	public List<String> cadenasMayorLongitud () {
		List<String> listacadenasMayorLongitud = new ArrayList<>();
		String cadenaMayor = "";
		for (String string : lista) {
			if(string.length()>cadenaMayor.length()) {
				cadenaMayor = string;
				listacadenasMayorLongitud.clear();
				listacadenasMayorLongitud.add(string);
			} else if (string.length() == cadenaMayor.length()) {
				listacadenasMayorLongitud.add(string);
			}
		}
		return listacadenasMayorLongitud;
	}
}
