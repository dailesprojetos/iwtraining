package programacaoEstruturada.revisao;

import java.util.Scanner;

public class E03_tanqueCheio {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o tipo de combustivel");
		char tipoDeCombustivel = leitor.next().charAt(0);
		
		System.out.println("Digite a capacidade do tanque em litros");
		int capacidadeDoTanque = leitor.nextInt();
		
		double despesa = 0;
		
		if (tipoDeCombustivel == 'g' || tipoDeCombustivel == 'G') {
			
			despesa = 1.80 * capacidadeDoTanque;	
			System.out.println("Despesa: "+despesa);
			
		} else if (tipoDeCombustivel == 'a' || tipoDeCombustivel == 'A') {
			
			despesa = 1 * capacidadeDoTanque;
			System.out.println("Despesa: "+despesa);
			
		} else {
			
			System.out.println("Dados inválidos!");
			
		}

	}
	
	
	


}
