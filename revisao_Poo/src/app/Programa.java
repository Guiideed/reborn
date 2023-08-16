package app;

import java.util.Scanner;

import entidades.Aluguel;

public class Programa {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		Aluguel[] vetor = new Aluguel[10];
		
		System.out.println("Quantos quartos vão ser alugados? : ");
		int n = leitor.nextInt();
		
		for(int i=0; i<n;i++) {
			System.out.println("Aluguel " + (i+1));
			System.out.println("Nome do pagador: ");
			leitor.next();
			String nomePagador = leitor.nextLine();
			System.out.println("E-mail do pagador: ");
			String emailPagador = leitor.nextLine();
			System.out.println("Quarto a ser alugado: ");
			int numQuarto = leitor.nextInt();
			
			vetor[numQuarto] = new Aluguel(nomePagador, emailPagador);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados");
		for(int i = 0; i<10;i++) {
			if(vetor[i] != null) {
				System.out.println(i +":"+ vetor[i]);
			}
			
		}

		
		leitor.close();
		
	}
}
