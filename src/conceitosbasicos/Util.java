package conceitosbasicos;

public class Util {

	public static double calcularDesconto(double valor, double percentual) {
		return valor - (valor * percentual / 100);
	}

	public static void escreverMensagem(String mensagem) {
		System.out.println(mensagem);
	}
}