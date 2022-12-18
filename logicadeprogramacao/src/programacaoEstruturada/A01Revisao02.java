package programacaoEstruturada;

import java.util.Scanner;

public class A01Revisao02 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//elevar um numero ao quadrado
		System.out.println("Digite um número qualquer: ");
		
		int numero = leitor.nextInt();
		
		//elevar um numero ao quadrado
		int quadrado = (int) Math.pow(numero, 2);
		
		//Raiz quadrada
		int raizQuadrada = (int) Math.sqrt(numero);
		
		//Raiz quadrada
		int raizCubica = (int) Math.cbrt(numero);
		
		leitor.close();
		
		System.out.println(quadrado);
		System.out.println(raizQuadrada);
		System.out.println(raizCubica);
		
	}

}
