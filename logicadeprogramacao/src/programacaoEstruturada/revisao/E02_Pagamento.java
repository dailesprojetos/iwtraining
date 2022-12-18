package programacaoEstruturada.revisao;

import java.util.Scanner;

public class E02_Pagamento {
	
	Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		
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
		
		if (codigo==1) {
			parcela = 1;
			variacao = -valorProduto*0.08;
			formaDePagamento = "à vista dinheiro.";
		} else if (codigo==2) {
			parcela = 1;
			variacao = -valorProduto*0.04;
			formaDePagamento = "à vista cartão.";
		} else if(codigo==3) {
			parcela = 2;
			variacao = 0;
			formaDePagamento = "Parcelado em 2X.";
		} else if(codigo==4) {
			parcela = 4;
			variacao = valorProduto*0.08;
			formaDePagamento = "Parcelado em 4x.";
		} else {
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
