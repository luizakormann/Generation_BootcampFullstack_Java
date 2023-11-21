package aula_08;

public class ClientesPJ extends Clientes{
	
	private String cnpj;

	public ClientesPJ(String nome, String endereco, int id, int item_favorito, int ultima_compra, String cnpj) {
		super(nome, endereco, id, item_favorito, ultima_compra);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCpf(String cnpj) {
		this.cnpj = cnpj;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj + "\n");
	}
}
