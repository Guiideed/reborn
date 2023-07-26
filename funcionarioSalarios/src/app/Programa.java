package app;
import java.util.Locale;
import java.util.Scanner;

import entities.DadosFunc;
public class Programa {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		DadosFunc dadosFunci = new DadosFunc();
		
		System.out.println("Adicione os dados do funcionario: ");
		System.out.println("Nome : ");
		dadosFunci.nome = leitor.nextLine();
		
		System.out.println("Salario : ");
		dadosFunci.salario = leitor.nextDouble();
		double valorTaxado = dadosFunci.salarioComTaxa();
		System.out.println("O funcionário " + dadosFunci.nome+" esta recebendo o valor de R$ "+ valorTaxado );
		System.out.println("");
		
		
		System.out.println("Qual a porcentagem de aumento?:");
		double porcentagem = leitor.nextDouble();
		
		dadosFunci.porcentAumento(porcentagem);
		
		dadosFunci.texto();
		
		leitor.close();
		
		
	}
}
