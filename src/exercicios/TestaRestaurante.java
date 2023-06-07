package exercicios;

public class TestaRestaurante {
	
	public static void main(String[] args) {
		
		Restaurante rest = new Restaurante();
		rest.setNome("Café Berlin");
		rest.setEndereco("Rua XV de Novembro, 320");
		rest.setCidade("Blumenau");
		rest.setEstado("SC");
		rest.setCep("89000-000");
		rest.setFone("47 3232-5847");
		rest.setTipoComida("Típica Alemã");
		rest.setPrecoMedio(12.90);
		
		System.out.println(rest.getNome());
	}

}
