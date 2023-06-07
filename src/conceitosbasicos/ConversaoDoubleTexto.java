package conceitosbasicos;

import java.util.Scanner;

public class ConversaoDoubleTexto {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número fracionado:");
		double numero = teclado.nextDouble();

		// convertendo um double para String
		String numeroParaTexto = Double.toString(numero);
		System.out.println("Esse número foi convertido para texto: " + numeroParaTexto);
		teclado.close();
	}

}
