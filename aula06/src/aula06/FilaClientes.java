package aula06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaClientes {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int op;
		// Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao
		// tentar retirar (chamar) um cliente da fila..

		System.out.println("*************************Opções do programa***************************\n");
		System.out.println("1 - Adicionar Cliente na Fila");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Chamar próximo Cliente");
		System.out.println("0 - Sair\n");
		System.out.println("**********************************************************************\n");

		Queue<String> filaClientes = new LinkedList<String>(); // primeira fila criada!!

		System.out.println("Por favor, entre com a opção desejada:");
		op = leia.nextInt();

		while (op != 0) {
			switch (op) {
			case 0:
				System.out.println("Programa finalizado!");
				break;
			case 1:
				System.out.println("Digite o nome do cliente:");
				leia.skip("\\R");
				filaClientes.add(leia.nextLine());
				break;
			case 2:
				System.out.println("Os clientes na fila atualmente são:");
				System.out.println(filaClientes);
				break;
			case 3:
				System.out.println("Chegou a sua vez, ");
				filaClientes.poll();
				break;
			default:
				System.out.println(
						"Opção inválida! Por favor, reinicialize e digite uma opção válida de acordo com o menu de opções.");
				break;
			}
		}
	}
}
