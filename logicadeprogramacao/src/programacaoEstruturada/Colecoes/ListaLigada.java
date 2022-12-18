package programacaoEstruturada.Colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaLigada {

	public static void main(String[] args) {

		List<String> listaComum = new ArrayList<>();
		
		LinkedList<String> listaLigada =  new LinkedList<>(); //Tem mais que opções que a lista
		//pilha e lista
		listaLigada.addLast("um");
		listaLigada.addLast("dois");
		listaLigada.addLast("tres");
		listaLigada.addLast("quatro");
		listaLigada.addLast("cinco");
		
		System.out.println(listaLigada.toString());
		
		listaLigada.removeLast(); //Se a listaligada estiver vazio dá erro de exceção
		
		System.out.println(listaLigada.toString());
		
	}

}
