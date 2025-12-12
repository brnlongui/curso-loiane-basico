package aula11_12_13;

import java.util.Scanner;


public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double litrosNecessarios, preco;
        int latas;
        System.out.println("digite a quantidade de metros² a serem pintados: ");
        double metros = scan.nextDouble();

        litrosNecessarios = metros/3.0;

        latas = (int)(litrosNecessarios / 18);
        if(litrosNecessarios % 18 != 0) {
            latas++;
        }
        preco = latas * 80.0;
        System.out.println("serão necessarios "+litrosNecessarios+"L");
        System.out.println("Voce precisa de "+latas+" latas e custará "+preco+"reais");
    }
}
