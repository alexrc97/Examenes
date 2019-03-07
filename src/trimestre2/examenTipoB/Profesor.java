package trimestre2.examenTipoB;

public class Profesor {
	
	public static int contadorProfesores = 0;
	
	private String nombre;
	private String apellidos;
	private tipoProfesor tipoProfesor;
	public Profesor(String nombre, String apellidos, trimestre2.examenTipoB.tipoProfesor tipoProfesor) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipoProfesor = tipoProfesor;
		contadorProfesores++;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public tipoProfesor getTipoProfesor() {
		return tipoProfesor;
	}
	
	
	
}
