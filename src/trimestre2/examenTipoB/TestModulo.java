package trimestre2.examenTipoB;

import java.time.LocalTime;

//Añade todas las bibliotecas que necesites
public class TestModulo
{
  public static void main (String[]arg)
  {

//Creamos un metodo con los datos que consideres
//oportuno
	  Modulo modulo = new Modulo("Programacion", 300);
//Crea cuatro alumnos
	  Alumno alumno1 = new Alumno("Bart", "Simpsom", Bachillerato.No);
	  Alumno alumno2 = new Alumno("Rod", "Flanders", Bachillerato.Si);
	  Alumno alumno3 = new Alumno("Tod", "Flanders", Bachillerato.Si);
	  Alumno alumno4 = new Alumno("Milhouse", "Van Houten", Bachillerato.No);

//Crea dos profesores
	  Profesor profesor1 = new Profesor("Señorita", "Karapapel",tipoProfesor.Prfesor_tecnico );
	  Profesor profesor2 = new Profesor("Seimur", "Skiner",tipoProfesor.Profesor_secundaria );

//Añade los profesores y alumnos al módulo.
	  modulo.addAlumno(alumno1);
	  modulo.addAlumno(alumno2);
	  modulo.addAlumno(alumno3);
	  modulo.addAlumno(alumno4);
	  modulo.addProfesor(profesor1);
	  modulo.addProfesor(profesor2);

	  System.out.printf("En el modulo hay %s alumnos %n",Alumno.contadorAlumnos);
	  System.out.printf("En el modulo hay %s profesores %n",Profesor.contadorProfesores);

//Guarda los datos en un fichero de texto y en otro	
//binario, llamando a los métodos de abajo.
//Finalmente muestra el número de alumnos del módulo a través de 
//variable que has crado para tal fin

  }

//Crea un método estático para escribir en un fichero
//de texto los datos del  módulo.

//Crea un método estático para escribir en un fichero
//binario el objeto método.
}
