package laços;

public class Ex4 {

	public static void main(String[] args) {
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while(popA < popB) {
			popA += (popA/100)*3;
			popB +=(popB/100)*1.5;
			cont++;
		
		}
		System.out.println("Após "+cont+" anos, a população A aumentou de 80.a000 para: "+popA+" e a B "
				+ "de 200.000 para: "+popB);

	}

}
