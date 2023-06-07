package Operadores;

/**
 * @author Gregol 
 *  Dado o código abaixo, complete-o escrevendo o resultado das
 *  seguintes operações: (x=true; y=true; z=false) a. x && x; b. x && y;
 *  c. y || z; d. y || x; e. !z; f. !z && x; g. z ^ x; h. x ^ y;
 */

public class Exercicio01 {

	public static void main(String[] args) {

		boolean x = true;
		boolean y = true;
		boolean z = false;

		System.out.println(x && y);
		System.out.println(y || z);
		System.out.println(y || x);
		System.out.println(!z);
		System.out.println(!z && x);
		System.out.println(z ^ x);
		System.out.println(x ^ y);

	}
}
