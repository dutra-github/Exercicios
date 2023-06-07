package exercicios;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o tamanho array que deseja criar?");
		int tamanho = teclado.nextInt();

		int[] numeros = new int[tamanho];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o valor da posição (" + i + ")");
			numeros[i] = teclado.nextInt();
		}
		teclado.close();
		
		int[] novo = retornaNovoArray(numeros);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(novo[i]+" ");
		}
	}
	
	public static int[] retornaNovoArray(int[] numeros) {
		int[] novo = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				novo[i] = 1;
			}else {
				novo[i] = -1;
			}
		}
		return novo;
	}


}
