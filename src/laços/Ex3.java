package laços;

import java.util.Scanner;

public class Ex3 {
	
	private static Scanner scan;
	public static void main(String[] args) {
		
		String nome;
		char sexo, estadoC;
		int idade;
		double salario;
		boolean valido = false;
		scan = new Scanner(System.in);
		
		do {
			System.out.println("Digite o nome: ");
			nome = scan.next();
			if(nome.length() > 3) {
				valido = true;
			}else 
				System.out.println("Informação invalida, digite novamente");
		}while(!valido);
		
		do {
			valido = false;
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();
			if(idade > 0 && idade < 150) {
				valido = true;
			}else 
				System.out.println("Informação invalida, digite novamente");					
		}while(!valido);
		
		do {		
			valido = false;
			System.out.println("Digite o sexo: ");
			sexo = scan.next().charAt(0);
			switch(sexo) {
			case 'f':
				valido = true;
				break;
			case 'm':
				valido = true;
				break;
			default:
				System.out.println("Informação invalida, digite novamente");		
			}
		}while(!valido);
		
		do {			
			valido = false;
			System.out.println("Digite o Estado Civil: ");
			estadoC = scan.next().charAt(0);
			switch(estadoC) {
				case 's':
					valido = true;
					break;
				case 'c':
					valido = true;
					break;
				case 'd':
					valido = true;
					break;
				case 'v':
					valido = true;
					break;
				default:
					System.out.println("Informação invalida, digite novamente");		
				}
		}while(!valido);
		
		do {
			valido = false;
			System.out.println("Digite o salario: ");
			salario = scan.nextDouble();
			if(salario > 0) {
				valido = true;
			}else 
				System.out.println("Informação invalida, digite novamente");					
		}while(!valido);
		
		System.out.println("nome: "+nome+", idade: "+idade+", sexo: "+sexo+", estado civil: "+estadoC+
				", salario: "+salario);

	}

}
