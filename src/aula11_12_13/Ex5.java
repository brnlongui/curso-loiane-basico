package aula11_12_13;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o valor em metros: ");
        int metro = scan.nextInt();
        int centimetro = metro*100;
        System.out.println("O valor em centimentro é: "+centimetro);
    }
}
