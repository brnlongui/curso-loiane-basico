package aulas14_15;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double numero1 = scan.nextDouble();
        System.out.println("Digite o segundo numero");
        double numero2 = scan.nextDouble();

        if (numero1 == numero2){
            System.out.println("Os numeros são iguais: ");
        }else if( numero1 < numero2){
            System.out.println(numero2);
        }else{
            System.out.println(numero1);
        }

    }
}
