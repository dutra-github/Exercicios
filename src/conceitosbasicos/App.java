package conceitosbasicos;

public class App {

	public static void main(String[] args) {

		// Chamada do método "calcularDesconto" da classe Util
		int valor = 120;
		int percentual = 30;
		double desconto = Util.calcularDesconto(valor, percentual);
		System.out.println(desconto);

		// Chamada do método "escreverMensagem" da classe Util
		String nome = "João";
		String nomeCompleto = nome.concat("Silva");
		Util.escreverMensagem(nomeCompleto);

	}
}