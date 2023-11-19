package aula_08;

public class Funcionarios {
	private String nome;
	private String sobrenome;
	private int cargo;
	private int unidade;
	private float salario;

	public Funcionarios(String nome, String sobrenome, int cargo, int unidade, float salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cargo = cargo;
		this.unidade = unidade;
		this.salario = salario;
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

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void visualizar() {

		String cod_cargo = "";
		switch (this.cargo) {
		case 1 -> cod_cargo = "gerente";
		case 2 -> cod_cargo = "supervisor";
		case 3 -> cod_cargo = "vendedor";
		}

		String cidade = "";
		switch (this.unidade) {
		case 1 -> cidade = "São Paulo";
		case 2 -> cidade = "São Sebastião";
		case 3 -> cidade = "Atibaia";
		}

		System.out.println("Boas vindas! Aqui estão as informações da pessoa colaboradora: ");
		System.out.println("Nome completo: " + this.nome + " " + this.sobrenome);
		System.out.println("Unidade: " + cidade);
		System.out.println("Cargo: " + cod_cargo);
		System.out.println("Salário: R$" + this.salario + "\n");
	}

}
