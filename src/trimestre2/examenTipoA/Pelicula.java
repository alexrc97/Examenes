package trimestre2.examenTipoA;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	
	public static int contadorPeliculas = 0;
	
	private List<Actor> listaActores = new ArrayList<>();
	private List<Director> listaDirectores = new ArrayList<>();
	private int presupuesto;
	
	public Pelicula() {
		contadorPeliculas++;
	}
	public List<Actor> getListaActores() {
		return listaActores;
	}
	public List<Director> getListaDirectores() {
		return listaDirectores;
	}
	public int getPresupuesto() {
		return presupuesto;
	}
	public void addActor (Actor actor) {
		 listaActores.add(actor);
	}
	public void addDirector (Director director) {
		 listaDirectores.add(director);
	}
	
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
}
