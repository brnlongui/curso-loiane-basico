package laços;

import java.util.Scanner;

public class Ex8 {
	private static Scanner scan;
	public static void main(String[] args) {
		
		double num= 0, media = 0;
		scan = new Scanner(System.in);
		for(int i = 0; i<5; i++) {
			System.out.println("Digite o numero: ");
			num += scan.nextDouble();
			media++;
		}
		System.out.println("a soma é: "+num+" e a média é: "+num/media);
	}

}
