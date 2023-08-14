package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entidade.enumeradas.Experiencia;
import entidades.ContratoPorHora;
import entidades.Departamentos;
import entidades.Trabalhador;



public class Programa {
	public static void main(String[]args) throws ParseException {
		
		Scanner leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		System.out.println("Qual o departamento?");
		String nomeDepartamento = leitor.next();
		
		System.out.println("Insira os dados do trabalhador");
		System.out.println("Nome: ");
		String nomeTrabalhador = leitor.nextLine();
		leitor.nextLine();
		System.out.println("Nivel:");
		String nivelTrabalhador = leitor.nextLine();
		System.out.println("Salario base: ");
		Double salarioTrabalhador = leitor.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, Experiencia.valueOf(nivelTrabalhador),salarioTrabalhador, new Departamentos(nomeDepartamento) );
		
		System.out.println("Quantos contratos o trabalhador tem? ");
		int n = leitor.nextInt();
		
		
		
		for(int i = 0; i <n; i++) {
			System.out.println("Contrato " + (i+1));
			System.out.print("Data (DD/MM/YYYY)" );
			Date dataContrato = sdf.parse(leitor.next());
			System.out.println("Valor por hora: ");
			double valorPorHora = leitor.nextDouble();
			System.out.println("Duracao do contrato");
			int duracContrat = leitor.nextInt();
			ContratoPorHora contrato =new ContratoPorHora(dataContrato, valorPorHora, duracContrat);
			trabalhador.adicionaContrato(contrato);
		}
		
		System.out.println("Insira o mes e ano para calcular a renda (MM/YYYY): ");
		String mesEAno = leitor.next();
		int mes = Integer.parseInt(mesEAno.substring(0,2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		
		
		System.out.println("Nome: "+ trabalhador.getNome());
		System.out.println("Departamento: "+ trabalhador.getDepartamento().getNome());
		System.out.println("Renda de "+ mesEAno + " " + String.format("%.2f", trabalhador.renda(ano, mes))  );
		
		
		leitor.close();
	}
}
