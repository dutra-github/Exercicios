package conceitosbasicos;

public class PrincipaisMetodosString {

	public static void main(String[] args) {

		String curso = "Java Fundamentos";

		// Retorna o caractere conforme o índice especificado
		int indice = 6;
		System.out.println(curso.charAt(indice));

		// Retorna um inteiro representando a quantidade de caracteres da String
		System.out.println(curso.length());

		// Retorna o índice onde se inicia o valor informado dentro da String. Caso a
		// String não possua o valor informado o método indexOf iŕa retornar o valor -1
		System.out.println(curso.indexOf("Fundamentos"));
		System.out.println(curso.indexOf("Avançado"));

		// Retorna uma nova String contendo o conteúdo da String atual juntamente com o
		// texto informado no parâmetro valor
		curso = "Java ";
		System.out.println(curso.concat("Fundamentos"));

		// Retorna uma nova String com o resultado da substituição de todos os
		// caracteres iguais ao caracter definido na variável antigo pelo caractere
		// definido na variável novo
		String nome = "Java";
		System.out.println(nome.replace('a', 'i'));

		// Retorna uma nova String com o resultado da substituição de todos os textos
		// iguais ao texto definido na variável antigo pelo texto definido na variável
		// novo
		String mensagem = "la la la le le le";
		System.out.println(mensagem.replaceAll("la", "ra"));

		// Retorna um valor booleano indicando se o texto informado através da variável
		// valor corresponde ao texto no início da String
		mensagem = "Java nota 10";
		System.out.println(mensagem.startsWith("Java"));

		// Retorna um valor booleano indicando se o texto informado através da variável
		// valor corresponde ao texto no final da String
		System.out.println(mensagem.endsWith("1000"));

		// Retorna um valor booleano indicando se o texto informado através da variável
		// valor está contido na String
		System.out.println(mensagem.contains("nota"));

		// Retorna um valor booleano indicando se o Objeto informado através da variável
		// obj possui o texto equivalente ao texto da String
		System.out.println(mensagem.equals("java nota 10"));

		// Retorna um valor booleano indicando se o texto informado através da variável
		// valor possui o texto equivalente ao texto da String ignorando a diferença
		// entre letras maiúsculas e minúsculas
		System.out.println(mensagem.equalsIgnoreCase("java nota 10"));

		// Retorna o texto da String a partir do índice definido na variável inicio
		System.out.println(mensagem.substring(5));

		// Retorna o texto da String delimitado entre o índice definido na variável
		// inicio e o índice definido na variável fim
		System.out.println(mensagem.substring(0, 5));

		// Retorna uma nova String removendo os espaços em branco do início e do final
		// da String original
		mensagem = "      espaços       ";
		System.out.println(mensagem.trim());

		// Retorna um array de Strings contendo os valores da String original separados
		// pelo delimitador informado
		String linha = "João da Silva;joao@teste.com.br;33221100";
		String[] dados = linha.split(";");
		System.out.println(dados[0]);
		System.out.println(dados[1]);
		System.out.println(dados[2]);

		// Retorna uma String convertendo todo o texto em Maiúsculas
		System.out.println(curso.toUpperCase());

		// Retorna uma String convertendo todo o texto em Maiúsculas
		System.out.println(curso.toLowerCase());
	}
}
