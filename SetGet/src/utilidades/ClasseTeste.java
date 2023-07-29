package utilidades;

public class ClasseTeste {
	private String nome;
	private String sobrenome;
	private int idade;
	private double salario;
	
	
	
	public ClasseTeste() {
		super();
	}
	public ClasseTeste(String nome, String sobrenome, int idade, double salario) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.salario = salario;
	}
	public ClasseTeste(String nome, String sobrenome, int idade) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
