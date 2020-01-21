package laços;

import java.util.Scanner;

public class Ex10 {
	private static Scanner scan;
	public static void main(String[] args) {
		int num1, num2;
		scan = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = scan.nextInt();
		if(num1< num2) {
			while(num1<=num2) {
				System.out.println(num1++);
			}
		}else {
			while(num1>=num2) {
				System.out.println(num1--);
			}
		}

	}

}
