package aula_07;

import java.util.Scanner;

public class Calculadora {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

			int num1, num2, opcao;

			while (true) {
				System.out.println("1 - Somar");
				System.out.println("2 - Subtrair");
				System.out.println("3 - Multiplicar");
				System.out.println("4 - Dividir");
				System.out.println("0 - Sair");
				System.out.println("Qual a operação matemática você deseja realizar?");
				opcao = leia.nextInt();

				if (opcao == 0) {
					sobre();
					System.exit(0);
				}

				System.out.println("Insira o primeiro número");
				num1 = leia.nextInt();

				System.out.println("Insira o segundo número");
				num2 = leia.nextInt();

				switch (opcao) {
				case 1 -> System.out.println("Soma: " + somar(num1, num2));
				case 2 -> System.out.println("Subtrair: " + subtrair(num1, num2));
				case 3 -> System.out.println("Multiplicar: " + multiplicar(num1, num2));
				case 4 -> System.out.println("Dividir: " + dividir(num1, num2));
				default -> System.out.println("Opção inválida");

				}			
			}
		}

		/* Métodos com os mesmos nomes e assinaturas diferentes se trata de uma
		 * sobrecarga de método. 
		 * */
		static int somar(int num1, int num2) {
			return num1 + num2;
		}
		
		static float somar(float num1, float num2) {
			return num1 + num2;
		}

		static int subtrair(int num1, int num2) {
			return num1 - num2;
		}

		static int multiplicar(int num1, int num2) {
			return num1 * num2;
		}

		static float dividir(float num1, float num2) {
			return num1 / num2;
		}
		
		static void sobre() {
			System.out.println("Calculadora com métodos");
			System.out.println("Feito por: Vitor");
			
		}
	}