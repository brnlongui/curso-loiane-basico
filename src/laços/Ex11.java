package laços;

import java.util.Scanner;

public class Ex11 {
	public static Scanner scan;
	public static void main(String[] args) {
		int num;
		scan = new Scanner(System.in);
		System.out.println("digite o multiplicador: ");
		num = scan.nextInt();
		System.out.println("Tabuada de "+num+":");
		for(int i=1;i<=10;i++) {
			System.out.println(num+" X "+i+" = "+num*i);
		}

	}

}
