package Ex16_17;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome ;
        int idade;
        double salario;
        while(true) {
            System.out.println("Digite o nome: ");
            nome = scan.nextLine();
            if (nome.length() > 3) {
                break;
            }
            System.out.println("Nome invalido! Digite novamente: ");
        }

        while (true){
            System.out.println("Digite a idade: ");
            idade = scan.nextInt();
            if (idade >= 0 && idade<=150){
                break;
            }
            System.out.println("Idade invalida! Digite novamente: ");
        }

        while (true){
            System.out.println("Digite o salario: ");
            salario = scan.nextDouble();
            if(salario > 0){
                break;
            }
            System.out.println("Salario invaldo! Digite novamente: ");

        }
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
    }
}
