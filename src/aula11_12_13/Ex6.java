package aula11_12_13;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        double raio = scan.nextDouble();
        double pi = 3.14;
        double area = (raio * raio) * pi ;
        System.out.println("A area do circulo é: "+area);
    }
}
