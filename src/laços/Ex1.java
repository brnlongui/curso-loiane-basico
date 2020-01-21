package laços;

import java.util.Scanner;

public class Ex1 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		boolean valido = false;
		do{
			scan = new Scanner(System.in);
			System.out.println("Digite a nota: ");
			double nota = scan.nextDouble();
			if(nota >= 0 && nota <= 10) {
				valido = true;
				System.out.println("Você digitou a nota: "+nota);
			}else {
				System.out.println("Nota invalida digite novamente");
			}
		
		}while(!valido);
	}

}
