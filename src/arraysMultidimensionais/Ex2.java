package arraysMultidimensionais;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		int[][] numerosAleatorios = new int[10][10];
		int maiorLinha = Integer.MIN_VALUE, menorLinha = Integer.MAX_VALUE, maiorColuna = Integer.MIN_VALUE,
				menorColuna = Integer.MAX_VALUE;

		Random numeroRandom = new Random();
		// preenchimento do array
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(10);
			}
		}
		// encontrando os maiores e menores valores da linha 5
		for (int i = 0; i < numerosAleatorios[5].length; i++) {
			if (numerosAleatorios[5][i] > maiorLinha) {
				maiorLinha = numerosAleatorios[5][i];
			}
			if (numerosAleatorios[5][i] < menorLinha) {
				menorLinha = numerosAleatorios[5][i];
			}
		}
		// econtrando os maiores e menores valores da coluna 7
		for (int i = 0; i < numerosAleatorios.length; i++) {
			if (numerosAleatorios[i][7] > maiorColuna) {
				maiorColuna = numerosAleatorios[i][7];
			}
			if (numerosAleatorios[i][7] < menorColuna) {
				menorColuna = numerosAleatorios[i][7];
			}
		}

		// exibindo respostas
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("maior numero da 5 linha: " + maiorLinha);
		System.out.println("menor numero da 5 linha: " + menorLinha);
		System.out.println("maior numero da 7 coluna: " + maiorColuna);
		System.out.println("menor numero da 7 coluna: " + menorColuna);

	}

}
