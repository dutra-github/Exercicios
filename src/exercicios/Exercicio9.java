package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase que eu conto as vogais");
		String frase = teclado.nextLine();

		String[] letras = frase.split("");

		int qtdVogais = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (letras[i].equalsIgnoreCase("a") || letras[i].equalsIgnoreCase("e") || letras[i].equalsIgnoreCase("i")
					|| letras[i].equalsIgnoreCase("o") || letras[i].equalsIgnoreCase("u")) {
				qtdVogais++;
			}
		}
		System.out.println("A frase possui " + qtdVogais + " vogais");
		teclado.close();
	}
}