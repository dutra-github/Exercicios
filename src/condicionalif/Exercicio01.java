package condicionalif;

import java.util.Scanner;

/**
 * @author Gregol
 *  Escreva um programa que solicite um número para o usuário e em
 *  seguida escreva uma mensagem informando se o número informado é
 *  múltiplo de 5. Para que um número seja múltiplo de 5, ele deve ser
 *  maior ou igual a 5 e o resto da divisão por 5 deve ser igual a zero.
 */

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Informe um número para verificar se é multiplo de 5:");
		int numero = s.nextInt();
		if (numero % 5 == 0) {
			System.out.println("o número " + numero + " é múltiplo de 5.");
		} else {
			System.out.println("o número " + numero + " não é múltiplo de 5.");
		}
		s.close();
		System.out.println("Fim do programa!");
	}
}
