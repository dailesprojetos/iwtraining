package programacaoEstruturada.Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio02_Crud_Lista {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		/*
		 * fila de atendimento adicionar pessoa no final da fila adicionar prioridades
		 * chamar pessoa ver se a fila esta vazia verificar quantas pessoas tem na fila
		 * 
		 */

		List<String> fila = new ArrayList<>();
		String pessoa = "";

		boolean continua = true;
		int contadorPrioridade = 0;
		while (continua) {

			//verificar a prioridade na lista - Tarefa (Botar sempre em ordem a prioridade - Tem que vir sempre em primeiro da lista.)

			System.out.println("Digie uma opção:");
			System.out.println("1 - Adicionar uma pessoa");
			System.out.println("2 - P - Adicionar prioridade");
			System.out.println("3 - Chamar uma pessoa");
			System.out.println("4 - Verifica se a fila esta vazia");
			System.out.println("5 - Mostrar a lista de pessoas");

			int opcao = leitor.nextInt();

			switch (opcao) {

			case 1: {
				System.out.println("Digite o nome da pessoa");
				pessoa = leitor.next();
				fila.add(pessoa);
				break;
			}

			case 2: {
				System.out.println("Digite o nome da prioridade");
				pessoa = "P - " + leitor.next();
				fila.add(contadorPrioridade,pessoa);
				contadorPrioridade++;
				break;
			}

			case 3: {
				System.out.println(fila.remove(0));
				break;
			}

			case 4: {
				System.out.println(fila.size() > 0 ? fila.size() : "A fila esta vazia");
				break;

			}

			case 5: {
				for (String usuario : fila) {
					System.out.println(usuario);
					//Collections.swap(fila, contadorPrioridade, opcao);
				}
				break;
			}

			case 6:
				continua = false;
				break;

			default:
				System.out.println("Opção invalida");
				break;
			}

		}

		leitor.close();
	}

}
