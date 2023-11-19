package aula_08;

public class TesteFarmacia {

	public static void main(String[] args) {
		
		Farmacia far1 = new Farmacia("Pasta de dente", 2, 19.90f, 3, 57);
		far1.visualizar();
		Farmacia far2 = new Farmacia("Ritalina", 1, 55.90f, 2, 32);
		far2.visualizar();
	}

}
