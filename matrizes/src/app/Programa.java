package app;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		int n = leitor.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(int i = 0; i<matriz.length; i++) {
			System.out.println("Quais os três numeros da linha?" + (1+i) );
			for(int j = 0; j<matriz[i].length; j++) {
				
				matriz[i][j] = leitor.nextInt();
			}
			
			
		}
		System.out.println("Numeros da diagonal da matriz");
		for(int i = 0; i<matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
			
		}
		
		System.out.println();
		
		
		int contagem = 0;
		for(int i = 0; i<matriz.length; i++) {
			
			for(int j = 0; j<matriz[i].length; j++) {
				if(matriz[i][j]<0) {
					contagem ++;
					
				}
				
			}
		}
		System.out.println("Numeros negativos : "+contagem);
		leitor.close();
	}
}
