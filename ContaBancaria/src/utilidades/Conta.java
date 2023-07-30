package utilidades;

public class Conta {
		private int numeroConta;
		private String nomeTitular;
		private double saldo;
		
		
		public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
			
			this.numeroConta = numeroConta;
			this.nomeTitular = nomeTitular;
			deposito(depositoInicial);
		}
		
		public Conta(int numeroConta, String nomeTitular) {
			
			this.numeroConta = numeroConta;
			this.nomeTitular = nomeTitular;
		}
		
		

		public int getNumeroConta() {
			return  numeroConta;
		}
		
		public String getNomeTitular() {
			return nomeTitular;
		}
		public void setNomeTitular(String nomeTitular) {
			this.nomeTitular = nomeTitular;
		}
		public Double getSaldo() {
			return saldo;
		}
		
		public void deposito(double valorDeposito) {
			saldo += valorDeposito;
			
			
		}
		public void saque(double valorSaque) {
			saldo -= valorSaque + 5.0;
		}
		
		
		public String toString() {
			return "Conta " + numeroConta  + "----Titular  " + nomeTitular + "----Saldo  " + String.format("%.2f", saldo) ;
		}
		
		
		
}