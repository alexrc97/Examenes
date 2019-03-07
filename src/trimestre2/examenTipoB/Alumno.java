package trimestre2.examenTipoB;

public class Alumno {
	
	public static int contadorAlumnos = 0;
	
	private String nombre;
	private String apellidos;
	private Bachillerato bachillerTerminado;
	
	public Alumno(String nombre, String apellidos, Bachillerato bachillerTerminado) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.bachillerTerminado = bachillerTerminado;
		contadorAlumnos++;
	}

	public Bachillerato getBachillerTerminado() {
		return bachillerTerminado;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}
	
}
