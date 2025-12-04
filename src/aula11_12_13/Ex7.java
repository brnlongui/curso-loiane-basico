package aula11_12_13;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de um dos lados do quadrado: ");
        int lado = scan.nextInt();
        int area = lado*lado;
        System.out.println("a area é: "+area);
        area *= area;
        System.out.println("o dobro da area é: "+area);
    }
}
