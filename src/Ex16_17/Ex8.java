package Ex16_17;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o numero: ");
            int num = scan.nextInt();
             soma += num;
        }
        System.out.println(soma);
        System.out.println(soma/5);

    }
}
