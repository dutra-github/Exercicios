package br.com.aula.herancas.imovel;



public class Apartamento extends Imovel {
	private double desconto = 50000;

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public void imprimeDadosApto() {
		System.out.println("*****Tipoo de Im�vel - APARTAMENTO");
		System.out.println("Rua Girassol, 394 - Velha Central - Blumenau/SC");
		System.out.println("Valor Total do Im�vel R$"+ (getPreco() - getDesconto()));
		
	}

}
