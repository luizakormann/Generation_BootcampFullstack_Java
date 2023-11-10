package aula_04;

import java.util.Scanner;

public class ContadorParidadeNumeros {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia 10 números inteiros via teclado
		// e mostre na tela quantos números são pares e quantos número são ímpares. Veja
		// o exemplo abaixo:

		int numero, pares = 0, impares = 0;

		System.out.println(
				"Boas vindas! \nEsse é o contador de números pares e ímpares. \n\nPediremos para você digitar 10 números e contaremos quantos desses números são pares e quantos são ímpares.");
		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("Programa finalizado! Os resultados são:");
		System.out.println("---------------------------------------");
		System.out.println("Total de números pares digitados: " + pares);
		System.out.println("Total de números ímpares digitados: " + impares);

	}

}
