package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o tamanho array que deseja criar?");
		int tamanho = teclado.nextInt();
		
		int[] numeros = new int[tamanho];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o valor da posição ("+i+")");
			numeros[i] = teclado.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println();
		teclado.close();
		
		boolean[] retorno = retornaArrayBooleans(numeros);
		for (int i = 0; i < retorno.length; i++) {
			System.out.print(retorno[i]+" ");
		}
	}
	
	public static boolean[] retornaArrayBooleans(int[] numeros) {
		boolean[] boleanos = new boolean[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > 0) {
				boleanos[i] = true;
			}else {
				boleanos[i] = false;
			}
		}
		return boleanos;
	}
	

}
