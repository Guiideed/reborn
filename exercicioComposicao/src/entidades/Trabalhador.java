package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.enumeradas.Experiencia;

public class Trabalhador {
	private String nome;
	private Experiencia nivel;
	private Double salarioBase;
	
	
	private Departamentos departamento;
	private List<ContratoPorHora> contratos = new ArrayList<>();
	
	
	public Trabalhador() {
		
	}


	public Trabalhador(String nome, Experiencia nivel, Double salarioBase, Departamentos departamento) {
		
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Experiencia getNivel() {
		return nivel;
	}


	public void setNivel(Experiencia nivel) {
		this.nivel = nivel;
	}


	public Double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public Departamentos getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}


	public List<ContratoPorHora> getContratos() {
		return contratos;
	}

	
	public void adicionaContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}
	public void removeContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(ContratoPorHora c: contratos) {
				cal.setTime(c.getData());
				int c_ano = cal.get(Calendar.YEAR);
				int c_mes = cal.get(Calendar.MONTH) +1 ;
				if(ano == c_ano && mes ==c_mes) {
					soma+=c.valorTotal();
				}
				
		}
		return soma;
	}
	
}
