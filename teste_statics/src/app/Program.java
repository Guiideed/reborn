package app;
import java.util.*;

import utilid.ConverteMoeda;
public class Program {
	public static void main(String []args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual o valor do dolar hoje?");
		double valorDolar = leitor.nextDouble();
		System.out.println("Quantos reais você vai comprar?");
		double valorReais = leitor.nextDouble();
		
		//não precisamos instanciar a classe quando ela é estatica!!
		System.out.println(ConverteMoeda.converteValor(valorDolar, valorReais));
		
		
		leitor.close();
	}
}
