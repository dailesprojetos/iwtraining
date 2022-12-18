package programacaoVetorMatriz;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		String nomes[] = { "Jose da Silva", "Larissa Dias", "Jessica Moura", "Lucas Castro" };
		String temp;
		for (int i = 0; i < nomes.length; i++) {
			for (int j = i + 1; j < nomes.length; j++) {

				if (nomes[i].compareTo(nomes[j]) > 0) {
					temp = nomes[i];
					nomes[i] = nomes[j];
					nomes[j] = temp;
				}
			}
		}

		System.out.println("Nomes em Ordem Alfabetica");
		System.out.println("===========================");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

	}

}
