package programacaoEstruturada.revisao;

import java.util.Scanner;

public class E01_Pagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o valor do produto");
		double valorProduto = leitor.nextDouble();

		System.out.println("Digite a forma de pagamento");
		System.out.println("1 -  à vista.");
		System.out.println("2 -  à vista no cartão.");
		System.out.println("3 -  Parcelado em 2x.");
		System.out.println("4 -  Parcelado em 4x.");
		int codigo = leitor.nextInt();

		String formaDePagamento = "";
		int parcela = 0;
		double variacao = 0;

		switch (codigo) {

		case 1:
			parcela = 1;
			variacao = -valorProduto*0.08;
			formaDePagamento = "à vista dinheiro.";
			break;

		case 2:
			parcela = 1;
			variacao = -valorProduto*0.04;
			formaDePagamento = "à vista cartão.";
			break;
			
		case 3:
			parcela = 2;
			variacao = 0;
			formaDePagamento = "Parcelado em 2X.";
			break;

		case 4:
			parcela = 4;
			variacao = valorProduto*0.08;
			formaDePagamento = "Parcelado em 4x.";
			break;

		default:
			parcela = 0;
			valorProduto = 0;
			formaDePagamento = "inválida";
		}
		
		double valorFinal = valorProduto + variacao;
		
		System.out.println("Valor inicial do produto: "+valorProduto);
		System.out.println("Forma de pagamento: "+formaDePagamento);
		System.out.println("Valor da parcela: "+valorFinal/parcela);
		System.out.println("Valor final do prduto: "+valorFinal);

	}

}
