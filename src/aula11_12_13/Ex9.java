package aula11_12_13;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em F:");
        double F = scan.nextDouble();
        System.out.println("a temperatura em C é: "+(5*(F-32)/9));
    }
}
