package aula11_12_13;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("digite o segundo numero: ");
        int num2 = scan.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos numeros digitados :"+soma);
    }
}
