package aula11_12_13;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor ganho por hora: ");
        double val = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mes: ");
        int hr = scan.nextInt();

        System.out.println("O salario do mes é: "+val*hr);
    }
}
