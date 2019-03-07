package trimestre2.examenTipoA;

public class Director {
	
	public static int contadorDirectores = 0;
	
	private String nombre;
	private String apellidos;
	
	public Director(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		contadorDirectores++;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	
}
