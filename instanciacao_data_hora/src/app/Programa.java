package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Programa{
	public static void main(String[]args) {
		
		
		//imprimir data de agora
		LocalDate d01 = LocalDate.now();	
		
		//imprimir data e hora de agora
		LocalDateTime d02 = LocalDateTime.now();
		
		//imprimir data e hora global GMT +3(Londres)
		Instant d03 = Instant.now();
		
		//Texto ISO 8601 para Data
		LocalDate d04 = LocalDate.parse("2022-07-20");
		
		//Texto ISO 8601 para DataHora
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		//Texto ISO 8601 para DataHoraGlobal
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		 
		//Texto ISO 8601 para DataHoraGlobal definindo um fuso horario
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		//Texto customizado usando o DateTimeFormatter
		LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		//Texto customizado usando o DateTimeFormatter com horas também
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		//dia, mes e ano para data
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		
		//dia, mes ano e hora para DateTime
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1,30);
		
		
		
		
		System.out.println("d01 = "+ d01);
		System.out.println("d02 = "+ d02);
		System.out.println("d03 = "+ d03);
		System.out.println("d04 = "+ d04);
		System.out.println("d05 = "+ d05);
		System.out.println("d06 = "+ d06);
		System.out.println("d07 = "+ d07);
		System.out.println("d08 = "+ d08);
		System.out.println("d09 = "+ d09);
		System.out.println("d10 = "+ d10);
		System.out.println("d11 = "+ d11);
	}
	
}