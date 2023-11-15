package aula06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetIterator {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		int num;

		// O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores
		// inteiros não repetidos
		System.out.println(
				"Boas vindas! Vamos criar uma Collection Set?\nVocê digitará 10 números inteiros, aleatórios e não repetidos.");
		System.out.println(
				"Depois o programa mostrará os elementos únicos do seu Set (se você digitar números repetidos, ele mostrará apenas uma vez)");
		System.out.println("\nPor favor, digite 10 números:");
		// adicione-os individualmente na Collection Set.
		for (int i = 0; i < 10; i++) {
			set.add(leia.nextInt());
		}
			
		//Criando o primeiro Iterator
		Iterator<Integer> iSet = set.iterator();
		
		// Mostre na tela todos os elementos da Collection Set, utilizando Iterator
		System.out.println("Os números únicos do seu Set são:");
		while (iSet.hasNext()) {
			System.out.println(iSet.next());
		}
		
	}
}
