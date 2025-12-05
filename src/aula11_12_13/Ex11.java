package aula11_12_13;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int num2 = scan.nextInt();
        System.out.println("Digite o numero real: ");
        double num3 = scan.nextDouble();

        System.out.println("o produto do dobro do primeiro com metade do segundo: "+(num1*2)*(num2/2));
        System.out.println("A soma do triplo do primeiro com o terceiro: "+((num1*3)+num3));
        System.out.println("O terceiro elevado ao cubo: "+num3*num3);
    }
}
