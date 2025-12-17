package aulas14_15;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        double num3 = scan.nextDouble();

        if (num1 > num2 && num1 > num3){
            if (num2 < num3) {
                System.out.println("O maior numero é: " + num1);
                System.out.println("O menor numero é: " + num2);
            }else{
                System.out.println("O maior numero é: " + num1);
                System.out.println("O menor numero é: " + num3);
            }
        }else if (num2 > num1 && num2 > num3) {
            if (num1 < num3){
                System.out.println("O maior numero é: "+num2);
                System.out.println("O menor numero é: "+num1);
            }else {
                System.out.println("O maior numero é: " + num2);
                System.out.println("O menor numero é: " + num3);
            }
        }else{
            if (num1<num2){
                    System.out.println("O maior numero é: "+num3);
                    System.out.println("O menor numero é: "+num1);
            }else{
                    System.out.println("O maior numero é: "+num3);
                    System.out.println("O menor numero é: "+num2);
            }


        }


    }


}
