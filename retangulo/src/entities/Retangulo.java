package entities;

public class Retangulo {
	public Double altura;
	public Double largura;
	
	
	public void area(double alt, double larg) {
		
		System.out.println("Area = "+altura*largura);
		
		
	}
	public void perimetro(double alt, double larg) {
		
		System.out.println("Perimetro = "+(altura+largura)*2);

	}
	public void diagonal(double alt, double larg) {
		System.out.println("Diagonal = "+ Math.sqrt((altura*altura)+(largura*largura)));
	}
	

}
