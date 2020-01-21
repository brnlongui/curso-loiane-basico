package laços;

import java.util.Scanner;

public class Ex7 {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		double num, maior = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o numero");
			num = scan.nextDouble();
			if(num > maior) {
				maior = num;
			}
		}
		System.out.println("O maior numero é: "+maior); 
		
	}

}
