package trimestre2.examenTipoA;

public class Actor {
	
	public static int contadorActores = 0;
	
	private String nombre;
	private String apellidos;
	private int edad;
	public Actor(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		contadorActores++;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public int getEdad() {
		return edad;
	}
	
}
