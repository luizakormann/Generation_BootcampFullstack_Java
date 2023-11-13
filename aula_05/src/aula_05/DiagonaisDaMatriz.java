package aula_05;

import java.util.Scanner;

public class DiagonaisDaMatriz {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int el_dig_principal = 0, soma_dig_principal = 0, el_dig_sec = 0, soma_dig_sec = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha == coluna) {
					el_dig_principal = (matriz[linha][coluna]);
					soma_dig_principal += el_dig_principal;
				}
				if (linha + coluna == 2) {
					el_dig_sec = (matriz[linha][coluna]);
					soma_dig_sec += el_dig_sec;
				}

			}
		}

		// Todos os elementos da Diagonal Principal - C = L
		System.out.println("Elementos da diagonal principal: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha == coluna) {
				System.out.println(matriz[linha][coluna] + " ");
				}
			}
		}
		// Todos os elementos da Diagonal Secundária - C + L = 2
		System.out.println("Elementos da diagonal secundária: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha + coluna == 2) {
				System.out.println(matriz[linha][coluna] + " ");
				}
			}
		}
		System.out.println("Soma dos elementos da Diagonal Principal: " + soma_dig_principal);
		System.out.println("Soma dos elementos da Diagonal Secundária: " + soma_dig_sec);

	}

}
