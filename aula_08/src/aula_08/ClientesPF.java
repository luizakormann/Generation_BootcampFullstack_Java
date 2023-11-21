package aula_08;

public class ClientesPF extends Clientes {

	private String cpf;

	public ClientesPF(String nome, String endereco, int id, int item_favorito, int ultima_compra, String cpf) {
		super(nome, endereco, id, item_favorito, ultima_compra);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf + "\n");
	}

}
