package aula_08;

public class TesteFuncionarios {

	public static void main(String[] args) {
		
		Funcionarios f1 = new Funcionarios("Elias", "Monteiro", 1, 2, 7000.00f);
		Funcionarios f2 = new Funcionarios("Magaly", "Soares", 2, 3, 5000.00f);
		
		f1.visualizar();
		f2.visualizar();

	}

}
