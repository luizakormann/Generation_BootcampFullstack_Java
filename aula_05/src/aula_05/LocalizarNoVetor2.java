package aula_05;

import java.util.Scanner;

public class LocalizarNoVetor2 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[] v_vazio = new int[10];
		int soma = 0;
		float media = 0.00f;
		String i_impares = "", i_pares = " ";

		System.out.println("Boas vindas! Vamos criar um vetor?");
		System.out.println(
				"Após inserir os 10 números que comporão o vetor, apresentaremos algumas características o compõem.");
		// leia 10 números inteiros e armazene em um vetor.

		for (int i = 0; i < v_vazio.length; i++) {
			System.out.println("\nDigite um número: ");
			v_vazio[i] = leia.nextInt();
			soma += v_vazio[i];
			media = ((float) soma) / v_vazio.length;
			if (i % 2 != 0) {
				i_impares += (v_vazio[i]) + ", ";
			}
			if (v_vazio[i] % 2 == 0) {
				i_pares += (v_vazio[i]) + ", ";
			}
		}
		// Todos os elementos dos índices ímpares do vetor
		System.out.println("Elementos nos índices ímpares: " + i_impares);

		// Todos os elementos do vetor que são números pares
		System.out.println("Elementos pares: " + i_pares);
		// A Soma de todos os elementos do vetor
		System.out.println("Soma: " + soma);
		// A Média de todos os elementos do vetor, armazenada em uma variável real
		System.out.printf("Media: %.2f", media);
	}

}
