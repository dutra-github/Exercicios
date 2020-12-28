package br.com.aula.herancas.imovel;

public class Imovel {
	private String endereco;
	private double preco = 350000;
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void imprimeValor() {
		System.out.println(getPreco());
	}

}
