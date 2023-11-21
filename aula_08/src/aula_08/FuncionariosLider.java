package aula_08;

public class FuncionariosLider extends Funcionarios {

	private int area;
	public FuncionariosLider(String nome, String sobrenome, int cargo, int unidade, float salario, int area) {
		super(nome, sobrenome, cargo, unidade, salario);
		this.area = area;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	public void visualizar() {
		String l_area = "";
		switch(this.area) {
		case 1 -> l_area = "Comercial";
		case 2 -> l_area = "Logística";
		case 3 -> l_area = "Corporativo";		
		}
		super.visualizar();
		System.out.println("Responde pela área: " + l_area + "\n");
	}

}
