package aplication;

import entities.FaltasAluno;
import entities.NotaAluno;

public class CalcularMedia {

	public static void main(String[] args) {

		int i = 1;

		NotaAluno n = new NotaAluno();
		FaltasAluno f = new FaltasAluno();

		do {
			n.calcularMedia();
			n.situacaoAluno();
			f.faltas();
			f.situacaoFaltas();
			i++;
		} while (i <= 1);

	}
}
