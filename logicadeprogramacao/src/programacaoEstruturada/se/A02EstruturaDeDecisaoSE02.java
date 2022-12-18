package programacaoEstruturada.se;

import java.util.Scanner;

public class A02EstruturaDeDecisaoSE02 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Didgite a primeira nota: ");
		int n01 = leitor.nextInt();

		System.out.println("Didgite a segunda nota: ");
		int n02 = leitor.nextInt();

		System.out.println("Didgite a terceira nota: ");
		int n03 = leitor.nextInt();
		
		int maior = 0;

		if(n01>n02) {
			if(n01>n03) {
				maior = n01;
			} else {
				maior = n03;
			}
			
		} else if (n02>n03)  {
			maior = n02;
		} else {
			maior = n03;
		}
		
		System.out.println("O maior numero é: "+maior);
		
		//ver condicão ternarias para verificar o maior numero dos tres.
		
		leitor.close();
		
	}
	
}
