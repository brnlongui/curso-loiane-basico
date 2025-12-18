package Ex16_17;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double valor = 11;
        while(valor > 10 || valor < 0 ){
            System.out.println("Digite o valor ");
            valor = scan.nextDouble();
            if(valor > 10 || valor < 0){
                System.out.println("Valor invalido");
            }
        }
    }
}
