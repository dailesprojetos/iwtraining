package programacaoEstruturada.Selecione;

import java.util.Scanner;

public class A03EstruturasDeDecisaoSeleciona {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int codigoDoProduto = 0;
		String resposta = "";
		
		System.out.println("Digite o codigo do produto: ");
		codigoDoProduto = leitor.nextInt();
		
		switch (codigoDoProduto) {
			
			case 1: resposta = "Alimento não perecivel";
				break;
			
			case 2:
			
			case 3:
			
			case 4: resposta = "Alimento Perecivel";
			
			case 5:
				
			case 6: resposta = "Vestuario";
				break;
				
			case 7:	resposta = "Higiene Pessoal";
				break;
				
			case 8:
				
			case 9:
				
			case 10: resposta = "Utensilios domesticos";
				break;
			
			default : resposta = "Codigo Invalido";	
			
		}
		
		System.out.println(resposta);
		
		leitor.close();
	}

}
