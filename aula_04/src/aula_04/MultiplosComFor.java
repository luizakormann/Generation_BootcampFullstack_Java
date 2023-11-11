package aula_04;

import java.util.Scanner;


public class MultiplosComFor {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int comeco_int, final_int;
			
		
		System.out.println("Boas-vindas! Esta calculadora te ajudará a descobrir quais os números múltiplos de 3 e 5 de um determinado intervalo.");
		System.out.println("\nPedimos que digite o valor inicial do intervalo e, na sequência, o final.");
		System.out.println("Solicitamos apenas que o número início do intervalo seja menor que o final.");
		// leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o segundo número
		System.out.println("\nInforme o início do intervalo:");
		comeco_int = leia.nextInt();
		
		System.out.println("\nAgora informe o final do intervalo:");
		final_int = leia.nextInt();
		
		// Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
		if(final_int <= comeco_int) {
			System.out.println("Intervalo informado é inválido. O final do intervalo deve ser um número maior que o início. Tente novamente");
		}
		
		// No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5. 
		else {
		for(int i = comeco_int; i <= final_int; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.printf("%d é múltiplo de 3 e 5;\n", i);
			}
		}
	}

	}

}
