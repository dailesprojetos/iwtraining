package programacaoEstruturada;

import java.util.Scanner;

public class A02EstruturaDeDecisaoSE03 {
	
	public static void main(String[] args) {
		
		double valorDoEmprestimo =0, salarioDoSolicitante=0;
		int numeroDeParcelas=0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor do emprestimo: ");
		valorDoEmprestimo = leitor.nextDouble();
		
		System.out.println("Digite o salario do solicitante: ");
		salarioDoSolicitante = leitor.nextDouble();
		
		System.out.println("Digite a quantidade de parcelas: ");
		numeroDeParcelas = leitor.nextInt();
		
		/*if(numeroDeParcelas>5) {
			double valorCalculoParcelaComJuro = (double) numeroDeParcela * 0.3; 
		}*/
		
		double valorDasParcelas = valorDoEmprestimo / numeroDeParcelas;
		
		boolean condicaoEmprestimo = valorDasParcelas <= salarioDoSolicitante * 0.3;
		
		/*if(condicaoEmprestimo) {
			System.out.println("emprestimo Aprovado");
		} else {
			System.out.println("emprestimo Reprovado");
		}*/
		
		String resultado = (condicaoEmprestimo)?"emprestimo Aprovado":"emprestimo Reprovado";
		
		System.out.println(resultado);
		
		
		
		
		leitor.close();
		
		
		
	}
	
	

}
