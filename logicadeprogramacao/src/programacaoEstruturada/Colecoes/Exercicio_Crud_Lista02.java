package programacaoEstruturada.Colecoes;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_Crud_Lista02 {

	public static void main(String[] args) {
		
		/*
		 * loop infinito contendo as seguintes opções
		 * 
		 * 1-incluir pessoa
		 * 2-pesquisar pessoa - mostrar uma lista de pessoas cadastradas
		 * 3-deletar
		 * 4-modificar registro
		 * 5-finalizar
		 * 
		 * */
		
		
		Scanner leitor = new Scanner(System.in);

		/*
		 * fila de atendimento adicionar pessoa no final da fila adicionar prioridades
		 * chamar pessoa ver se a fila esta vazia verificar quantas pessoas tem na fila
		 * 
		 */

		List<String> agenda = new ArrayList<>();
		String pessoa = "";
		int indice = 0;

		boolean continua = true;
		while (continua) {

			System.out.println("Digie uma opção:");
			System.out.println("1 - Adicionar uma pessoa");
			System.out.println("2 - Mostrar a Lista de pessoas");
			System.out.println("3 - Deletar uma pessoa");
			System.out.println("4 - Modificar registro");
			System.out.println("5 - Finalizar");

			int opcao = leitor.nextInt();

			switch (opcao) {

			case 1: {
				System.out.println("Digite o nome da pessoa");
				pessoa = leitor.next();
				agenda.add(pessoa);
				break;
			}
			
			case 2: {
				for (String usuario : agenda) {
					System.out.println(usuario);
				}
				break;
			}
			
			case 3: {
				System.out.println("Digite a pessoa a ser deletada");
				indice = leitor.nextInt();
				System.out.println(agenda.remove(indice));
				break;
			}

			case 4: {
				System.out.println("Digite o registro da pessoa");
				indice = leitor.nextInt();
				System.out.println("Digite a pessoa para alterar o nome");
				pessoa = leitor.next();
				agenda.set(indice, pessoa);
				break;
			}

			case 5:
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
