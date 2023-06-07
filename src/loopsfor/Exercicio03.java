package loopsfor;

/**
 * @author Gregol
 * Escreva um programa que mostre na tela o desenho abaixo
 *   X 
 *   XX 
 *   XXX 
 *   XXXX 
 *   XXXXX 
 */

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("X");
			}
			System.out.println();
		}
		System.out.println("Fim do programa!");
	}
}