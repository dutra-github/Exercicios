package exercicios;

public class Mamifero extends Animal {
	
	private String alimento;

	public Mamifero(String nome, float comprimento, int qtdPatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
		super(nome, comprimento, qtdPatas, cor, ambiente, velocidadeMedia);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void dadosMamifero() {
		super.dados();
		System.out.println("Alimento: "+getAlimento());
	}

	@Override
	public void comer() {
		System.out.println("Comendo como Mamífero");
	}

}
