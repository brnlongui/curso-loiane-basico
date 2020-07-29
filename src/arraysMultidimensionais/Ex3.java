package arraysMultidimensionais;

import java.util.Scanner;

public class Ex3 {
	
	private static Scanner scan;
	public static void main(String[] args) {
	
		scan = new Scanner(System.in);
		int [][] M = new int [3][3];
		int par = 0, impar = 0;
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M.length; j++) {
				System.out.println("Digite o elemento da linha "+(i+1)+" da coluna "+(j+1));
				M[i][j] = scan.nextInt();
				if(M[i][j] % 2 == 0) {
					par++;
				}else {
					impar++;
				}
			}
		}
		System.out.println();
		
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M.length; j++) {
				System.out.print(M[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("a quantidade de pares: "+par);
		System.out.println("A quantidade de impares: "+impar);

	}

}
