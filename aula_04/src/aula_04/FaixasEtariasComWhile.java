package aula_04;

import java.util.Scanner;

public class FaixasEtariasComWhile {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade = 1, menores = 0, maiores = 0;

		System.out.println(
				"Boas vindas!\nVamos descobrir quantas pessoas no seu grupo tem menos de 21 anos e quantas tem mais de 50.");
		System.out.println(
				"Digite a idade de cada uma das pessoas e aperte \"enter\".\nPara finalizar o programa, digite um número negativo.");

		// A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
		while (idade > 0) {
			System.out.println("Digite a idade:");
			idade = leia.nextInt();
			// total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja
			// idade seja maior que 50 anos.
			if (idade < 21 && idade > 0) {
				menores++;
			}
			if (idade > 50) {
				maiores++;
			}
		}
		// mostre os resultados
		System.out.println("Programa encerrado!\nAqui estão os resultados do seu grupo:");
		System.out.println("------------------------------------------------------------");
		System.out.println("O total de pessoas que tem menos de 21 anos é:" + menores);
		System.out.println("O total de pessoas que tem mais de 50 anos é:" + maiores);
	}

}
