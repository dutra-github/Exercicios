package conceitosbasicos;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = teclado.nextLine();

		System.out.println("O nome digitado foi: " + nome);
		teclado.close();
	}

}
