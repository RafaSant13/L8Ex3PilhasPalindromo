package view;

import javax.swing.JOptionPane;

import controller.PalindromoControle;

public class Principal {

	public static void main(String[] args) throws Exception {
		PalindromoControle pc = new PalindromoControle();
		String palavra = JOptionPane.showInputDialog("Insira a palavra: ");
		
		if (pc.comparaPalavras(palavra)) {
			System.out.println(palavra + " � um pal�ndromo.");
		}
		else {
			System.out.println(palavra + " n�o � um pal�ndromo.");
		}

	}

}
