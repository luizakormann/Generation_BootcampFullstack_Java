package aula_03;

import java.util.Scanner;

public class Caixa_lanchonete {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
	
		int codigo, quantidade;
		double valor_total, valor;
		String produto;
		
		System.out.println("Bem-vindo! Por favor, escolha o produto desejado: ");
		System.out.println("\nCachorro-quente - código 1");
		System.out.println("X-Salada - código 2");
		System.out.println("X-Bauru - código 3");
		System.out.println("Bauru - código 4");
		System.out.println("Refrigerante - código 5");
		System.out.println("Suco de laranja - código 6");
		System.out.println("\nAgora, por favor, digite o código do produto escolhido:");
		
		codigo = leia.nextInt();
		System.out.println("Maravilha! Qual a quantidade do produto desejado: ");
		quantidade = leia.nextInt();

		switch(codigo) {
			case 1:
				valor = 10.00;
				produto = "Cachorro Quente";
				break;
			case 2:
				valor = 15.00;
				produto = "X-Salada";
				break;
			case 3:
				valor = 18.00;
				produto = "X-Bacon";
				break;
			case 4:
				valor = 12.00;
				produto = "Bauru";
				break;
			case 5:
				valor = 8.00;
				produto = "Refrigerante";
				break;
			case 6:
				valor = 13.00;
				produto = "Suco de laranja";
				break;
			default:
				valor = 0;
				produto = "Produto inválido";
		}
		
		valor_total = (quantidade*valor);
		System.out.println("---------------------");
		System.out.printf("Produto: %s\nValor total: R$ %.2f\n4", produto,  valor_total);
		System.out.println("---------------------");
		
	}

}
