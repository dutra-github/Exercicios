package conceitosbasicos;

import java.util.Random;
import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int sorteado = new Random().nextInt(5);
		System.out.println("Digite um n�mero entre 0 e 5");
		int numero = Integer.parseInt(teclado.nextLine());
		if (numero == sorteado) {
			System.out.println("Parab�ns, voc� acertou!");
			System.out.println("O n�mero sorteado era: " + sorteado);
		}
		System.out.println("Fim da aplica��o");
		teclado.close();
	}
}