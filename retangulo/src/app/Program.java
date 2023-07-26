package app;
import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {
	public static void main(String []args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Adicione a largura e a altura: ");
		
		retangulo.altura = leitor.nextDouble();
		retangulo.largura = leitor.nextDouble();
		
		retangulo.area(retangulo.altura, retangulo.largura);
		retangulo.perimetro(retangulo.altura, retangulo.largura);
		retangulo.diagonal(retangulo.altura, retangulo.largura);
		
		leitor.close();
	}

}
