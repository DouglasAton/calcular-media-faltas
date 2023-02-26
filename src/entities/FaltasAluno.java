package entities;

import javax.swing.JOptionPane;

public class FaltasAluno {

	private int quantFaltas;

	public int getQuantFaltas() {
		return quantFaltas;
	}

	public void setQuantFaltas(int quantFaltas) {
		this.quantFaltas = quantFaltas;
	}

	public void faltas() {
		this.quantFaltas = (Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas do aluno: ")));
	}

	public void situacaoFaltas() {
		if (getQuantFaltas() >= 15) {
			JOptionPane.showMessageDialog(null, "O aluno está REPROVADO POR FALTA!");
		} 
		else {
			JOptionPane.showMessageDialog(null, "O aluno está APROVADO POR FALTA!");

		}
	}
}
