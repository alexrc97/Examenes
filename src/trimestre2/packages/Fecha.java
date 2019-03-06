package trimestre2.packages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
	public static void main(String[] args) {
		LocalDate fechaActual = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LL/yyyy");
		System.out.println(formatter.format(fechaActual));
	}
}
