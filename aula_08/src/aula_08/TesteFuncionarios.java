package aula_08;

public class TesteFuncionarios {

	public static void main(String[] args) {
		
		Funcionarios f1 = new Funcionarios("Elias", "Monteiro", 1, 2, 7000.00f);
		f1.visualizar();
		Funcionarios f2 = new Funcionarios("Magaly", "Soares", 2, 3, 5000.00f);
		f2.visualizar();
		FuncionariosLider fl1 = new FuncionariosLider("Gisele", "Menezes", 1, 2, 7000.00f, 1);
		fl1.visualizar();
		FuncionariosLider fl2 = new FuncionariosLider("Roberto", "Prado", 2, 1, 5000.00f, 2);
		fl2.visualizar();
		FuncionariosOp fo1 = new FuncionariosOp("Claudio", "Fonseca", 3, 2, 3000.00f, 2000.00f);
		fo1.visualizar();
		FuncionariosOp fo2 = new FuncionariosOp("Rafaela", "Filho", 3, 3, 3000.00f, 3000.00f);
		fo2.visualizar();
		
	}

}
