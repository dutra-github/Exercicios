package exercicios;

public class Cachorro extends Animal implements IAnimal {

	public Cachorro(String nome, float comprimento, int qtdPatas, String cor, String ambiente, float velocidadeMedia) {
		super(nome, comprimento, qtdPatas, cor, ambiente, velocidadeMedia);
	}

	@Override
	public void comer() {
		System.out.println("Comendo como cachorro");
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

}
