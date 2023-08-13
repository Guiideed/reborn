package app3;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[]args) {
		
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		
		
		System.out.println("d01 = " + d01.format(fm1));
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("r1 = " + r1);
		System.out.println("r1 = " + r2);
		
		System.out.println("d01 dia = " + d01.getDayOfMonth());
		System.out.println("d01 ano = " + d01.getYear());
		System.out.println("d01 mes = "+ d01.getMonthValue());
		System.out.println("d02 hora = " + d02.getHour());
		System.out.println("d02 hora = " + d02.getMinute());
		
		
		
		
		
	}
}
