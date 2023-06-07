package exercicios;

public abstract class Animal {
	
	private String nome;
	private float comprimento;
	private int qtdPatas;
	private String cor;
	private String ambiente;
	private float velocidadeMedia;
	
	public Animal(String nome, float comprimento, int qtdPatas, String cor, String ambiente, float velocidadeMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.qtdPatas = qtdPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getQtdPatas() {
		return qtdPatas;
	}

	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public void dados() {
		System.out.println("Nome: "+getNome());
		System.out.println("Comprimento: "+getComprimento());
		System.out.println("Quantidade de Patas: "+getQtdPatas());
		System.out.println("Cor: "+getCor());
		System.out.println("Velocidade Média: "+getVelocidadeMedia());
	}
	
	public abstract void comer();
}