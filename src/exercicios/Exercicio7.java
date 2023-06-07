package exercicios;

public class Exercicio7 {

	public static void main(String[] args) {

		int[][] a = new int[3][10];

		for (int linha = 0; linha < a.length; linha++) {
			for (int coluna = 0; coluna < a[linha].length; coluna++) {
				a[linha][coluna] = coluna;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		int[][] b = new int[5][10];

		for (int linha = 0; linha < b.length; linha++) {
			for (int coluna = 0; coluna < b[linha].length; coluna++) {
				b[linha][coluna] = coluna * coluna;
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		int[][] c = new int[6][6];

		for (int linha = 0; linha < c.length; linha++) {
			for (int coluna = 0; coluna < c[linha].length; coluna++) {
				c[linha][coluna] = linha;
			}
		}

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		int[][] d = new int[9][6];

		for (int linha = 0; linha < d.length; linha++) {
			for (int coluna = 0; coluna < d[linha].length; coluna++) {
				if(linha % 2 == 0) {
					d[linha][coluna] = -1;
				}else {
					d[linha][coluna] = 0;
				}
			}
		}

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}

}
