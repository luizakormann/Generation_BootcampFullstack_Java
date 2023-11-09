package aula_02;

import java.util.Scanner;

public class Diferenca_produtos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Boas vindas! Vamos calcular a diferença entre o produto dos números. Por favor, digite o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("O segundo número será aquele que multiplicará com o primeiro. Pode digitar: ");
		n2 = leia.nextFloat();
		System.out.println("Agora digite o terceiro número: ");
		n3 = leia.nextFloat();
		System.out.println("Por fim, digite o quarto número. Ele que será multiplicado pelo terceiro: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença entre os produtos é" + diferenca);

	}

}
