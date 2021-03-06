package Reposicao1;

import javax.swing.JOptionPane;

public class Controle {
	ListaDupla vet[] = new ListaDupla[26];

	public Controle() {
		for (int i = 0; i < 26; i++) {
			vet[i] = new ListaDupla();
		}
	}

	public void add(String nome) {
		int i = indice(nome);
		vet[i].add(nome);
	}
	
	public void rename(String nome, String rename) {
		if(exists(nome)) {
			int index = indice(nome);
			ListaDupla l = vet[index];
			l.rename(nome, rename);
		}
	}
	
	public void delete(String nome) {
		if(exists(nome)) {
			int index = indice(nome);
			ListaDupla l = vet[index];
			l.delete(nome);
		}
	} 

	public void print() {

		String str = "";
		for (int i = 0; i < 26; i++) {
			str += vet[i].parseString();
		}
		JOptionPane.showMessageDialog(null, str);

	}

	public boolean exists(String nome) {
		int index = indice(nome);
		if (index != -1) {
			ListaDupla l = vet[index];
			l.exists(nome);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Esse nome n?o existe.");
			return false;
		}
	}
	
	public void getSize(String nome) {
		int index = indice(nome);
		if(index != -1) {
			ListaDupla l = vet[index];
			l.getTamanho();
		} else {
			JOptionPane.showMessageDialog(null, "Lista Inv?lida");
		}
		
	}

	public int indice(String nome) {
		String n = nome.toUpperCase();

		switch (n.charAt(0)) {
		case 'A':
			return 0;
		case 'B':
			return 1;
		case 'C':
			return 2;
		case 'D':
			return 3;
		case 'E':
			return 4;
		case 'F':
			return 5;
		case 'G':
			return 6;
		case 'H':
			return 7;
		case 'I':
			return 8;
		case 'J':
			return 9;
		case 'K':
			return 10;
		case 'L':
			return 11;
		case 'M':
			return 12;
		case 'N':
			return 13;
		case 'O':
			return 14;
		case 'P':
			return 15;
		case 'Q':
			return 16;
		case 'R':
			return 17;
		case 'S':
			return 18;
		case 'T':
			return 19;
		case 'U':
			return 20;
		case 'V':
			return 21;
		case 'W':
			return 22;
		case 'X':
			return 23;
		case 'Y':
			return 24;
		case 'Z':
			return 25;
		}
		return -1;
	}

}
