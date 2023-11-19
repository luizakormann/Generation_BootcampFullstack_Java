package aula_08;

public class Curso {

	private String ncurso;
	private int duracao;
	private int area;
	private int formato;
	private float preco;

	public Curso(String ncurso, int duracao, int area, int formato, float preco) {
		this.ncurso = ncurso;
		this.duracao = duracao;
		this.area = area;
		this.formato = formato;
		this.preco = preco;
	}

	public String getNcurso() {
		return ncurso;
	}

	public void setNcurso(String ncurso) {
		this.ncurso = ncurso;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getFormato() {
		return formato;
	}

	public void setFormato(int formato) {
		this.formato = formato;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		String durcurso = "";
		switch (this.duracao) {
		case 1 -> durcurso = "3 meses";
		case 2 -> durcurso = "6 meses";
		case 3 -> durcurso = "1 anos";
		}
		String areaconhec = "";
		switch (this.area) {
		case 1 -> areaconhec = "Habilidades Comportamentais";
		case 2 -> areaconhec = "Habilidades Técnicas";
		}
		String formatoc = "";
		switch (this.formato) {
		case 1 -> formatoc = "Online";
		case 2 -> formatoc = "Presencial";
		case 3 -> formatoc = "Híbrido";
		}

		System.out.println("Boas vindas! Confira abaixo as informações do curso escolhido: ");
		System.out.println("Nome do curso: " + this.ncurso);
		System.out.println("Duração total: " + durcurso);
		System.out.println("Área conhecimento: " + areaconhec);
		System.out.println("Formato do curso: " + formatoc);
		System.out.println("Valor do investimento: " + this.preco + "\n");
	}
}
