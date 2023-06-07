package conceitosbasicos;

import java.util.Scanner;

public class ConversaoIntTexto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		int numero = teclado.nextInt();

		// convertendo um int para String
		String numeroParaTexto = Integer.toString(numero);
		System.out.println("Esse número foi convertido para texto: " + numeroParaTexto);
		teclado.close();
	}
}