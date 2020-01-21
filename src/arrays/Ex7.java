package arrays;

import java.util.Scanner;

public class Ex7 {
	public static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int[]vetorA = new int[5];
		int[]vetorB = new int[vetorA.length];
		int[]vetorC = new int[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor: ");
			vetorA[i]= scan.nextInt();
			System.out.println("Digite o multiplicador: ");
			vetorB[i]= scan.nextInt();
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("O vetor A é: "+vetorA[i]+" O vetor B é: "+vetorB[i]+" E o resultado das multiplicações: "+vetorC[i]+" ");
		}

	}
}
