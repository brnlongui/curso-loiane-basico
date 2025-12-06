package aula11_12_13;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        double altura = scan.nextDouble();
            System.out.println("O seu peso ideal é: "+(72.7*altura-58));
    }
}
