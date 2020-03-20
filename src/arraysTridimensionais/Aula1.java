package arraysTridimensionais;
/*preencher uma matriz tridimensional, somar todos elementos pares, todos elementos impares 
 * e a soma total de todos os elementos.
 */

public class Aula1 {

	public static void main(String[] args) {
		
		int [][][] matrizTri = new int [3][3][3];
		int somapar = 0, somaimpar = 0, somatotal = 0;
		
		for(int i = 0; i < matrizTri.length; i++) {
			for(int j = 0; j < matrizTri[i].length; j++) {
				for(int k = 0; k < matrizTri[i][j].length; k++) {
					matrizTri[i][j][k] = i + j + k;
					if(matrizTri[i][j][k] % 2 == 0) {
						somapar += matrizTri[i][j][k];
					}
					else {
						somaimpar += matrizTri[i][j][k];
					}
				}
			}
		}
		somatotal += somapar + somaimpar;
		
		System.out.println(somapar);
		System.out.println(somaimpar);
		System.out.println(somatotal);
	}

}
