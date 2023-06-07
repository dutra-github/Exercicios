package exercicios;

public class Restaurante extends Empresa {
	
	private String tipoComida;
	
	private double precoMedio;
	
	public Restaurante() {
		
	}

	public Restaurante(String tipoComida, double precoMedio) {
		super();
		this.tipoComida = tipoComida;
		this.precoMedio = precoMedio;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public double getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(double precoMedio) {
		this.precoMedio = precoMedio;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Tipo de Comida: "+ getTipoComida());
		System.out.println("Preço Médio: "+ getPrecoMedio());
	}
	
	public void imprimirDadosExetoCidade() {
		System.out.println("Nome: "+getNome());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("Estado: "+getEstado());
		System.out.println("CEP: "+getCep());
		System.out.println("Fone: "+getFone());
		System.out.println("Tipo de Comida: "+ getTipoComida());
		System.out.println("Preço Médio: "+ getPrecoMedio());
	}
	
	
}
