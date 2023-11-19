package aula_08;

public class Ingresso {
	private String evento;
	private int tipo;
	private int local;
	private int secao;
	private float preco;

	public Ingresso(String evento, int tipo, int local, int secao, float preco) {
		this.evento = evento;
		this.tipo = tipo;
		this.local = local;
		this.secao = secao;
		this.preco = preco;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getLocal() {
		return local;
	}

	public void setLocal(int local) {
		this.local = local;
	}

	public int getSecao() {
		return secao;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {
		String tipo_evento = "";
		switch (this.tipo) {
		case 1 -> tipo_evento = "Show";
		case 2 -> tipo_evento = "Teatro";
		case 3 -> tipo_evento = "Cinema";
		}
		String cidade = "";
		switch (this.local) {
		case 1 -> cidade = "São Paulo";
		case 2 -> cidade = "Salvador";
		case 3 -> cidade = "Recife";
		}
		String secao_ing = "";
		switch (this.secao) {
		case 1 -> secao_ing = "Pista";
		case 2 -> secao_ing = "Balcão superior";
		}

		System.out.println("Boas vindas! Confirme os dados de seu evento abaixo: ");
		System.out.println("Nome do evento: " + this.evento);
		System.out.println("Tipo do evento: " + tipo_evento);
		System.out.println("Local do evento: " + cidade);
		System.out.println("Seção do seu ingresso: " + secao_ing);
		System.out.println("Valor do ingresso: R$" + this.preco + "\n");
	}

}
