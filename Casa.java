package br.com.aula.herancas.imovel;

public class Casa extends Imovel {
	private double adicional = 150000;

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	public void imprimeDadosCasa() {
		System.out.println("*****Tipo de Im�vel CASA******");
		System.out.println("Rua Frei Estanislau Shaethe, 61 - Vila Nova - Blumenau/SC");
		System.out.println("Pre�o Total do Im�vel R$ "+ (getPreco()+getAdicional()));
		
	}

}
