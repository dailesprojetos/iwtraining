package programacaoEstruturada.Repeticao;

public class SomaImpares {

	public static void main(String[] args) {
		
		int somador = 0;
		
		for (int numero=1; numero < 100; numero++) {
			
			if(numero%2!=0) {
				somador+=numero;
			}
			
		}
		
		System.out.println(somador);
	}

}
