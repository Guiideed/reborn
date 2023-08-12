package app2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Programa {	
	
	public static void main(String[]args) {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		
		
		
		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("ISO = d01 = "+ d01);
		System.out.println("d01 = "+ d01.format(fmt1));
		System.out.println("d01 = " + fmt1.format(d01));
		System.out.println("d01 = "+ d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d02 = "+ d02.format(fmt2));
		System.out.println("d02 = "+ fmt2.format(d02));
		System.out.println("d02 = "+ d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println("ISO = d02 = "+ fmt4.format(d02));
		
		//TEM SEMPRE QUE ESPECIFICAR HORARIO
		System.out.println("d03 = " + fmt3.format(d03));
		System.out.println("ISO = d03 = "+ fmt5.format(d03));
	}
	
}
