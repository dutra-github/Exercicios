package loopsfor;

/**
 * @author Gregol
 * Escreva um programa que mostre na tela o desenho abaixo:  $$$$$ 
 * $$$$ 
 * $$$ 
 * $$ 
 * $
 */

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.println("Fim do programa!");
	}
}