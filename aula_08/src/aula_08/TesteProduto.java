package aula_08;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Invasores do espaço", 1, 2, 1, 1);
		p1.visualizar();

		Produto p2 = new Produto("SpaceJam", 2, 3, 3, 2);
		p2.visualizar();
	}

}
