package arrays;

import java.util.Scanner;

public class Ex4 {
	public static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		double[] vetorA = new double[4];
		double[] vetorB = new double[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite "+(i+1)+"º valor do vetor A: ");
			vetorA[i]= scan.nextInt();
			vetorB[i]=Math.sqrt(vetorA[i]);
		}
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("raiz quadrada de: "+vetorA[i]+" é: "+vetorB[i]);

		}
		

	}

}
