package programacaoEstruturada.Repeticao;

public class TabuadaCompleta {

	public static void main(String[] args) {
		
		System.out.println("==================Multipliação=====================");

		for (int i = 1; i <= 10; i++) {

			int contador = 0, numero = i;

			while (contador <= 10) {
				System.out.println(numero + " x " + contador + " = " + (numero * contador));
				contador++;
			}

			System.out.println("-----------------------------------------");
		}

		System.out.println("==================Divisão=====================");

		for (int i = 1; i <= 10; i++) {

			int contador = 0, numero = i;

			while (contador <= 10) {
				System.out.println((numero * contador) + " / " + numero + " = " + contador );
				contador++;
			}

			System.out.println("-----------------------------------------");
		}
	}

}
