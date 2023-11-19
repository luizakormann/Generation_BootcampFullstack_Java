package aula_08;

public class TestaCurso {

	public static void main(String[] args) {
		Curso cr1 = new Curso("Pitch", 1, 1, 2, 300.00f);
		cr1.visualizar();
		
		Curso cr2 = new Curso("Versionamento GIT", 2, 2, 1, 600.00f);
		cr2.visualizar();
	}

}
