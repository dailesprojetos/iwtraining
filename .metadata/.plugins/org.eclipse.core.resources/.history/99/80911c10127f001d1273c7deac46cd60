package br.com.algoritimos;

import java.util.Scanner;

public class CalculoVenda {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o valor do produto: ");
		double vrProduto = leitor.nextDouble();
		System.out.println("Digite o valor pago: ");
		double vrPago = leitor.nextDouble();
		double vrTroco = vrPago - vrProduto;

		int centena = (int) vrTroco / 100;
		int dezena = (int) (vrTroco - centena * 100) / 10;
		int unidade = (int) vrTroco % 10;
		double centavos = (vrTroco % 1) * 100;
		
		String vrCentavos = String.format("%.0f", centavos);
		
		System.out.println("===================================");
		
		if(centena == 0 && dezena == 0) {
			System.out.println("Troco - R$: "+unidade+","+vrCentavos+" Centavos");
		} else if (centena == 0 && dezena != 0) {
			System.out.println("Troco - R$: "+dezena+unidade+","+vrCentavos+" Centavos");
		} else {
			System.out.println("Troco - R$: "+centena+dezena+unidade+","+vrCentavos+" Centavos");
		}
		
		System.out.println("===================================");
		
		//Condicões Ternarias
		String condicao = (centena == 0 & dezena == 0)?
				"Troco - R$: "+unidade+" Reais e "+vrCentavos+" Centavos"
				: (centena == 0 && dezena != 0)? 
						"Troco - R$: "+dezena+unidade+" Reais e "+vrCentavos+" Centavos" : 
							"Troco - R$: "+centena+dezena+unidade+" Reais e "+vrCentavos+" Centavos";
		
		System.out.println(condicao);
		
		//System.out.printf("R$: "+"%.0f %.0f %.0f %.0f",centena,dezena,unidade,centavos);
	}

}
