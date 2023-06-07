package condicionalif;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa que solicite a nota de um aluno e em seguida escreva
 * a mensagem “Aprovado” caso a nota seja igual ou maior que 6, senão escreva
 * a mensagem “Reprovado”. 
 */

public class Exercicio04 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Informe a nota do aluno:");
		double nota = s.nextDouble();
		if (nota >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		s.close();
		System.out.println("Fim do programa!");
	}
}