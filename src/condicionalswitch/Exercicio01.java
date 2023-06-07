package condicionalswitch;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa que apresente uma lista com as opções ‘1 - Sacar’,
 * ‘2 - Depositar’, ‘3 - verificar saldo’. Em seguida solicite que o usuário
 * informe um número entre 1 e 3. Caso o usuário tenha informado o número 1 
 * apresente a mensagem “você escolheu a opção sacar”, caso o usuário tenha 
 * informado o número 2 apresente a mensagem “você escolheu a opção depositar”,
 * caso o usuário tenha informado o número 3, apresente a mensagem ‘você escolheu
 * a opção verificar saldo’. Caso o usuário tenha informado um número fora do 
 * range(1,2,3) apresente a mensagem ‘Opção inválida’.
 */

public class Exercicio01 {
	
	public static void main(String[] args) {

		System.out.println("|---------------------|");
		System.out.println("| 1 - Sacar           |");
		System.out.println("| 2 - Depositar       |");
		System.out.println("| 3 - Verificar Saldo |");
		System.out.println("|---------------------|\n");

		System.out.println("Digite uma opção entre 1 e 3:");

		Scanner teclado = new Scanner(System.in);
		String opcao = teclado.nextLine();

		switch (opcao) {
		case "1":
			System.out.println("Você escolheu a opção Sacar");
			break;
		case "2":
			System.out.println("Você escolheu a opção Depositar");
			break;
		case "3":
			System.out.println("Você escolheu a opção Verificar Saldo");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
		teclado.close();
		System.out.println("Fim do programa!");
	}
}