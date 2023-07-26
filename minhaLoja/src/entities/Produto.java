package entities;

public class Produto {
		public String nomeProduto;
		public double preco;
		public int quantidadeEstoque;
		
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
