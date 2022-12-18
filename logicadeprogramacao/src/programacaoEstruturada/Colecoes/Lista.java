/**
 * Interseção usando Listas
 * */

package programacaoEstruturada.Colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		String p01[] = { "Jose da Silva", "Larissa Dias", "Jessica Moura", "Lucas Castro" };
		String p02[] = { "Jose da Silva", "Carlos", "Jessica Moura" };

		List<String> pessoas = Arrays.asList(p01);

		List<String> pessoas02 = Arrays.asList(p02);

		List<String> intersecao = new ArrayList<>();

		List<String> uniao = new ArrayList<>();

		// Interseção das Listas
		for (String pessoa : pessoas02) {
			if (pessoas.contains(pessoa)) {
				intersecao.add(pessoa);
			}
			intersecao.sort(null);
		}

		System.out.println(intersecao.toString());

		// Uniao das Listas
		for (String pessoa : pessoas) {
			if (!uniao.contains(pessoa)) {
				uniao.add(pessoa);
			}
		}
		
		for (String pessoa : pessoas02) {
			if (!uniao.contains(pessoa)) {
				uniao.add(pessoa);
			}
		}
		
		uniao.sort(null);
		
		System.out.println(uniao.toString());
		
		
		//Ordem alfabetica decrescente - Lista uniao
		

	}

}
