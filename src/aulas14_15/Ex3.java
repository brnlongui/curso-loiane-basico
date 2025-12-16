package aulas14_15;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a letra ");
        String sexo = scan.nextLine();

        if (sexo.equalsIgnoreCase("m")) {
            System.out.println("M-Masculino");
        }else if (sexo.equalsIgnoreCase("f")){
            System.out.println("F-Feminino");
        }else{
            System.out.println("Sexo invalido");
        }
    }
}
