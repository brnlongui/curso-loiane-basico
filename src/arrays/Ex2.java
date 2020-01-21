package arrays;

import java.util.Scanner;

public class Ex2 {
	private static Scanner scan;
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite "+(i+1)+"º valor do vetor A: ");
			vetorA[i]= scan.nextInt();
			vetorB[i] = vetorA[i]*2;
		}
		for(int i=0;i<vetorA.length;i++) {
			System.out.print("Vetor A: "+vetorA[i]+" ");
			System.out.print("Vetor B: "+vetorB[i]+" ");
		}
	}

}
