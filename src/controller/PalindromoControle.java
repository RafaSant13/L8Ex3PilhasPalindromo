package controller;

import model.PilhaString;

public class PalindromoControle {

	public PalindromoControle() {
		super();
	}
	
	static PilhaString p = new PilhaString();
	
	public String invertePalavra (String palavra, int tamanho) throws Exception {
		if (p.size() == tamanho) {
			return p.pop();
		}
		else {
			p.push(palavra.substring(0, 1));
			String inverso = invertePalavra(palavra.substring(1), tamanho);
			if (!p.isEmpty()) {
				inverso = inverso+p.pop();
			}
			return inverso;
		}
	}
	
	public boolean comparaPalavras (String palavra) throws Exception {
		String inverso = invertePalavra(palavra, palavra.length());
		if (palavra.equals(inverso)) {
			return true;
		}
		else {
			return false;
		}
	}

}
