package aula_08;

public class Clientes {

	private String nome;
	private String sobrenome;
	private int id;
	private int item_favorito;
	private int ultima_compra;

	public Clientes(String nome, String sobrenome, int id, int item_favorito, int ultima_compra) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.id = id;
		this.item_favorito = item_favorito;
		this.ultima_compra = ultima_compra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItem_favorito() {
		return item_favorito;
	}

	public void setItem_favorito(int item_favorito) {
		this.item_favorito = item_favorito;
	}

	public int getUltima_compra() {
		return ultima_compra;
	}

	public void setUltima_compra(int ultima_compra) {
		this.ultima_compra = ultima_compra;
	}
	public void visualizar() {
		
		String item = "";
		switch(this.item_favorito) {
		case 1 -> item = "Geléia";
		case 2 -> item = "Doce de leite";
		case 3 -> item = "Rapadura";
		case 4 -> item = "Pêssego em calda";		
		}
		
		String compra = "";
		switch(this.ultima_compra) {
		case 1 -> compra = "Geléia";
		case 2 -> compra = "Doce de leite";
		case 3 -> compra = "Rapadura";
		case 4 -> compra = "Pêssego em calda";		
		}
		
		System.out.println("Boas vindas! Aqui estão as informações do seu cliente:");
		System.out.println("Nome completo: " + this.nome + " " + this.sobrenome);
		System.out.println("ID cliente: " + this.id);
		System.out.println("Item favorito (mais comprado): " + item);
		System.out.println("Última compra: " + compra);
	}
}
