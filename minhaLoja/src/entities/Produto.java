package entities;

public class Produto {
		public String nomeProduto;
		public double preco;
		public int quantidadeEstoque;
		
		
		
		//criei um contrutor para que o objeto nao seja instanciado sem valor!!
		//o construtor tem o mesmo nome da classe e tem nos parametros os valores que devem ser obrigatorios!!
		public Produto(String nomeProduto, double preco, int quantidadeEstoque) {
			this.nomeProduto = nomeProduto;
			this.preco = preco;
			this.quantidadeEstoque= quantidadeEstoque;
		}
		
		
		public double valorTotalEstoque() {
			
			return preco*quantidadeEstoque;
			
			
		}
		public void adicionaProduto(int quantidadeEstoque) {
			this.quantidadeEstoque += quantidadeEstoque;
			
		}
		
		public void removeProdutos(int quantidadeEstoque) {
			this.quantidadeEstoque -= quantidadeEstoque;
		}
		
		public String toString() {
			return "O produto "+ nomeProduto+
					" esta no valor de R$"+preco+
					" e contém "+ quantidadeEstoque+" unidades em nossa loja" + 
					" o valor total em nosso estoque é de R$" + valorTotalEstoque();
			
		}
}
