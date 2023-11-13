package aula_05;

import java.util.Scanner;

public class LocalizarNoVetor {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int num = 0, posicao = -1;

		System.out.println("Boas vindas! Esse é o localizador da posição de números.");
		// algoritmo que consiga pesquisar dados no vetor
		System.out.println("Digite o valor procurado para descobrir sua posição no vetor:");
		num = leia.nextInt();
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] == num) {
				posicao = i;
				System.out.println("O número " + num + " está localizado na posição: " + posicao);
			}
		}

		if (posicao <= -1)
			System.out.println(
					"O número " + num + " não foi encontrado. Por favor, reinicialize e digite um número válido.");
	}

}
