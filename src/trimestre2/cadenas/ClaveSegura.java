

package trimestre2.cadenas;
/**
 * Esta clase verifica si una clave que se le pasa como
 * argumento es segura, según ciertos requsitos de seguridad
 * ya predefinidos
 * @author alexrc
 *
 */
public class ClaveSegura {
	private String clave;
/**
 * Este método es un constructor
 * @param clave
 */
	public ClaveSegura(String clave) {
		this.clave = clave;
	}
/**
 * Método que devuelve la clave del objeto ClaveSegura creado
 * @return -clave del del objeto ClaveSegura
 */
	public String getClave() {
		return clave;
	}
/** 
 * Este metodo sirve para cambiar la clave de un objeto ClaveSegura
 * @param clave - nueva clave a introducir
 */
	public void setClave(String clave) {
		this.clave = clave;
	}
/**
 * Método que comprueba si una clave es segura
 * @return -boolean 
 */
	public boolean esClaveSegura () {
		return contiene8caracteres() && contieneUnaMinuscula() &&
				contieneUnMayuscula() && contieneUnNumero() && contieneUnAlfanumerico();
	}

	private boolean contieneUnNumero() {
		
		return clave.matches("^.*[0-9].*$");
	}

	private boolean contieneUnAlfanumerico() {
		for (int i = 0; i < clave.length(); i++) {
			if(!Character.isLetterOrDigit(clave.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private boolean contieneUnMayuscula() {
		
		return clave.matches("^.*[A-ZÁÉÍÓÚÜÑ].*$");
	}

	private boolean contieneUnaMinuscula() {

		return clave.matches("^.*[a-záéíóúüñ].*$");

	}

	private boolean contiene8caracteres() {
		
		return clave.length()>=8;
	}
//	public static void main(String[] args) {
//		ClaveSegura cs = new ClaveSegura("Alejandrorc97&");
//		System.out.printf("¿Es %s una clave segura? %B%n",cs.getClave(), cs.esClaveSegura());
//	}
}
