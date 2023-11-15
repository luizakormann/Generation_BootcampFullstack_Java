package aula06;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class AnotacoesAula {

	public static void main(String[] args) {
		Set<String> frutas = new HashSet<String>();
		Queue<String> fila = new LinkedList<String>();
		
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Jaboticaba");
		frutas.add("Kiwi");
	
		fila.add("Luiza");
		fila.add("Angela");
		fila.add("Roberta");
		fila.add("Cora");
		
		System.out.println(fila);
		
		fila.peek();
		
		
	}

}
