package controller;

import com.deniza.utils.pilha.string.Pilha;


public class PalindromoController {
	
	public PalindromoController() {
		super();
	}
	
	public boolean comparaPalavras(String palavra) {
		
		
		palavra = palavra.toLowerCase();
		palavra = palavra.replaceAll("\\s+", "");
		
		String palavraInvertida = inverterString(palavra);
		
		if (palavraInvertida.equals(palavra)) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	private String inverterString (String stringOriginal) {
		
		Pilha stack = new Pilha();
		String stringInvertida = "";

		for (int tamanho = 0 ; tamanho != stringOriginal.length() ; tamanho++) {
			char charAtual = stringOriginal.charAt(tamanho);
			stack.push(Character.toString(charAtual));
		}

		while (!stack.isEmpty()) {
			try {
				stringInvertida += stack.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return stringInvertida;
		
	}

}
