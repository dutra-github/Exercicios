package condicionalif;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa  que solicite as 3 notas de um aluno e em seguida calcule
 * o valor da média das notas. Caso a média seja maior ou igual a 9 escreva a mensagem
 * “Conceito A”, caso a nota seja menor que 9 e maior ou igual a 7 escreva a mensagem
 * “Conceito B”, caso a nota seja menor que 7 e maior ou igual a 5 escreva a mensagem
 * “Conceito C”, se a nota for menor que 5 escreva a mensagem “Conceito Insuficiente”. 
 */

public class Exercicio05 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Informe a primeira nota:");
		double nota1 = s.nextDouble();
		System.out.println("Informe a segunda nota:");
		double nota2 = s.nextDouble();
		System.out.println("Informe a terceira nota:");
		double nota3 = s.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 9) {
			System.out.println("Conceito A");
		} else if (media >= 7) {
			System.out.println("Conceito B");
		} else if (media >= 5) {
			System.out.println("Conceito C");
		} else {
			System.out.println("Conceito Insuficiente");
		}
		s.close();
		System.out.println("Fim do programa!");
	}
}