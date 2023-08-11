package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Programa {
	public static void main(String[ ]args) {
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d01 = LocalDate.now(); //data local;
		
		LocalDateTime d02 = LocalDateTime.now();//Horario local
		
		Instant d03 = Instant.now();//GNT horario de londres
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate d07 = LocalDate.parse("20/07/2022", fmt1);
		
		LocalDate d08 = LocalDate.parse("20/07/2022 01:30", fmt2);
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
	}
}