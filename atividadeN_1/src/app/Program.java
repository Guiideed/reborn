package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantos numeros voce vai verificar?: ");
		int n = leitor.nextInt();
		
		int[] vetor = new int[n]; 
		
		for(int i = 0; i<n; i++) {
			System.out.println("Adicione o numero");
			vetor[i] = leitor.nextInt();
			
			
		}
		for(int i = 0; i<n; i++) {
			
			if(vetor[i]<0) {
				System.out.println("");
				System.out.println(vetor[i]  + " é negativo");
			}else {
				System.out.println("");
				System.out.println(vetor[i]+" é positivos");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		leitor.close();
	}
}
