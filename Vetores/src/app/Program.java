package app;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class Program {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantos produtos vao ser adicionados? :");
		//variavel que vai receber a quantidade de valores dos produtos
		int n = leitor.nextInt();
		
		
		//Criacao do vetor tipo produtos com o tamanho de N= leitor.nextInt()
		Produtos[] vetor = new Produtos[n];
		
		//laco para adicionar um valor a posicao do vetor
		double soma = 0.0;
		for(int i = 0; i < vetor.length; i++) {
			leitor.nextLine();
			
			System.out.println("Qual o nome do produto?");
			String nome = leitor.nextLine();
			System.out.println("Qual o valor do produto?");
			double preco = leitor.nextDouble();
			vetor[i] = new Produtos(nome, preco);
			soma+=vetor[i].getValor();
		}
		
		double media = soma /vetor.length;
		
		System.out.println("valor medio dos produtos é de "+media);
		leitor.close();
	}
}
