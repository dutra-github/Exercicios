package exercicios;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		String palavra = "socorram me em marrocos";
		
		String novaPalavra = palavra;// .toUpperCase();
		
		int qtdLetras = novaPalavra.length();
		
		String palavraContraria = "";
		for (int i = (qtdLetras-1); i >= 0; i--) {
			palavraContraria += novaPalavra.charAt(i);
		}
		System.out.println(palavraContraria);
		
		if(palavra.equalsIgnoreCase(palavraContraria)) {
			System.out.println(palavra +" é um palíndromo");
		}else {
			System.out.println(palavra +" não é um palíndromo");
		}
	}

}
