package arraysMultidimensionais;

import java.util.Scanner;

public class Ex4 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		byte op;
		while(!sair) {
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			op = scan.nextByte();
			if(op == 1) {//add compromisso
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
					System.out.println("Entre com o dia: ");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						 diaValido = true;
					}
					else {
						System.out.println("Dia invalido, digite novamente: ");
					}
				}
				
				boolean horaValida = false;
				int hora = 0;
				while(!horaValida) {
					System.out.println("Entre com a hora: ");
					hora = scan.nextInt();
					if(hora >= 0 && hora <= 23) {
						 horaValida = true;
					}
					else {
						System.out.println("Hora invalida, digite novamente: ");
					}
				}
				System.out.println("Digite o compromisso: ");
				compromissos[--dia][hora] = scan.next();
				
			}
			else if(op == 2) {//verificar compromisso
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
					System.out.println("Entre com o dia: ");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						 diaValido = true;
					}
					else {
						System.out.println("Dia invalido, digite novamente: ");
					}
				}
				
				boolean horaValida = false;
				int hora = 0;
				while(!horaValida) {
					System.out.println("Entre com a hora: ");
					hora = scan.nextInt();
					if(hora >= 0 && hora <= 23) {
						 horaValida = true;
					}
					else {
						System.out.println("Hora invalida, digite novamente: ");
					}
				}
				System.out.println("O compromisso é: ");
				System.out.println(compromissos[--dia][hora]);
			}
			else if(op == 0) {
				sair = true;
			}
			else {
				System.out.println("Opção invalida, digite novamente");
			}
		}
	}

}
