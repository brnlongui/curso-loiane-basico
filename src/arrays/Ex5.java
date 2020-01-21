package arrays;

import java.util.Scanner;

public class Ex5 {
	public static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int[]vetorA = new int[5];
		int[]vetorB = new int[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite "+(i+1)+"º valor do vetor A: ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i]*i;
		}
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Multiplicador:"+i+" Valor digitado:"+vetorA[i]+" Resultado:"+vetorB[i]);

		}
	}

}
