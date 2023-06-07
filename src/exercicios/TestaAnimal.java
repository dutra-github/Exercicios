package exercicios;

public class TestaAnimal {
	
	public static void main(String[] args) {
		
		Mamifero camelo = new Mamifero("Camelo", 150f, 4, "Amarelo", "Terra", 2.0f, "Frutas");
		System.out.println("*** Dados do "+camelo.getNome()+" ***");
		camelo.dadosMamifero();
		
		System.out.println();
		
		Peixe tubarao = new Peixe("Tubarão", 300f, 0, "Cinzento", "Mar", 1.5f, "Barbatana e cauda");
		System.out.println("*** Dados do "+tubarao.getNome()+" ***");
		tubarao.dadosPeixe();
		
		System.out.println();
		
		Mamifero ursoCanada = new Mamifero("Urso-do-Canadá", 180f, 4, "Vermelho", "Terra", 0.5f, "Mel");
		System.out.println("*** Dados do "+ursoCanada.getNome()+" ***");
		ursoCanada.dadosMamifero();
		
	}
}
