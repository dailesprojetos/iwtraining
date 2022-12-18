package programacaoEstruturada.projetos;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class vendas {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Map<String, String> produtos = new HashMap<String, String>();
		Map<String, Integer> compras = new HashMap<String, Integer>();
		String mensagem="";
		int opcao = 0;

		try {

			FileWriter produto = new FileWriter("produtos.txt");
			FileWriter compra = new FileWriter("compras.txt");

			// Cadastro de produtos
			for (int i = 0; i < 2; i++) {

				System.out.println("Digite o nome do produto:");
				String produtoNome = leitor.nextLine();

				System.out.println("Digite o preço do produto:");
				String produtoPreco = leitor.nextLine();

				produto.write(produtoNome + ";" + produtoPreco + "\n");
				produto.flush();
				produtos.put(produtoNome, produtoPreco);

			}

			mensagem = "======================================";
			System.out.println(mensagem);

			// Features do Sistema

			boolean continua = true;
			String nome = null;
			int qtd = 0;

			while (continua) {

				System.out.println("Digite a opção desejada:");
				System.out.println("1 - Pesquisar preço de um produto");
				System.out.println("2 - Realizar compra");
				System.out.println("3 - Cancelar compra");
				System.out.println("4 - Finalizar o Sistema");
				opcao = leitor.nextInt();

				mensagem = "======================================";
				System.out.println(mensagem);

				switch (opcao) {
				case 1: {

					System.out.println("Informe o nome do produto:");
					nome = leitor.next();
					produtos.containsKey(nome);
					System.out.println("Preço do produto pesquisado: " + produtos.get(nome));
					System.out.println("======================================");
					break;
				}
				case 2: {
					
					System.out.println("Digite a opçao:");
					System.out.println("1 - Adicionar Produto");
					System.out.println("2 - Remover Produto");
					System.out.println("3 - Finalizar Compra");
					opcao = leitor.nextInt();
					System.out.println("======================================");

					switch (opcao) {
					case 1: {
						
						System.out.println("Informe a quantidade Itens:");
						int item = leitor.nextInt();

						for (int i = 0; i < item; i++) {

							System.out.println("Qual o produto adicionado a venda?");
							nome = leitor.next();
							
							if (produtos.containsKey(nome)) {
							
								System.out.println("Qual a contidade de produto?");
								qtd = leitor.nextInt();
								compras.put(nome, qtd);
								compra.write(nome+";"+qtd+"\n");
								compra.flush();
								
							} else {
								System.out.println("Produto não encontrado.");
								break;
							}
							
						}
						System.out.println(compras);
						
						System.out.println("======================================");
						
						for (String string : compras.keySet()) {
							System.out.println("nome: " + string + " Quantidade: "+qtd);
						}
						System.out.println("======================================");
						
						break;
					}

					case 2: {
						System.out.println("Qual produto a ser removido:");
						nome = leitor.next();
						
							compras.remove(nome);
							System.out.println("Produto removido com sucesso.");
						
						System.out.println("======================================");
						System.out.println(compras);
						for (String string : compras.keySet()) {
							System.out.println("nome: " + string + " Quantidade: "+qtd);
						}
						break;
					}
					case 3: {
						
						for (String string : compras.keySet()) {
							System.out.println("nome: " + string + " Quantidade: "+qtd);
						}
						break;
					}

					default:
						System.out.println("Opção Inválida.");
						break;
					}

				}

				case 3: {

					compras.clear();
					break;

				}

				case 4: {
					continua = false;
					break;
				}

				default:
					System.out.println("Opção Inválida.");
					break;
				}

			}

			System.out.println("=======================================");

			/*
			 * for (String comp : compras.keySet()) { System.out.println(compras.get(comp));
			 * }
			 */

			for (String produtokey : produtos.keySet()) {

				String preco = produtos.get(produtokey);
				System.out.println("nome: " + produtokey + " preço: " + preco);

			}

			leitor.close();
			produto.close();
			compra.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
