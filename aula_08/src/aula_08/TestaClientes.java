package aula_08;

public class TestaClientes {

	public static void main(String[] args) {
	
		Clientes c1 = new Clientes("João", "Rua do Endereço, 123", 000001, 3, 2);
		c1.visualizar();
		
		Clientes c2 = new Clientes("Maria", "Avenida do Endereço, 321", 000002, 4, 1);
		c2.visualizar();
		
		ClientesPF cpf1 = new ClientesPF("Daniela", "Alameda do Endereço, 213", 000003, 2, 2, "123.456.789-10");
		cpf1.visualizar();
		
		ClientesPF cpf2 = new ClientesPF("Manoel", "Travessa do Endereço, 213", 000004, 1, 3, "987.654.321-21");
		cpf2.visualizar();
		
		ClientesPJ cnpj1 = new ClientesPJ("Brechó Legal SA", "Travessa do Endereço, 312", 000005, 2, 4, "123.123/0001-12");
		cnpj1.visualizar();
		
		ClientesPJ cnpj2 = new ClientesPJ("Borracharia da Joaquina", "Avenida do Endereço, 312", 000006, 4, 3, "321.312/0001-15");
		cnpj2.visualizar();

	}

}
