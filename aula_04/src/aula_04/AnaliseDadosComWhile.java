package aula_04;

import java.util.Scanner;

public class AnaliseDadosComWhile {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int id_gen, atividade, devs_back = 0, fem_front = 0, masc40_mobile = 0, nbin_full_jovem = 0, total_inputs, i = 0;
		float idade = 0, idade_media = 0, total_idade = 0;
		String cont = "S";

		System.out.println(
				"Olá, liderança! \n\nComo parte do planejamento de Diversidade da empresa, sua equipe deve ter lhe enviado as respostas do questionário.\nAqui você inputará as respostas de sua equipe.");

		while (cont.equalsIgnoreCase("S")) {
			// Pedir info idade
			System.out.println("Digite a idade do colaborador: ");
			idade = leia.nextInt();
			// Pedir info identidade de gênero
			System.out.println(
					"Insira o código referente a identidade de gênero do colaborador de acordo com as opções enviadas no e-mail:");
			id_gen = leia.nextInt();
			// Pedir info área que trabalha
			System.out.println(
					"Insira o código referente a atividade central do colaborador, de acordo com as opções enviadas no e-mail:");
			atividade = leia.nextInt();
			// Perguntar se ainda existem mais colaboradores a serem contabilizados para
			// pesquisa
			System.out.println(
					"Ainda existem colaboradores não computados na sua equipe? Se sim, digite \"S\".\nCaso já tenha inputado sua equipe inteira, digite \"N\" ");
			leia.skip("\\R");
			cont = leia.next();
			
			if (atividade == 1) {
				devs_back ++;
			}
			if ((id_gen == 1 && atividade == 2) || (id_gen == 4 && atividade == 2)) {
				fem_front ++;
			}
			if ((id_gen == 2 && atividade == 3 && idade > 40) || (id_gen == 5 && atividade == 3 && idade > 40)) {
				masc40_mobile ++;
			}
			if (id_gen == 3 && atividade == 4 && idade < 30) {
				nbin_full_jovem ++;
			}
			
			i ++;
			total_idade += idade;
			
		}
		// Mostrar O número de pessoas desenvolvedoras Backend
		System.out.println("Obrigada pela contribuição!\n Aqui estão os resultados da sua equipe:");
		System.out.println("----------------------------------------------");
		System.out.println("Total de pessoas desenvolvedoras backend: " + devs_back);

		// Mostrar O número de Mulheres Cis e Trans desenvolvedoras Frontend
		System.out.println("----------------------------------------------");
		System.out.println("Mulheres no front: " + fem_front);

		// Mostrar O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
		System.out.println("----------------------------------------------");
		System.out.println("Homens no mobile +40 anos: " + masc40_mobile);
		// Mostrar O número de Não Binários desenvolvedores FullStack menores de 30 anos
		System.out.println("----------------------------------------------");
		System.out.println("Não binários fullstacks -30 anos: " + nbin_full_jovem);
		// Mostrar O número total de pessoas que responderam à pesquisa
		System.out.println("----------------------------------------------");
		System.out.println("Número total de questionários respondidos: " + i);
		// Mostrar A média de idade das pessoas que responderam à pesquisa
		idade_media = total_idade/i;
		System.out.println("----------------------------------------------");
		System.out.println("Idade média: " + idade_media);

	}

}
