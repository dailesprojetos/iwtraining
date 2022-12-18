package programacaoEstruturada.Colecoes;


import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio02_ListaLigada {

	public static void main(String[] args) {

		LinkedList<Integer> listaSequencia = new LinkedList<>();

		listaSequencia.addLast(10);
		listaSequencia.addLast(20);
		listaSequencia.addLast(30);
		listaSequencia.addLast(40);
		listaSequencia.addLast(50);

		listaSequencia.addLast(14);

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = leitor.nextInt();
		listaSequencia.addFirst(numero);

		System.out.println("Digite um número");
		numero = leitor.nextInt();

		if (listaSequencia.contains(numero)) {
			System.out.println(listaSequencia.indexOf(numero));
		} else {
			System.err.println("O numero não consta na lista");
		}
		
		for (Integer numero02 : listaSequencia) {
			System.out.println(numero02);
		}
		
		leitor.close();

	}

}
