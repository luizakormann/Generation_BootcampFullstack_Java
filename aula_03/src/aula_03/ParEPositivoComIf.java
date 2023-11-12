package aula_03;

import java.util.Scanner;

public class ParEPositivoComIf {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Boas Vindas!\n\nEste é o verificador de paridade de qualquer número que você inserir.\nAlém de indicar se par ou ímpar, será retornado se o número é positivo ou negativo.");
		System.out.println("Para parar o programa, insira o número 0.");
		// leia um número inteiro via teclado
		do {
			System.out.println("Por favor, insira um número para o teste: ");
			num = leia.nextInt();
					
			// este número é par ou ímpar e se o número é positivo ou negativo
			if(num % 2 == 0 && num < 0) {
				System.out.println("Este número é par e negativo.");
			}
			else if(num % 2 == 0 && num > 0) {
				System.out.println("Este número é par e positivo.");
			}
			if(num % 2 != 0 && num < 0) {
				System.out.println("Este número é ímpar e negativo.");
			}
			if(num % 2 != 0 && num > 0) {
				System.out.println("Este número é ímpar e positivo.");
			}
		}while(num != 0);

	}

}
