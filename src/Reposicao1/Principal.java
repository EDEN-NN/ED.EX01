package Reposicao1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int opc = 99;
		Controle c = new Controle();
		while (opc != 0) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Nome \n" + "2 - Remover Nome  \n"
					+ "3 - Renomear \n" + "4 - Verificar se o nome existe \n" + "5 - Mostrar Lista Completa \n"
					+ "6 - Mostrar Tamanho da Lista \n"
					+ "0 - Sair"));
			switch (opc) {
			case 1:
				c.add(JOptionPane.showInputDialog("Digite o nome a ser adicionado!"));
				break;
			case 2:
				c.delete(JOptionPane.showInputDialog("Digite o nome a ser excluído"));
				break;
			case 3:
				c.rename(JOptionPane.showInputDialog("Digite o nome que deseja trocar"),
						JOptionPane.showInputDialog("Digite o nome que deseja inserir"));
				break;
			case 4:
				c.exists(JOptionPane.showInputDialog("Digite o nome que deseja verificar"));
				break;
			case 5:
				c.print();
				break;
			case 6 : 
				c.getSize(JOptionPane.showInputDialog(null, "Digite o nome para a lista desejada!"));
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Entrada Inválida! Digite novamente.");
			}
		}

	}
}
