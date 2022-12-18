package programacaoEstruturada.Repeticao;

import java.util.Scanner;

public class E03_Tabuada {
	
	public static void main(String[] args) {
	
		int contador = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = leitor.nextInt();
		
		System.out.println("com While ===============================");
		
		while(contador<=10) {
			 System.out.println(numero+" x "+contador+" = "+(numero*contador));
			contador++;
		}
		
		System.out.println("com For ===============================");
		for(contador=0; contador<=10;contador++) {
			
			 System.out.println(numero+" x "+contador+" = "+(numero*contador));
			
		}
		
		
	}

}
