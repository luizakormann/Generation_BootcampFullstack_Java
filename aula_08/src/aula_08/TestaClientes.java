package aula_08;

public class TestaClientes {

	public static void main(String[] args) {
	
		Clientes c1 = new Clientes("João", "Silva", 000001, 3, 2);
		c1.visualizar();
		
		Clientes c2 = new Clientes("Maria", "Macedo", 000002, 4, 1);
		c2.visualizar();

	}

}
