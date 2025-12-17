package aulas14_15;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double valor1 = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double valor2 = scan.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        double valor3 = scan.nextDouble();

        if (valor1 < valor2 && valor1 < valor3){
            System.out.println("O menor valor é: "+valor1);
        } else if (valor2 < valor1 && valor2 < valor3) {
            System.out.println("O menor valor é: "+valor2);
        }else{
            System.out.println("O menor valor é: "+valor3);
        }
    }
}
