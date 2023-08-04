package app;

import java.util.Locale;
import java.util.Scanner;

import utilidade.Aluguel;

public class Programa {
		public static void main(String[]args) {
			
			Locale.setDefault(Locale.US);
			Scanner leitor = new Scanner(System.in);
			
			
			Aluguel[] vetor = new Aluguel[10];
			
			System.out.println("Quantos quartos vao ser alugados? ");
			
			int n = leitor.nextInt();
			
			for(int i = 1; i<=n; i++) {
				
				System.out.println("");
				System.out.println("Aluguel #"+i +": ");
				
				
				System.out.println("Nome :");
				leitor.nextLine();
				String nome = leitor.nextLine();
				
				
				System.out.println("Email : ");
				String email = leitor.nextLine();
				
				System.out.println("Quarto : ");
				int numQuarto = leitor.nextInt();
				
			
				
				vetor[numQuarto] = new Aluguel(nome, email);
				
				
				
				
			}
			System.out.println("");
			System.out.println("Quartos ocupados");
			for(int i = 0; i<10; i++) {
				if(vetor[i] !=null) {
				System.out.println(i+ ": "+vetor[i]);
				
				}
			}
			
			leitor.close();
			
		}
		
}
