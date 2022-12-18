package programacaoVetorMatriz;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pares[] = {2,4,6,8,10,12,14};
		
		for (int indice = 0; indice < pares.length; indice++) {
			
			System.out.println(pares[indice]+"");
			
		}
		

		System.out.println("===================================");
		
		int impares[] = new int[7];
		
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		impares[5] = 11;
		impares[6] = 13;
		

		for (int indice = 0; indice < impares.length; indice++) {
			
			System.out.println(impares[indice]);
			
		}
		
		int clonePares[] = pares.clone();
		
		System.out.println(pares.equals(impares));
		
		for(int numero : clonePares) {
			System.out.println(numero);
		}
	}

}
