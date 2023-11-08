package aula_02;
import java.util.Scanner;
public class Media_final {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("Boas vindas! Vamos calcular sua média final. Por favor, digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Agora a nota do segundo bimestre: ");
		nota2 = leia.nextFloat();
		System.out.println("Terceiro bimestre, por favor: ");
		nota3 = leia.nextFloat();
		System.out.println("Por fim, o último bimestre: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1+nota2+nota3+nota4)/4;
		System.out.println("Sua média final é: " + mediaFinal);

	}

}
