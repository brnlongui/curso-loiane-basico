package arraysMultidimensionais;
import java.util.Random;
public class Ex1 {

	public static void main(String[] args) {
		int [][] numerosAleatorios = new int [4][4];
		int maior = Integer.MIN_VALUE, linha = 0, coluna = 0;
		
		
		Random numeroRandom = new Random();

		for(int i=0; i< numerosAleatorios.length; i++) {
			for(int j=0; j< numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
				if(numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					coluna = j;
					linha = i;
				}
			}
		}
		for(int i=0; i< numerosAleatorios.length; i++) {
			for(int j=0; j< numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j]+" ");
			}	
			System.out.println();
		}
		System.out.println("maior: "+maior);
		System.out.println("linha: "+linha);
		System.out.println("coluna: "+coluna);
	}

}
