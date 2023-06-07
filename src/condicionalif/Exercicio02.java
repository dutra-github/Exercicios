package condicionalif;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa que leia um número informado pelo usuário
 * e em seguida escreva uma mensagem indicando se o número é par ou impar.
 * (Considere número par o número cujo resto da divisão por 2 seja igual a Zero) 
 */

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Informe um número para verificar se é PAR ou ÍMPAR");
		int numero = s.nextInt();
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é PAR.");
		} else {
			System.out.println("O número " + numero + " é ÍMPAR.");
		}
		s.close();
		System.out.println("Fim do programa!");
	}
}