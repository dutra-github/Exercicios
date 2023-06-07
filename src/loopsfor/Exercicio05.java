package loopsfor;

/**
 * @author Gregol
 * Escreva um programa que calcule e escreva o resultado da soma dos números entre 1 e 50. 
 */

public class Exercicio05 {

	public static void main(String[] args) {
		int resultado = 1;
		for (int i = 2; i <= 50; i++) {
			resultado = i + resultado;
			System.out.println("A soma de " + (resultado - i) + " + " + i + " é: " + resultado);
		}
	}
}