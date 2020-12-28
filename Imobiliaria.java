package br.com.aula.herancas.imovel;

import javax.swing.JOptionPane;

public class Imobiliaria {

	public static void main(String[] args) {
		
		int tipoImovel = Integer.parseInt(JOptionPane.showInputDialog("Selecione o Tipo de Imóvel:\n 1 - Casa \n 2 - Apartamento"));
		switch (tipoImovel) {
		case 1:
			Casa c1 = new Casa();
			c1.imprimeDadosCasa();
			break;
		case 2:
			Apartamento a1 = new Apartamento();
			a1.imprimeDadosApto();
		break;
		}

	}

}
