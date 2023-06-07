package condicionalswitch;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa que solicite o nome de um dos três países com mais títulos
 * da copa do mundo, em seguida escreva uma mensagem ao usuário informando se a
 * resposta está correta ou errada. Considere os três países com mais títulos como
 * sendo BRASIL, ITÁLIA E ALEMANHA. (Dica: tente utilizar um switch sem breaks). 
 */

public class Exercicio02 {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Infome um dos 3 países com mais títulos mundiais:");
		String opcao = teclado.nextLine();

		switch (opcao) {
		case "Brasil":
		case "Itália":
		case "Alemnaha":
			System.out.println("Resposta Correta!");
		default:
			System.out.println("Resposta Incorreta!");
		}
		teclado.close();
		System.out.println("Fim do programa!");
	}
}