package entities;

public class DadosFunc {
	public String nome;
	public double salario;
	public double taxa = 1000.00;
	
	
	
	
	public Double salarioComTaxa() {
		return salario - taxa;
	}
	
	public void porcentAumento(double porcent) {
		salario += porcent/100*salario;
		
	}
	public void texto() {
		System.out.println("Valor com aumento: "+salario);
	}
}

