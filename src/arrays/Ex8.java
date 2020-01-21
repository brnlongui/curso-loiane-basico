package arrays;

import java.util.Scanner;

public class Ex8 {
	public static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int[]vetorA = new int[5];
		int[]vetorB = new int[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor: ");
			vetorA[i]= scan.nextInt();
			vetorB[i]= vetorA[i]%2;
		}
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("O valor "+vetorA[i]+" %2 tem resultado: "+vetorB[i]);
			System.out.println();
		}
	}

}
