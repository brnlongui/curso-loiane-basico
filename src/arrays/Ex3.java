package arrays;

import java.util.Scanner;

public class Ex3 {
	private static Scanner scan;
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int []vetorA = new int[10];
		int []vetorB = new int[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite "+(i+1)+"º valor do vetor A: ");
			vetorA[i]= scan.nextInt();
			vetorB[i]= vetorA[i]*vetorA[i];
		}
		for(int i=0;i<vetorA.length;i++) {
			System.out.println(vetorA[i]+"*"+vetorA[i]+"="+vetorB[i]);
		}
		
	}

}
