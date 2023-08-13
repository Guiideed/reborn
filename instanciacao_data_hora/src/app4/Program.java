package app4;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
	public static void main(String[]args) {
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		
		LocalDate semanaPassada = d01.minusDays(7);
		LocalDate proximaSemana = d01.plusDays(7);
		
		LocalDateTime semanaPassada1 = d02.minusDays(12);
		
		Instant semanaPassada2 = d03.minus(7, ChronoUnit.DAYS);
		Instant proximaSemana2 = d03.plus(22, ChronoUnit.DAYS);
		
		
		System.out.println("LocalDate semana passada = "+ semanaPassada);
		System.out.println("LocalDate proxima semana  = "+ proximaSemana);
		System.out.println("LocalDateTime semana passada = "+ semanaPassada1);
		
		System.out.println("Instant " + semanaPassada2);
		System.out.println("Instant = "+ proximaSemana2);
		
		Duration t1 = Duration.between(semanaPassada1, d02);
		Duration t2 =Duration.between(semanaPassada2, d03);
		System.out.println("Duration = "+ t1.toDays());
		System.out.println("Duration  2= " + t2.toDays());
	}
}
