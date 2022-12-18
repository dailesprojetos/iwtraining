package programacaoEstruturada.se;

import java.util.Scanner;

public class A02EstruraturadaDeDecisaoSE {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Didgite a primeira nota: ");
		double nota01 = leitor.nextDouble();

		System.out.println("Didgite a segunda nota: ");
		double nota02 = leitor.nextDouble();

		System.out.println("Didgite a terceira nota: ");
		double nota03 = leitor.nextDouble();

		double media = (nota01 + nota02 + nota03) / 3;

		/*if (media >= 7) {
			System.out.printf("O Aluno foi Aprovado com Média: %.2f", media);
		} else {
			System.out.printf("O Aluno foi Reprovado com Média: %.2f ", media);
		}*/
		
		String resposta = (media >= 7)? "O Aluno foi Aprovado com Média" +media:"O Aluno foi Reprovado com Média: "+media;
		
		System.out.println(resposta);
		
		leitor.close();

	}

}
