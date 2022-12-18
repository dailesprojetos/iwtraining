package estoque;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProjetoMain {

	public static void main(String[] args) {

		// Produtos.criarArquivo(endereco);

		Map<String, String> produtos = new HashMap<String, String>();
		Map<String, Integer> compras = new HashMap<String, Integer>();

		String nome = null, preco = null;
		String endereco = "produtos.txt";
		String mensagem = null;

		Scanner leitor = new Scanner(System.in);

		/*
		 * System.out.println("Informe o nome do produto:"); String produtoNovo =
		 * leitor.nextLine();
		 * 
		 * Produtos.adicionarProduto(endereco, produtoNovo);
		 */
		String prod = Produtos.mostrarProdutos(endereco);

		String linha[] = prod.split("\n");

		int contador = 0;

		while (contador < linha.length) {
			String produto[] = linha[contador].split(",");
			nome = produto[0];
			preco = produto[1];
			produtos.put(nome, preco);
			contador++;
		}

		int opcao = 0;
		nome = null;
		boolean continua = true;

		while (continua) {

			System.out.println("Digite a opção:");
			System.out.println("1 - Pesquisar preço do produto.");
			System.out.println("2 - Realizar compras.");
			System.out.println("3 - Cancelar compras.");
			System.out.println("4 - finalizar o sistema.");
			opcao = leitor.nextInt();

			switch (opcao) {
			// Pesquisa preço
			case 1: {
				mensagem = "Informe o nome do produto:";
				System.out.println(mensagem);
				nome = leitor.next();
				produtos.containsKey(nome);
				
				mensagem="=======================================";
				System.out.println(mensagem);
				
				mensagem = "Preço do produto pesquisado R$: ";
				System.out.println(mensagem + produtos.get(nome));
				
				mensagem="=======================================";
				System.out.println(mensagem);
				break;
			}

			// Realizar Compras
			case 2: {

				while (continua) {

					System.out.println("Digite a opção:");
					System.out.println("1 - Adicionar Produto");
					System.out.println("2 - Remover Produto");
					System.out.println("3 - Finalizar Compra");
					opcao = leitor.nextInt();

					switch (opcao) {
					// Adicionar produto
					case 1: {

						System.out.println("Informe a quantidade Itens:");
						int item = leitor.nextInt();

						for (int i = 0; i < item; i++) {

							System.out.println("Adicionar qual produto?");
							nome = leitor.next();

							if (produtos.containsKey(nome)) {
								System.out.println("Informe a quantidade do produto:");
								int qtd = leitor.nextInt();
								compras.put(nome, qtd);
							} else {
								System.out.println("Produto não encontrado.");
							}
						}

						mensagem="=======================================";
						System.out.println(mensagem);
						
						for (String itens : compras.keySet()) {

							Integer qtd = compras.get(itens);
							System.out.println("Produto: " + itens + " Quantidade: " + qtd);
						}
						
						mensagem="=======================================";
						System.out.println(mensagem);

						break;
					}
					// Remover produto
					case 2: {

						System.out.println("Remover qual produto?");
						String produtoRM = leitor.next();
						if (compras.containsKey(produtoRM)) {
							compras.remove(produtoRM);
							System.out.println("Produto removido com sucesso.");
						} else {
							System.out.println("Produto não encontrado.");
						}
						
						mensagem="=======================================";
						System.out.println(mensagem);
						
						for (String itens : compras.keySet()) {

							Integer qtd = compras.get(itens);
							System.out.println("Produto: " + itens + " Quantidade: " + qtd);
						}

						break;

					}

					// Finalizar compras
					case 3: {

						endereco = "compras.txt";
						Compras.adicionarCompras(endereco, compras.toString());
						System.out.println("Compras finalizadas.");
						continua = false;
						break;

					}

					default:
						System.out.println("Opção inválida.");
						break;
					}
				}

			}

			// Cancelar compras
			case 3: {
				compras.clear();
				System.out.println("Compras Canceladas");
				break;
			}

			// Finalizar o sistema
			case 4: {
				System.out.println("Sistema Fechado.");
				continua = false;
				break;
			}

			default: {
				System.out.println("Opção Inválida.");
			}

			}

			// System.out.println(produtos);

			/*
			 * for (int i = 0; i < linha.length; i++) { String produto[] =
			 * linha[i].split(","); nome = produto[0]; preco = produto[1];
			 * produtos.put(nome, preco); }
			 */
		}
		leitor.close();
	}

}
