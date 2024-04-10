package negocio;

import java.util.Arrays;

import javax.swing.JOptionPane;

import modelagem.Numero;

public class Arvore {
	private Numero num = null;
	private Arvore direita = null;
	private Arvore esquerda = null;
	private Numero[] subArvores = new Numero[9];
	private int contador = 0;

	public void adicionar(Numero n) {
		if (num == null) {
			num = n;
			subArvores[contador] = n;
			contador++;
		} else if (n.getDado() < num.getDado()) {
			if (esquerda == null) {
				esquerda = new Arvore();
			}
			esquerda.adicionar(n);
			subArvores[contador] = n;
			contador++;
		} else if (n.getDado() > num.getDado()) {
			if (direita == null) {
				direita = new Arvore();
			}
			direita.adicionar(n);
			subArvores[contador] = n;
			contador++;
		}
	}

	public void exibirPre(Arvore arv) {
		if (arv != null) {
			for (int i = 0; i < subArvores.length; i++) {
				JOptionPane.showMessageDialog(null, subArvores[i]);
			}
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(subArvores);
	}
}
