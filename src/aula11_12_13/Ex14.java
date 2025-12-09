package aula11_12_13;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double excesso = 0;
        double multa = 0;
        System.out.println("Digite o peso de peixes pescados: ");
        double peso = scan.nextDouble();
        if (peso > 50){
            excesso = peso - 50;
            multa = excesso * 4.00;
            System.out.println("O excedente é: "+excesso+"kg e a multa é no valor de: "+multa+"R$");
        }else{
            System.out.println("O excedente é: "+excesso+"kg e a multa é no valor de: "+multa+"R$");
        }
    }
}
