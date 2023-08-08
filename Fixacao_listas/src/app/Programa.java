package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import utilidades.Funcionario;

public class Programa {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		
		//scanner com nome de leitor
		Scanner leitor = new Scanner(System.in);
		
		//lista do tipo funcionario 
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Quantos funcionarios você vai inserir? : ");
		int n = leitor.nextInt();
		
		
		//for para percorrer e adicionar os dados em cada posicao da lista
		for(int i = 1; i<=n; i++) {
			
			System.out.println("Funcionario # "+ i);
			System.out.println("Id: ");
			int id = leitor.nextInt();
			leitor.nextLine();
			System.out.println("Nome completo: ");
			String nome = leitor.nextLine();
			System.out.println("Salario : ");
			Double salario = leitor.nextDouble();
			lista.add ( new Funcionario(id,nome, salario));
		}
		
		System.out.println("Qual o id do funcionario que vai receber o aumento?");
		int idSalario = leitor.nextInt();
		
		Integer posicao = posicao(lista, idSalario);
		if (posicao == null) {
			System.out.println("Este id não existe");
		}else {
			System.out.println("Quantos % de aumento? : ");
			double porcentagem = leitor.nextDouble();
			
			//vai pegar a posicao que é encontrada na funcao posicao() e vai aplicar a funcao aumento que faz a soma no salario 
			lista.get(posicao).aumentoSalario(porcentagem);
			
		}
		
		System.out.println("Lista de funcionarios");
		for(Funcionario listaComplet : lista) {
			System.out.println(listaComplet);
		}
		leitor.close();
	}
	
	
	
	//funcao estatica para verificar se a posicao da lista é a mesma do ID adicionado
	public static Integer posicao(List<Funcionario> lista, int id) {
		for(int i = 0; i< lista.size(); i++) {
			if(lista.get(i).getId()==id) {
				return i;
			}
			
		} 
		return null;
		
	}
	
}
