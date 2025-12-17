package aulas14_15;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota ");
        double nota2 = scan.nextDouble();

        if ((nota1 + nota2)/2 == 10) {
            System.out.println("Aprovado com Distinção");
        }else if ((nota1 + nota2)/2 >= 7 ){
                System.out.println("Aprovado");
        } else if ((nota1 + nota2)/2 < 7) {
                System.out.println("Reprovado");
        }

    }
}
