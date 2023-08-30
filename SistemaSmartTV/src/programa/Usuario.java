package programa;

import java.util.Scanner;

public class Usuario {
	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		Scanner leitor = new Scanner(System.in);
		
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		
		
		System.out.println("Tv Ligada? :" + smartTv.ligada);
		System.out.println("Canal Atual? : "+ smartTv.canal);
		System.out.println("Volume atual ? : "+ smartTv.volume);
		
		
		smartTv.ligar();
		System.out.println("Status atual ---- Tv ligada? : " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Status atual ---- Tv ligada? : " + smartTv.ligada);
		
		
		System.out.println("Qual canal você deseja colocar?");
		smartTv.canal =leitor.nextInt();
		System.out.println("canal atual " + smartTv.canal);
		
		
		leitor.close();
	}
}
