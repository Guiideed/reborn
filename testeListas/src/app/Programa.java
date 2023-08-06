package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa{
	public static void main(String[]args) {
		
		//não aceita tipo primitivo
		//array list é a classe que implementa a interface
		List<String> lista = new ArrayList<>();
		
		//adiciona a lista algum dado
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		
		//adiciona em uma posicao especifica
		lista.add(2, "Marcos");
		
		//retorna o tamanho da lista 
		System.out.println(lista.size());
		//percorre a lista
		for(String listaNomes : lista) {
			System.out.println(listaNomes);
		}
		System.out.println("-----------------");
	
		//remove se o valor de x for igual a 'M'
		lista.removeIf(x -> x.charAt(0) == 'M');
		for(String listaNomes : lista) {
			System.out.println(listaNomes);
			
		}
		
		System.out.println("-----------------");
		
		System.out.println(lista.indexOf("Anna"));
		
		System.out.println("-----------------");
		
		//retorna apenas o que estiver o nome comecando com A
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String result : resultado) {
			System.out.println(result);
		
		}
		
		System.out.println("-----------------");
	}
	
	
	
}