package loopswhile;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa que solicite um número ao usuário e em seguida escreva
 * o valor do número informado multiplicado por 5. O programa deve continuar
 * solicitando novos números até que o usuário digite um número negativo. 
 */

public class Exercicio04 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int numero = 0;

		while (numero > -1) {
			System.out.println("Informe um número:");
			numero = s.nextInt();
			if (numero > -1) {
				System.out.println("A multiplicação é: 5 x " + numero + " = " + (numero * 5));
			}
		}
		s.close();
		System.out.println("Fim do programa!");
	}
}