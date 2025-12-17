package aulas14_15;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva a letra: ");
        String letra = scan.nextLine();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("A letra é vogal!");
            System.out.println(letra);
        }else{
            System.out.println("A letra é consoante!");
            System.out.println(letra);
        }
    }
}
