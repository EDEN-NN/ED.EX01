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
				//	if(auxi.getProximo() != null) {
					//	auxi.getProximo().setProximo(n);
				//	}
					n.setAnterior(auxi.getAnterior());
					n.setProximo(auxi);
					auxi.setAnterior(n);
				}
			}
			
		}
		tamanho++;
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
					if(soma == soma2) {
						return i;
					} else {
						return ++i;
					} 
				}
				
			}
			if (soma == soma2) {
				return i;
			}
		}
		

		return tamanho;
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
					System.out.println("Nome: " + nome + " não existe!");
				}
			}
		}
	}

	public String parseString() {
		String str = "";
		No local = new No();
		if (cabeca != null) {
			local = cabeca;
			if (local.getAnterior() != null) {
				local = local.getAnterior();
				str += local.getNome() + "\n";
				local.setAnterior(null);
				local = local.getProximo();
			}
			while (local != null) {
				str += local.getNome() + "\n";
				local = local.getProximo();
			}
			return str;
		} else {
			return str;
		}
	}

	public No getCabeca() {
		return cabeca;
	}

}
