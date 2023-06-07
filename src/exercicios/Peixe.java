package exercicios;

public class Peixe extends Animal {
	
	private String caracteristica;

	public Peixe(String nome, float comprimento, int qtdPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
		super(nome, comprimento, qtdPatas, cor, ambiente, velocidadeMedia);
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public void dadosPeixe() {
		super.dados();
		System.out.println("Caracterisca: "+getCaracteristica());
	}

	@Override
	public void comer() {
		System.out.println("Comendo como peixe");
	}
}
