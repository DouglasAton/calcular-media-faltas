package entities;

import javax.swing.JOptionPane;

public class NotaAluno {

	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	private double media;
	private String situacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public void calcularMedia() {
		this.nome = (JOptionPane.showInputDialog("Digite o nome do aluno: "));
		this.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
		this.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno: "));
		
		setMedia(getNota1() + getNota2() /2);
		

		JOptionPane.showMessageDialog(null, "A nota de " + getNome() + " é: " + getMedia());
	}

	public void situacaoAluno() {
		if (getMedia() >= 7) {
			setSituacao("APROVADO");
			JOptionPane.showMessageDialog(null, "O aluno está " + getSituacao());
		} 
		else {
			setSituacao("REPROVADO");
			JOptionPane.showMessageDialog(null, "O aluno está " + getSituacao());
		}
	}
}
