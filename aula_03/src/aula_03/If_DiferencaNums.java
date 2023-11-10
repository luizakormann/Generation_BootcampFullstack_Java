package aula_03;

import java.util.Scanner;

public class If_DiferencaNums {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num1, num2, num3, soma_nums;
		
		System.out.println("Vamos descobrir se A + B é igual, maior ou menor que C. \n\nDigite primeiro o número que será A:");
		num1 = leia.nextInt();
		System.out.println("Digite agora o número que será B:");
		num2 = leia.nextInt();
		System.out.println("Por fim, digite o número que será C:");
		num3 = leia.nextInt();
		
		soma_nums = (num1 + num2);
		
		if(soma_nums > num3) {
			System.out.println("A soma de A + B é maior que C.");
			
		}
		else if(soma_nums < num3) {
			System.out.println("A soma de A + B é menor que C.");
		}
		else {
			System.out.println("A soma de A + B é igual à que C.");
		}
			
	}

}
