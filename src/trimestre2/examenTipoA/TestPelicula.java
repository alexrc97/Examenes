package trimestre2.examenTipoA;

//Añade todas las bibliotecas que necesites
public class TestPelicula
{
  public static void main (String[]arg)
  {

//Creamos una pelicula con un presupuesto dado
	  Pelicula peli = new Pelicula();
	  peli.setPresupuesto(1000);
//Crea tres actores
	  Actor actor1 = new Actor("Pepe", "Pelaez", 21);
	  Actor actor2 = new Actor("Pepa", "Pelaez", 28);
	  Actor actor3 = new Actor("Pipi", "Estrada", 24);
	 
//Crea un director
	  Director director = new Director("Juan", "Jimenez");
//Añade los actores y el director a la película.
	 peli.addActor(actor1);
	 peli.addActor(actor2);
	 peli.addActor(actor3);
	 peli.addDirector(director);
//Guarda los datos en un fichero de texto y en otro
//binario, llamando a los métodos de abajo.
//Finalmente muestra el número de películas, actores y
//directores creados.
	 System.out.printf("Hay %s actores %n",Actor.contadorActores);
	 System.out.printf("Hay %s directores %n",Director.contadorDirectores);
	 System.out.printf("Hay %s peliculas %n",Pelicula.contadorPeliculas);


  }

//Crea un método estático para escribir en un fichero
//de texto los datos de la película.

//Crea un método estático para escribir en un fichero
//binario el objeto película.
}
