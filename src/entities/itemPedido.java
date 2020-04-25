package entities;

public class itemPedido {

	private Integer quantidade;
	private Double preco;

	Produto produto;

	public itemPedido() {
	}

	public itemPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Double getPreco() {
		return preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double subTotal() {
		return quantidade * preco;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(produto.getNome() + "\nR$");
		sb.append(String.format("%.2f", preco) + "\n");
		sb.append("Quantidade: " + quantidade);
		sb.append("\nSubtotal R$" + String.format("%.2f", subTotal()));

		return sb.toString();
	}
}
