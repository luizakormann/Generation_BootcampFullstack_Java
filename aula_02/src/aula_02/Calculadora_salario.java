package aula_02;

import java.util.Scanner;

public class Calculadora_salario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		float salario_base, abono_salarial, novo_salario;
		
		System.out.println("Seja bem vindo!\n Por favor, digite o salário base:");
		salario_base = leia.nextFloat();
		
		System.out.println("Agora digite o valor do abono referente:");
		abono_salarial = leia.nextFloat();
		
		novo_salario = salario_base + abono_salarial;
				
		System.out.println("O novo salario do funcionário será: R$" + novo_salario);
		
		
	}

}
