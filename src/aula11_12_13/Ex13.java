package aula11_12_13;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o genero: ");
        String sexo = scan.next();
        System.out.println("Digite a altura: ");
        double altura = scan. nextDouble();
        if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")){
            System.out.println("O seu peso ideal é: "+(72.7*altura-58));
        }else if(sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("f")){
            System.out.println("O seu peso ideal é: "+(62.1*altura-44.7));

        }else{
            System.out.println("Voce não digitou um sexo valido!");
        }
    }
}
