package Reposicao1;

import javax.swing.JOptionPane;

public class ListaDupla {
	private No cabeca;
	private No cauda;
	private int tamanho;

	public void add(String nome) {
		No n = new No();
		n.setNome(nome);

		if (cabeca == null) {
			cabeca = n;
			cauda = n;
		} else {
			No auxi = cabeca;
			int aux = getSum(nome);
			if (aux == 0) {
				n.setProximo(auxi);
				auxi.setAnterior(n);
				cabeca = n;
			} else {
				for (int i = 0; i < aux; i++) {
					if(auxi.getProximo() != null) {
						auxi = auxi.getProximo();
					} 
				}
				if (aux >= tamanho) {
					auxi.setProximo(n);
					n.setAnterior(auxi);
					cauda = n;
				} else {
					if(auxi.getAnterior() != null) {
						auxi.getAnterior().setProximo(n);
					}
					n.setAnterior(auxi.getAnterior());
					n.setProximo(auxi);
					auxi.setAnterior(n);
				}
			}
			
		}
		tamanho++;
		JOptionPane.showMessageDialog(null, "Nome " + nome + " adicionado com sucesso!");
	}
	
	public void rename(String nome, String n) {
		No local = cabeca;
		while (local != null) {
			if(local.getNome().equalsIgnoreCase(nome.toUpperCase())) {
			delete(nome);
			add(n);
			break;
			} else {
				local = local.getProximo();
			}
		}
	}
	
	public void delete(String nome) {
		No local = cabeca;
		while (local != null) {
			if(local.getNome().equalsIgnoreCase(nome)) {
				if(local.getAnterior() == null) {
					cabeca = local.getProximo();
					tamanho--;
					JOptionPane.showMessageDialog(null, "Nome " + nome + " excluído com sucesso!");
					break;
				} else {
					local.getAnterior().setProximo(local.getProximo());
					local.getProximo().setAnterior(local.getAnterior());
					tamanho--;
					JOptionPane.showMessageDialog(null, "Nome " + nome + " excluído com sucesso!");
					break;
				}
			} else {
				local = local.getProximo();
			}
		}
	}

	public int getSum(String nome) {
		No no = cabeca;
		for (int i = 0; i <= tamanho; i++) {
			int soma = 0;
			int soma2 = 0;
			for (int j = 0; j < nome.length(); j++) {
				try {
					soma += nome.toUpperCase().charAt(j);
					soma2 += no.getNome().toUpperCase().charAt(j);
					if (soma2 > soma) {
						return i;
					} else if (soma > soma2) {
						if(no.getProximo() != null) {
							no = no.getProximo();
							soma = 0;
							soma2 = 0;
							j = 0;
							i++;
						} else {
							i++;
							return i;
						}
					}
				} catch (Exception e) {
					if(soma == soma2 || soma > soma2) {
						i++;
						return i;
					} else {
						return i;
					} 
				}
				
			}
			if (soma == soma2) {
				return i;
			}
		}
		

		return tamanho;
	}

	public void exists(String nome) {
		if (cabeca != null) {
		No local = cabeca;
		while (local != null) {
			if (local.getNome().toUpperCase().equals(nome.toUpperCase())) {
				local = null;
				JOptionPane.showMessageDialog(null, "Esse nome existe!");
			} else if (local.getProximo() != null) {
					local = local.getProximo();
				} else {
					JOptionPane.showMessageDialog(null, "Esse nome não existe!");
					local = null;
				} 	
				}
			} else {
				JOptionPane.showMessageDialog(null, "Esse nome não existe!");
			}
		}

	public String parseString() {
		String str = "";
		No local = new No();
		if (cabeca != null) {
			local = cabeca;
			while (local != null) {
				str += local.getNome() + "\n";
				local = local.getProximo();
			}
			return str;
		} else {
			return str;
		}
	}

	public void getTamanho() {
		JOptionPane.showMessageDialog(null, "Tamanho da lista: " + tamanho);
	}

}
