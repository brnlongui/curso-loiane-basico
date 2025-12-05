package aula11_12_13;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double temp = scan.nextDouble();
        System.out.println("A temperatura em Fahrenheit "+(temp*1.8+32));
    }
}
