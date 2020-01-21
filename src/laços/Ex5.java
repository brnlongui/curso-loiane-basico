package laços;

import java.util.Scanner;

public class Ex5 {
	private static Scanner scan;
	public static void main(String[] args) {
		int popA, popB, cont = 0;
		double taxaA, taxaB;
		boolean flag = false;
		scan = new Scanner(System.in);
		do {
			System.out.println("Digite a primeira população: ");
			popA = scan.nextInt();
			if(popA < 0) {
				System.out.println("invalido digite novamente");
			}else
				flag = true;			
		}while(!flag);
		
		flag = false;
		do {
			System.out.println("Digite a taxa de crescimento desta população: ");
			taxaA = scan.nextDouble();
			if(taxaA < 0) {
				System.out.println("invalido digite novamente");
			}else
				flag = true;
			
		}while(!flag);
		
		flag = false;
		do {
			System.out.println("Digite a segunda população: ");
			popB = scan.nextInt();
			if(popB < 0) {
				System.out.println("invalido digite novamente");
			}else
				flag = true;
		}while(!flag);
		
		flag = false;
		do {
			System.out.println("Digite a taxa de crescimento desta população: ");
			taxaB = scan.nextDouble();
			if(taxaB < 0) {
				System.out.println("invalido digite novamente");
			}else
				flag = true;
		}while(!flag);
		
		while(popA < popB) {
			popA += (popA/100)*3;
			popB +=(popB/100)*1.5;
			cont++;
		}
		System.out.println("Após "+cont+" anos, a população A aumentou para: "+popA+" e a B "
				+ "para: "+popB);

	}

}
