package app;

import java.util.Locale;
import java.util.Scanner;



public class Program {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Quantos pessoas são?  : ");
		int numPessoas = leitor.nextInt();
		
		String[] nome = new String[numPessoas];
		int[] idade = new int[numPessoas];
		double[] altura = new double[numPessoas];
		
		double altuMedia = 0.0;
		for(int i = 0; i<numPessoas; i++) {
			leitor.nextLine();
			System.out.println("Dados da "+ (i+1) +" pessoa");
			System.out.println("Nome :");
			nome[i] = leitor.nextLine();
			System.out.println("Idade: ");
			idade[i]= leitor.nextInt();
			System.out.println("Altura : ");
			altura[i]= leitor.nextDouble();
			
			altuMedia+=altura[i] / 2;
			
			
		}
		System.out.println("Altura media "+altuMedia);
		
		int menorIdade = 0;
		for(int i = 0; i<idade.length;i++) {
			if(idade[i]<16) {
				menorIdade++;
			}
		}
			
			
		double percentualMenores = (	menorIdade / numPessoas) * 100;
		System.out.println("Pessoas com menos de  16 anos : "+percentualMenores+" %");
		
		
		leitor.close();
	}
}
