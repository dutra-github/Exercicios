package loopswhile;

/**
 * @author Gregol
 * Escreva todos os números impares entre o número 101 e o número 200. 
 */

public class Exercicio03 {
	
	public static void main(String[] args) {

		int inicio = 101;
		int fim = 200;
		while (inicio <= fim) {
			if (inicio % 2 == 1) {
				System.out.println(inicio);
			}
			inicio++;
		}
		System.out.println("Fim do programa!");
	}
}