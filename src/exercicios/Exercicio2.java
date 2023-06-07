package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double[] valores = new double[3];

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Informe um valor double: (" + i + ")");
			valores[i] = teclado.nextDouble();
		}
		teclado.close();

		imprimeValoresDoArray(valores);
	}

	public static void imprimeValoresDoArray(double[] valores) {
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
	}

}
