package app;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
public class Programa {
	public static void main(String []args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Qual o nome do aluno(a)");
		aluno.nomeAluno = leitor.nextLine();
		
		System.out.println("Quais foram as notas de seus 3 trimestres?:");
		aluno.pTrimestre = leitor.nextDouble();		
		aluno.sTrimestre = leitor.nextDouble();		
		aluno.tTrimestre = leitor.nextDouble();		
		
		
		System.out.println( "A nota total do aluno é "+aluno.notaFinal());
		
		System.out.println(aluno.situaFinal());
		
		leitor.close();
	}
}
