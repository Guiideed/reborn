package app;

import java.util.Locale;
import java.util.Scanner;

import utilidades.Conta;

public class Program {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Qual o numero da conta?");
		int numero  = leitor.nextInt();
		System.out.println("Qual o nome do titular");
		leitor.nextLine();
		String titular = leitor.nextLine();
		
		System.out.println("É o primeiro deposito (1 para sim/0 para nao)?");
		int resposta = leitor.nextInt();
		
		if (resposta == 1) {
			System.out.print("Entre com o deposito inicial: ");
			double depInicial = leitor.nextDouble();
			conta = new Conta(numero, titular,depInicial);
		} else {
			conta = new Conta(numero, titular);
			
		}
		
		System.out.println("");
		System.out.println("Dados da conta");
		System.out.println(conta);
		
		
		
		
		leitor.close();
	}
}
