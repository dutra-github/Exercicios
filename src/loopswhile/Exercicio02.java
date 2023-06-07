package loopswhile;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa que solicite  dois números distintos para o  usuário,
 * e em seguida, escreva todos os número entre o intervalo dos números informados.
 */

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o primero número:");
		int num1 = s.nextInt();
		
		System.out.println("Informe o primero número:");
		int num2 = s.nextInt();
		
		while(num1 <= num2) {
			System.out.println(num1++);
		}
		s.close();
		System.out.println("Fim do programa!");
	}
}