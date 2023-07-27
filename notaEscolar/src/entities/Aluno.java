package entities;

public class Aluno {
	public String nomeAluno;
	public double pTrimestre;
	public double sTrimestre;
	public double tTrimestre;
	
	
	public double notaFinal() {
		return pTrimestre + sTrimestre + tTrimestre;
	}
	
	public String situaFinal() {
		
		if (notaFinal()> 60) {
			return "Aprovado";
		}else {
			return "Reprovado, faltam "+ (60-notaFinal()) +" pontos";
		}
		
		
		
		
		
	}
	
	
}
