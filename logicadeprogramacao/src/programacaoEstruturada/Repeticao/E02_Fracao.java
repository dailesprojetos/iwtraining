package programacaoEstruturada.Repeticao;

public class E02_Fracao {

	public static void main(String[] args) {
		
		
		//1/1 + 1/2 + 1/3 ..... 1/100

		int contador = 1; 
		double somador = 0;

		while (contador <= 100) {
			somador += 1/(double)contador;
			contador++;
		}

		System.out.println(somador);
	}

}
