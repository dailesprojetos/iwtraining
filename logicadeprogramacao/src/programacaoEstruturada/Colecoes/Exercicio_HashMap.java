package programacaoEstruturada.Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio_HashMap {

	public static void main(String[] args) {

		Map<String, String> agenda = new HashMap<String, String>();

		Scanner leitor = new Scanner(System.in);

		boolean continua = true;
		int opcao = 0;
		String contato = "", telefone = "";

		while (continua) {

			System.out.println("Digie uma opção:");

			System.out.println("1 - Adicionar uma pessoa");
			System.out.println("2 - Mostrar a Lista de pessoas");
			System.out.println("3 - Deletar uma pessoa");
			System.out.println("4 - Modificar registro");
			System.out.println("5 - Finalizar");

			opcao = leitor.nextInt();

			switch (opcao) {

			case 1: {

				System.out.println("Digite o nome do contato");
				contato = leitor.next();
				System.out.println("Digite o numero do contato");
				telefone = leitor.next();
				agenda.put(contato, telefone);
				break;
			}

			case 2:
				for (String registro : agenda.keySet()) {

					String tel = agenda.get(registro);
					System.out.println("nº: " + tel + " nome: " + registro);

				}
				break;

			case 3:

				System.out.println("digite o nº do contato a ser removido");
				contato = leitor.next();
				agenda.remove(contato);
				break;

			case 4:

				System.out.println("digite o nome do contato");
				contato = leitor.next();

				if (!agenda.containsKey(contato)) {
					System.out.println("Contato não encontrado.");
					continua = false;
					break;
				} else {
					System.out.println("digite o nº de telefone");
					telefone = leitor.next();
					agenda.replace(contato, telefone);
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
