package aula_08;

public class FuncionariosOp extends Funcionarios {
	private float total_vendas;
	public FuncionariosOp(String nome, String sobrenome, int cargo, int unidade, float salario, float total_vendas) {
		super(nome, sobrenome, cargo, unidade, salario);
		this.total_vendas = total_vendas;
	}
	public float getTotalVendas() {
		return total_vendas;
	}
	public void setArea(float total_vendas) {
		this.total_vendas = total_vendas;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Vendas líquido no mês: " + this.total_vendas + "\n");
	}
}
