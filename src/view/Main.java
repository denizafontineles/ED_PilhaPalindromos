package view;
import controller.PalindromoController;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		PalindromoController palindromo = new PalindromoController();

		String entrada = null;
		do {
			entrada = JOptionPane.showInputDialog(null, "Insira uma palavra para verificar se � um pal�ndromo");
		} while (entrada.isBlank());
		
		if (palindromo.comparaPalavras(entrada)) {
			JOptionPane.showMessageDialog(null, "\"" + entrada + "\" � um palindromo");
		}

		else {
			JOptionPane.showMessageDialog(null, "\"" + entrada + "\" n�o � um palindromo");
		}
	}
}
