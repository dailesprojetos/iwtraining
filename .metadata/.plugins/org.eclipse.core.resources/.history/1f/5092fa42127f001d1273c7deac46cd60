package programacaoEstruturada.funcoes;

public class A01_Funcoes {

	public static void main(String[] args) {
		
		/*System.out.println(quadrado(14));
		quadradoSemRetorno(21);*/
		System.out.println(fatorial(6));
		System.out.println(fatRecursivo(6));
	}
	
	//Funçoes
	public static double quadrado(int numero) {
		return Math.pow(numero, 2);
	}

	public static void quadradoSemRetorno(int numero) {
		System.out.println(Math.pow(numero, 2));
	}
	
	//Função fatorial ex: 4*3*2*1
	public static int fatorial(int numero) {
		
		int fat = 1;
		
		while(numero>=1) {
			fat *= numero;
			numero--;
		}
		
		return fat;
	}
	
	//Recursividade
	public static int fatRecursivo(int numero) {
		if(numero == 1) return 1;
		else return numero * fatRecursivo(numero-1);
	}
}
