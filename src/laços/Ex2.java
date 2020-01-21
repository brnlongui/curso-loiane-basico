package laços;

import java.util.Scanner;

public class Ex2 {
	
	private static Scanner scan;
	public static void main(String[] args) {
		String nome, senha;
		boolean valido = false;
		
		scan = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		nome = scan.next();
		do {
			System.out.print("Digite a senha: ");
			senha = scan.next();
		
			if(senha.equalsIgnoreCase(nome)) {
				System.out.println("Senha invalida, tente novamente!");
			}else {
				valido = true;
				System.out.println("Senha e nome validos!");
			}
		}while(!valido);
		

	}

}
