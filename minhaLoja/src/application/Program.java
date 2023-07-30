/*Fui um pouco além e utilizei de condicionais para adicionar e remover produto!!*/
package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Program {
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		int quantidade;
		
		System.out.println("Adicione os dados do produto");
		
		System.out.println("Nome: ");
		String nome =  leitor.nextLine();
		System.out.println("Preço: ");
		Double preco =  leitor.nextDouble();
		System.out.println("Quantidade em estoque: ");
		
		//deve ser instanciado depois, pois deve primeiro receber os valores 
		//a partir de agora, não há mais produto vazio
		Produto produto = new Produto(nome,preco);
		produto.setPreco(preco);
		System.out.println("Dados do produto: ");
		System.out.println(produto);
		System.out.println(produto.getPreco());
		
		
		
		System.out.println("Deseja adicionar ou remover do estoque?");
		
		System.out.println("Digite 1 para adicionar e 0 para remover");
		int resposta = leitor.nextInt();
		
		
		if(resposta ==1) {
	
			System.out.println("Quantos você deseja adicionar? :");
			quantidade= leitor.nextInt();
			produto.adicionaProduto(quantidade);
			System.out.println(produto);
			
		
		}else if(resposta ==0) {
			System.out.println("Quantos você deseja remover? :");
			quantidade= leitor.nextInt();
			produto.removeProdutos(quantidade);
			System.out.println(produto);
		}else {
			System.out.println("Insira um valor valido!");
		}
		
		leitor.close();
	}
	
	
	
}
