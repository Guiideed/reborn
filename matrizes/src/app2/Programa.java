package app2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[]args ) {
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantas linhas vão ter :");
		int linhas = leitor.nextInt();
		System.out.println("Quantas colunas vão ter :");
		int colunas = leitor.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		
		for(int i =0; i<linhas; i++) {
			System.out.println("Quais os numeros da linha " + (i+1));
			for(int j = 0; j<colunas; j++) {
				matriz[i][j]= leitor.nextInt();
			}
		}
		
		for(int i= 0; i<linhas; i++) {
			for(int j = 0; j<colunas; j++) {	
				System.out.print( matriz[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("Qual numero você deseja verificar ? :");
		int valor = leitor.nextInt();
		
		
		for(int i = 0; i<linhas; i++) {
			for(int j = 0; j<colunas;j++) {
				
				if(matriz[i][j] == valor) {
					System.out.println("Posição " +i+", "+j);
					
					if (j>0) {
						System.out.println("Esquerda "+ matriz[i][j-1]);
					}
					if (i>0) {
						System.out.println("Acima "+ matriz[i-1][j]);
					}
					if(j<matriz[i].length-1) {
						System.out.println("Direita" + matriz[i][j+1]);
					}
					if (i<matriz.length - 1) {
						System.out.println("Baixo "+ matriz[i+1][j]);
						
					}
				}
				
			}
			
		}
		
		leitor.close();
	}
}
