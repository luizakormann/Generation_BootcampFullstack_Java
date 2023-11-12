package aula_03;

import java.util.Scanner;

public class ReajusteSalariosComSwitch {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int cargo;
		double sal, novo_sal = 0;
		String nome, cargo_print = "Estag";
		
		System.out.println("Boas vindas! Com os reajustes implementados, criamos este programa para facilitar o cálculo do reajuste de cada colaborador.");
		System.out.println("Insira as informações conforme solicitado para saber o novo salário de cada colaborador.");
		// leia o Nome do Colaborador (String) Código do Cargo do Colaborador ( 1 a 6) e o Salário
		System.out.println("\nInforme o nome da pessoa colaboradora:");
		nome = leia.next();
		System.out.println("Insira o código do cargo da pessoa colaboradora, conforme Manual da Empresa:");
		cargo = leia.nextInt();
		System.out.println("Informe o atual salário da pessoa:");
		sal = leia.nextInt();
		
		switch(cargo) {
		case 1:
			novo_sal = sal + (0.1 * sal);
			cargo_print = "Gerente";
			break;
		case 2:
			novo_sal = sal + (0.07 * sal);
			cargo_print = "Vendedor";
			break;
		case 3:
			novo_sal = sal + (0.09 * sal);
			cargo_print = "Supervisor";
			break;
		case 4:
			novo_sal = sal + (0.06 * sal);
			cargo_print = "Motorista";
			break;
		case 5:
			novo_sal = sal + (0.05 * sal);
			cargo_print = "Estoquista";
			break;
		case 6:
			novo_sal = sal + (0.08 * sal);
			cargo_print = "Técnico de TI";
			break;
		}
		
		System.out.println("\nPrograma finalizado! Seguem os resultados: ");
		System.out.println("-------------------------------------------");
		System.out.println("Nome colaborador: " + nome);
		System.out.println("Cargo: " + cargo_print);
		System.out.println("Novo salário: R$ " + novo_sal);
		System.out.println("Para calcular o próximo salário, reinicialize a página.");

	}

}
