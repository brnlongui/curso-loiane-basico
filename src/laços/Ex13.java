package laços;

import java.util.Scanner;

public class Ex13 {
	private static Scanner scan;
	public static void main(String[] args) {
		int aux, qtdPar=0, qtdImp=0;
		scan = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("Digite o numero: ");
			aux = scan.nextInt();
			if(aux%2==0) {
				qtdPar++;
			}else
				qtdImp++;
		}
		System.out.println("A quantidade de numeros pares é: "+qtdPar+" e de ímpares são: "+qtdImp);

	}

}
