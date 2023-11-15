package aula06;

import java.util.ArrayList;
import java.util.Scanner;

public class CoresArrayList {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite a cor " + (i + 1) + ": ");
			cores.add(leia.nextLine());
		}
		System.out.println(cores);
		cores.sort(null);
		System.out.println(cores);
	}

}