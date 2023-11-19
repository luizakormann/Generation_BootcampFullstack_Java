package aula_08;

public class Produto {

	private String nome;
	private int categoria;
	private int faixaetaria;
	private int fabricante;
	private int acessorios;
	
	public Produto(String nome, int categoria, int faixaetaria, int fabricante, int acessorios) {
		this.nome = nome;
		this.categoria = categoria;
		this.faixaetaria = faixaetaria;
		this.fabricante = fabricante;
		this.acessorios = acessorios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getFaixaetaria() {
		return faixaetaria;
	}

	public void setFaixaetaria(int faixaetaria) {
		this.faixaetaria = faixaetaria;
	}

	public int getFabricante() {
		return fabricante;
	}

	public void setFabricante(int fabricante) {
		this.fabricante = fabricante;
	}

	public int getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(int acessorios) {
		this.acessorios = acessorios;
	}
	
	public void visualizar() {
		
		String categoria_nome = "";
		switch(this.categoria) {
		case 1 -> categoria_nome = "Ação/Guerra";
		case 2 -> categoria_nome = "Aventura/Desafios";
		case 3 -> categoria_nome = "Esportes";
		}
		String faixa_etaria = "";
		switch (this.faixaetaria) {
		case 1 -> faixa_etaria = "acima de 18 anos";
		case 2 -> faixa_etaria = "acima de 16 anos";
		case 3 -> faixa_etaria = "livre";
		}
		String fabricante_jogo = "";
		switch (this.fabricante) {
		case 1 -> fabricante_jogo = "Sony";
		case 2 -> fabricante_jogo = "Nintendo";
		case 3 -> fabricante_jogo = "Microsoft";
		}
		String tipo_ac = "";
		switch (this.acessorios) {
		case 1 -> tipo_ac = "fones";
		case 2 -> tipo_ac = "óculos";
		case 3 -> tipo_ac = "n/a";
		}
		
		System.out.println("Boas vindas à Loja de Games! Aqui estão as informações do produto: ");
		System.out.println("Nome do jogo: " + this.nome);
		System.out.println("Categoria: " + categoria_nome);
		System.out.println("Indicação faixa etária: " + faixa_etaria);
		System.out.println("Fabricante: " + fabricante_jogo);
		System.out.println("Acessórios recomendados: " + tipo_ac + "\n");
	}
	
}
