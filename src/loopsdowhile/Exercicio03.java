package loopsdowhile;

/**
 * @author Gregol
 * Escreva todos os números pares entre o número 101 e o número 200. 
 */

public class Exercicio03 {
	
	public static void main(String[] args) {

		int x = 101;

		do {
			if (x % 2 == 0) {
				System.out.println(x);
			}
			x++;
		} while (x <= 200);
	}
}