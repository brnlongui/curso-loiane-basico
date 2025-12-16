package aulas14_15;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        double numero = scan.nextDouble();

        if(numero == 0){
            System.out.println("O numero é igual a zero!");
        }else if (numero < 0){
            System.out.println("O numero é negativo!");
        }else{
            System.out.println("O numero é positivo");
        }
    }
}
