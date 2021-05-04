package Reposicao1;

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
			for (int i = 0; i < aux - 1; i++) {
				auxi = auxi.getProximo();
			}
			if (aux == tamanho) {
				n.setProximo(null);
				n.setAnterior(auxi);
				auxi.setProximo(n);
				cauda = n;
			} else {
				if (aux == 0) {
					cabeca = auxi;
				}
				n.setAnterior(auxi);
				auxi.setProximo(n);
			}
		}
		tamanho++;
	}

	public int getSum(String nome) {
		No no = cabeca;
		Controle c = new Controle();
		boolean control = false;
		for (int i = 0; i < c.getSize(); i++) {
			int soma = 0;
			int soma2 = 0;
			for (int j = 0; j < nome.length() - 1; j++) {
				soma += nome.toUpperCase().charAt(j);
				soma2 += no.getNome().toUpperCase().charAt(j);
				if (soma2 > soma) {
					return i;
				} else if (soma > soma2) {
					control = true;
					break;
				}
			}

			if (control) {
				no = no.getProximo();
				continue;
			}
			if (soma == soma2) {
				return i;
			}
			no = no.getProximo();
		}
		return c.getSize();
	}

	public void exists(String nome, ListaDupla l) {
		No local = l.getCabeca();
		while (local != null) {
			if (local.getNome().toUpperCase().equals(nome.toUpperCase())) {
				System.out.println("Nome: " + nome + " existe");
				local = null;
			} else {
				if (local.getProximo() != null) {
					local = local.getProximo();
				} else {
					local = null;
					System.out.println("Nome: " + nome  + " não existe!");
				}
			}
		}
	}

	public String parseString() {
		String str = "";
		No local = cabeca;
		while (local != null) {
			str += local.getNome() + "\n";
			local = local.getProximo();
		}
		return str;
	}

	public No getCabeca() {
		return cabeca;
	}
	

}
