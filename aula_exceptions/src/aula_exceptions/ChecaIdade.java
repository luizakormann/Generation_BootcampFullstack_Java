package aula_exceptions;

import java.util.Scanner;

public class ChecaIdade {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		
		try {
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		validarIdade(idade);
		}catch(ArithmeticException e) {
			System.out.println("A pessoa ainda não pode aprender a dirigir.");
		}
	}

	public static void validarIdade(int idade){
		
		if(idade > 18)
			System.out.println("A pessoa pode se inscrever no CFC!!");
		else
			throw new ArithmeticException();
		
	}

}
