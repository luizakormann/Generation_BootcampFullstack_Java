package aula_04;

import java.util.Scanner;

public class MediaNumsComDoWhile {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num = 0, cont = 0;
		float soma = 0.0f, media = 0.0f;
		
		System.out.println("Boas-vindas! Esta calculadora informará a média de todos os múltiplos de 3 informados pelo usuário.");
		System.out.println("Digite quantos números quiser, a calcuradora utilizará apenas aqueles que são múltiplos de 3 para calcular a média.");
		System.out.println("\nPara encerrar os inputs e ver o resultado, digite 0.");
		
		// leia números inteiros via teclado desde que sejam múltiplos de 3.
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if((num % 3 == 0) && (num != 0)) {
				soma += num;
				cont ++;
			}
		// até que o número zero seja digitado.
		}while(num != 0);
		
		// mostre na tela a média de todos os números digitados
		
		media = (soma / cont);
		System.out.printf("Programa finalizado!\nA média de todos os números múltiplos de 3 é: %.2f", media);

	}

}
