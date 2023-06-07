package loopsfor;

/**
 * @author Gregol
 * Escreva um programa que apresente todos os números ímpares entre 1 e 100.
 */

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("Fim do programa!");
	}
}