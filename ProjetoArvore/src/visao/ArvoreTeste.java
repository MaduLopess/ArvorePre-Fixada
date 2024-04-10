package visao;

import javax.swing.JOptionPane;

import modelagem.Numero;
import negocio.Arvore;

public class ArvoreTeste {

	public static void main(String[] args) {
	Arvore a = new Arvore ();
	 
	Numero n1 = new Numero();
	Numero n2 = new Numero();
	Numero n3 = new Numero();
	Numero n4 = new Numero();
	Numero n5 = new Numero();
	Numero n6 = new Numero();
	Numero n7 = new Numero();
	Numero n8 = new Numero();
	Numero n9 = new Numero();
	
	n1.setDado(45);
	n2.setDado(42);
	n3.setDado(43);
	n4.setDado(40);
	n5.setDado(44);
	n6.setDado(46);
	n7.setDado(38);
	n8.setDado(47);
	n9.setDado(39);
	
	a.adicionar(n1);
	a.adicionar(n2);
	a.adicionar(n3);
	a.adicionar(n4);
	a.adicionar(n5);
	a.adicionar(n6);
	a.adicionar(n7);
	a.adicionar(n8);
	a.adicionar(n9);
	
	JOptionPane.showMessageDialog(null, "Pré-ordem");
	a.exibirPre(a);
	}

}
