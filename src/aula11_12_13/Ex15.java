package aula11_12_13;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double bruto;
        double inss;
        double ir;
        double sindicato;

        System.out.println("Qual o valor recebido por hora: ");
        double valor = scan.nextDouble();
        System.out.println("Qual a quantidade de horas trabalhadas: ");
        double horas = scan.nextDouble();

        bruto = horas*valor;
        ir = (11/100.0)*bruto;
        inss = (8/100.0)*bruto;
        sindicato = (5/100.0)*bruto;

        System.out.println("Seu salario bruto é: "+bruto);
        System.out.println("Valor de INSS é: "+inss);
        System.out.println("Valor de sindicato é: "+sindicato);
        System.out.println("Salario liquido é: "+(bruto - ir - inss - sindicato));

    }
}
