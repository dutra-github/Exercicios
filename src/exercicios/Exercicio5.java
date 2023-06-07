package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o tamanho array que deseja criar?");
		int tamanho = teclado.nextInt();

		int[] numeros = new int[tamanho];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o valor da posi��o (" + i + ")");
			numeros[i] = teclado.nextInt();
		}
		teclado.close();
		
		System.out.println("O maior n�mero est� na posi��o: "+posicaoMaiorNumero(numeros));
		
	}
	
	public static int posicaoMaiorNumero(int[] numeros) {
		
		int maior = 0;
		int posicao = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
				posicao = i;
			}
		}
		return posicao;
	}

}
