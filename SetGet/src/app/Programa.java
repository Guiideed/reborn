package app;
import java.util.Scanner;

import utilidades.ClasseTeste;
public class Programa {
	public static void main(String []args) {
		
		Scanner  leitor = new Scanner(System.in);
		
		ClasseTeste dados = new ClasseTeste();
		
		
		System.out.println("Qual o nome?");
		dados.setNome(leitor.nextLine());
		String texto = dados.getNome();
		
		
		System.out.println("Qual o sobrenome?");
		dados.setSobrenome(leitor.nextLine());
		
		String sTexto = dados.getSobrenome();
		
		System.out.println(texto.toUpperCase() +" "+sTexto.toUpperCase() );
		
		leitor.close();
	}
}
