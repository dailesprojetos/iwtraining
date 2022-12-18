package programacaoVetorMatriz;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int numeros[] = {10,5,10,89,54,10,5,36,65,47,36,10};
		int maior = 0, menor = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = leitor.nextInt();
		
		leitor.close();
		
		int quantidade = 0;
		
		for (int indice = 0; indice < numeros.length; indice++) {
			
			if (numeros[indice] == numero) {
				quantidade++;
			}
			
		}
		
		System.out.println("Tem esse numero no vetor "+ quantidade + " vez(es)");
		
		
		System.out.println("================================================");
		
		System.out.println("Maior numero e menor do vetor");
		
		int ordenacao = 0;
		
		for (int indice = 0; indice < numeros.length; indice++) {
			
			if(indice == 0) {
				menor = numeros[indice];
			} else {
				if(numeros[indice]<menor) {
					menor = numeros[indice];
				}
			}
			
			if(numeros[indice]>maior) {
				maior = numeros[indice];
			}
			
		}
		
		System.out.println("Maior numero é "+ maior);
		System.out.println("Menor numero é "+ menor);
		
		System.out.println("=================================================");
		
		System.out.println("Ordenar o vetor por ordem crescente");
				
		
		for (int indice = 0; indice < numeros.length; indice++) {
			
			int temp = 0;
			
			for (int i = indice+1; i < numeros.length; i++) {
				
				if (numeros[i]<numeros[indice]) {
					
					temp = numeros[indice];
					numeros[indice] = numeros[i];
					numeros[i] = temp;
					
				}
				
			}
		}
		
		for (int numeroC : numeros) {
			System.out.println(numeroC);
		}

	}

}
