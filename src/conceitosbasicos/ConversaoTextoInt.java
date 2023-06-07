package conceitosbasicos;

import java.util.Scanner;

public class ConversaoTextoInt {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		int idade = Integer.parseInt(teclado.nextLine());
		int idadeMais20 = idade + 20;

		System.out.println("Sua idade daqui a 20 anos será: " + idadeMais20 +" anos");
		teclado.close();
	}
}