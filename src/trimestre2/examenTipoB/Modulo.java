package trimestre2.examenTipoB;


import java.util.ArrayList;
import java.util.List;

public class Modulo {
	
	private String nombre;
	private int horasDuracion;
	List<Profesor> listaProfesores = new ArrayList<>();
	List<Alumno> listaAlumnos = new ArrayList<>();
	public Modulo(String nombre, int horasDuracion) {
		this.nombre = nombre;
		this.horasDuracion = horasDuracion;
	}
	public String getNombre() {
		return nombre;
	}
	public int getHorasDuracion() {
		return horasDuracion;
	}
	public List<Profesor> getListaProfesores() {
		return listaProfesores;
	}
	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}
	public void addAlumno (Alumno alumno) {
		listaAlumnos.add(alumno);
	}
	public void addProfesor (Profesor profesor) {
		listaProfesores.add(profesor);
	}
	
}
