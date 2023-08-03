package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String []args) {
		Locale.setDefault(Locale.US);		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int numeroContar = leitor.nextInt();
		
		
		double [] vetor = new double[numeroContar];
		System.out.println("Olá");
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("Digite um numero");
			vetor[i] = leitor.nextDouble();
			
		} 
		
		double soma = 0.0;
		double media  = 0.0;
		System.out.println("Valores: ");
		for(int i = 0; i<vetor.length; i++) {
			System.out.println(" "+vetor[i]);
			
			
			soma+= vetor[i];
			media+= vetor[i] / 2;
			
		}
		
		System.out.println("Soma : "+ soma);
		
		
		System.out.println("Media : "+media);
		
		
		
		leitor.close();
		
	}
}
