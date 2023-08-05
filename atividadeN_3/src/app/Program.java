package app;

import java.util.Locale;
import java.util.Scanner;

import utilid.DadosPessoa;



public class Program {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Quantos pessoas são?  : ");
		int numPessoas = leitor.nextInt();
		
		DadosPessoa[] vetor = new DadosPessoa[numPessoas];
		
		double altuMedia = 0.0;
		for(int i = 0; i<numPessoas; i++) {
			leitor.nextLine();
			System.out.println("Dados da "+ (i+1) +" pessoa");
			System.out.println("Nome :");
			String nome = leitor.nextLine();
			System.out.println("Idade: ");
			int idade= leitor.nextInt();
			System.out.println("Altura : ");
			double altura= leitor.nextDouble();
			
			vetor[i] = new DadosPessoa(nome, idade, altura);
			
			altuMedia+=vetor[i].getAltura() / 2;
			
			
		}
		System.out.println("Altura media "+altuMedia);
		
		
		
		
		
		int menorIdade = 0;
		for(int i = 0; i<vetor[numPessoas].getIdade();i++) {
			if(vetor[i].getIdade()<16) {
				menorIdade++;
			}
		}
			
			
		int percentualMenores = (	menorIdade / numPessoas) * 100;
		System.out.println("Pessoas com menos de  16 anos : "+percentualMenores+" %");
		
		
		leitor.close();
	}
}
