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
			if(aux == 1) {
				auxi.setAnterior(n);
				n.setProximo(auxi);
				cabeca = n;
			} else if (aux == tamanho) {
				n.setProximo(null);
				n.setAnterior(auxi);
				auxi.setProximo(n);
				cauda = n;
			} else if (aux == 2) {
				auxi.setProximo(n);
				n.setAnterior(auxi);
				cabeca = auxi;
			}
			
			{
				if (aux == 0) {
					auxi.setProximo(n);
					n.setAnterior(auxi);
					cabeca = auxi;
				}
				//n.setProximo(auxi);
				//auxi.setAnterior(n);
			}
		}
		tamanho++;
	}

	public int getSum(String nome) {
		No no = cabeca;
		Controle c = new Controle();
			int soma = 0;
			int soma2 = 0;
			for (int j = 0; j < nome.length() - 1; j++) {
				soma += nome.toUpperCase().charAt(j);
				soma2 += no.getNome().toUpperCase().charAt(j);
				if (soma2 > soma) {
					return 1;
				} else if (soma > soma2) {
					return 2;
				}
			}
			if (soma == soma2) {
				return 0;
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
		No local = new No();
		if(cabeca != null) {
			local = cabeca;
			if(local.getAnterior() != null) {
				local = local.getAnterior();
				str += local.getNome() + "\n";
				local.setAnterior(null);
				local = local.getProximo();
			} while (local != null) {
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
