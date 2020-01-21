package laços;

import java.util.Scanner;

public class Ex12 {
	private static Scanner scan;
	public static void main(String[] args) {
		int aux, base, potencia;
		scan = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		base = scan.nextInt();
		System.out.println("Digite a potência: ");
		potencia = scan.nextInt();
		aux = base;
		for(int i=1;i<potencia;i++) {
			aux *= base;
		}
		System.out.println(aux);
	}

}
