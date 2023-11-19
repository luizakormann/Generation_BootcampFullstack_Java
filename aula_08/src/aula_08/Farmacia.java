package aula_08;

public class Farmacia {

	private String produto;
	private int categoria;
	private float preco;
	private int receita;
	private int estoque;

	public Farmacia(String produto, int categoria, float preco, int receita, int estoque) {
		this.produto = produto;
		this.categoria = categoria;
		this.preco = preco;
		this.receita = receita;
		this.estoque = estoque;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getReceita() {
		return receita;
	}

	public void setReceita(int receita) {
		this.receita = receita;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void visualizar() {

		String nome_categoria = "";
		switch (this.categoria) {
		case 1 -> nome_categoria = "Remédios";
		case 2 -> nome_categoria = "Higiene";
		case 3 -> nome_categoria = "Suplementos";
		}
		String lib_receita = "";
		switch (this.receita) {
		case 1 -> lib_receita = "receita simples";
		case 2 -> lib_receita = "receita controlada";
		case 3 -> lib_receita = "não é necessária";
		}

		System.out.println("Boas vindas! Verifique as informações do produto abaixo: ");
		System.out.println("Produto: " + this.produto);
		System.out.println("Categoria: " + nome_categoria);
		System.out.println("Quantidade em estoque: " + this.estoque);
		System.out.println("Tipo de receita: " + lib_receita);
		System.out.println("Valor unitário: " + this.preco);
	}
}
