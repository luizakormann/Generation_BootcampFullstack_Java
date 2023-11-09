package aula_02;
import java.util.Scanner;
public class Salario_mensal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salario_bruto, adicional_noturno, horas_extras, descontos, salario_liq;
		
		System.out.println("Boas vindas! Vamos calcular o salário líquido da pessoa colaboradora. Por favor, digite o salário bruto: ");
		salario_bruto = leia.nextFloat();
		System.out.println("Agora insira o adicional noturno do mês vigente. Caso não haja, insira o número 0: ");
		adicional_noturno = leia.nextFloat();
		System.out.println("Por favor, insira as horas extras do mês, se houverem. Caso contrário, insira o número 0: ");
		horas_extras = leia.nextFloat();
		System.out.println("Por fim, insira os eventuais descontos do mês, se houverem. Caso contrário, insira o número 0: ");
		descontos = leia.nextFloat();
		
		salario_liq = salario_bruto + adicional_noturno + (horas_extras * 5) - descontos;
		
		System.out.println("O salário líquido da pessoa colaboradora este mês é: R$" + salario_liq);
		
		leia.close(); // Fechando Scanner
	}

}
