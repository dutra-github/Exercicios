package exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do array deseja criar?");
		int tamanho = teclado.nextInt();
		
		int[] numeros = new int[tamanho];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o valor para a posição ("+i+")");
			numeros[i] = teclado.nextInt();
		}
		
		teclado.close();
		
		System.out.println("O array possui "+retornaQtdNumerosNegativos(numeros)+" números negativos");
		
	}
	
	public static int retornaQtdNumerosNegativos(int[] numeros) {
		int qtdNegativos = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] < 0) {
				qtdNegativos++;
			}
		}
		return qtdNegativos;
	}

}
