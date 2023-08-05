package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {
	public static void main(String[]args) {
		
		List<String> lista = new ArrayList<>();
		//adiciona na lista
		lista.add("Maria");
		lista.add("Guilherme");
		lista.add("Joao");
		lista.add("Alex");
		lista.add("Joaquin");
		lista.add("Aline");
		
		//insere em determinada posicao
		lista.add(2, "Lucas");
		
		//mostra o tamanho da lista
		System.out.println(lista.size());
		
		
		
		
		for(String nomes : lista) {
			System.out.println(nomes);
		}
		
		System.out.println("----------------------------");
		lista.remove("Joaquin");
		lista.removeIf(x -> x.charAt(0) =='M');
		lista.removeIf(x -> x.charAt(0) =='G');
		
		for(String nomes :lista) {
			System.out.println(nomes);
		}
		
		
		System.out.println("----------------------------");
		
		System.out.println("Indice do Joao : " + lista.indexOf("Joao"));
		System.out.println("Indice da Aline : "+ lista.indexOf("Aline"));
		
		System.out.println("----------------------------");
		List<String> resultado = lista.stream().filter(x-> x.charAt(0) =='A').collect(Collectors.toList());
		for(String resultados : resultado) {
			System.out.println(resultados);
		}
	}
} 
