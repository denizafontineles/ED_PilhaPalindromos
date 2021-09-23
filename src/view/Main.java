package view;
import controller.PalindromoController;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		PalindromoController palindromo = new PalindromoController();

		String entrada = null;
		do {
			entrada = JOptionPane.showInputDialog(null, "Insira uma palavra para verificar se é um palíndromo");
		} while (entrada.isBlank());
		
		if (palindromo.comparaPalavras(entrada)) {
			JOptionPane.showMessageDialog(null, "\"" + entrada + "\" é um palindromo");
		}

		else {
			JOptionPane.showMessageDialog(null, "\"" + entrada + "\" não é um palindromo");
		}
	}
}
