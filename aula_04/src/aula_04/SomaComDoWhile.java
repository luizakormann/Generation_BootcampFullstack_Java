package aula_04;

import java.util.Scanner;

public class SomaComDoWhile {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero, soma = 0;
		
		// leia números inteiros via teclado, até que o número zero seja digitado.
		System.out.println("Boas vindas! \n\nEssa calculadora somará os números positivos inputados. Digite quantos números quiser. \nPara finalizar a operação, digite 0");
		do {
			System.out.println("Digite um número qualquer: ");
			numero = leia.nextInt();
			// mostre na tela a soma de todos os números digitados, que sejam positivos.
			if(numero > 0) {
				soma += numero;
			}
		}while (numero != 0);
		System.out.println("A soma dos números positivos inseridos é: " + soma);
	}

}
