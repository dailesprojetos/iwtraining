/**
 Passar todos os numeros de dois arrays para a terceira array, sem as informações repetidas - Resolver em casa
 * */

package programacaoVetorMatriz;

public class Exercicio06 {

	public static void main(String[] args) {

		String pessoa01[] = { "Jose da Silva", "Larissa Dias", "Jessica Moura", "Lucas Castro" };
		String pessoa02[] = { "Jose da Silva", "Carlos", "Jessica Moura" };
		String pessoa03[] = new String[5];

		int contador = 0;
		for (int i = 0; i < pessoa01.length; i++) {
			for (int j = 0; j < pessoa02.length; j++) {

				if (pessoa01[i].compareTo(pessoa02[j]) == 0) {

					pessoa03[contador] = pessoa01[i];
					contador++;

				}
			}
		}

		System.out.println("===========================");

		for (String nome : pessoa03) {

			if (nome != null) {
				System.out.println(nome);
			}
		}

	}

}
