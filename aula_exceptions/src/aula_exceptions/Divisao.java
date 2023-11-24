package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dividendo = 0;
		int divisor = 0;
		
		try {
		System.out.println("Digite o Dividendo: ");
		dividendo = ler.nextInt();
				
		System.out.println("Digite o Divisor: ");
		divisor = ler.nextInt();
				
		divide(dividendo, divisor);
		}catch(InputMismatchException e) {
			System.err.println("Erro de entrada: " + e + "\n\nDigite um numeral inteiro (sem vírgula/ponto).");
		}catch(ArithmeticException e) {
			System.err.println("Erro de entrada: " + e + "\n\nDigite um número diferente de 0 (não existe divisão por 0).");
		}
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
