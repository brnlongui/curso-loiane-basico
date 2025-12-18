package Ex16_17;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String user, senha;
        System.out.println("Digite o usuario: ");
        user = scan.nextLine();
        System.out.println("Digite a senha: ");
        senha = scan.nextLine();
        if (user.contentEquals(senha) == true){
            while(user.contentEquals(senha) == true){
                System.out.println("SENHA INVALIDA");
                System.out.println("Digite uma nova senha: ");
                senha = scan.nextLine();
            }
        }

    }
}
