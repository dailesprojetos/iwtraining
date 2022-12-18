package programacaoEstruturada.Repeticao;

import java.util.Scanner;

public class EstruturaDeRepeticaoEnquantoFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dados = new Scanner(System.in);

		int opcao = 0;
		double saldo = 1000;
		boolean continua = true;

		while (continua) {

			System.out.println("Que operação deseja realizar?");
			System.out.println("1-saldo");
			System.out.println("2-saque");
			System.out.println("3-deposito");
			System.out.println("4-encerrar atendimento");

			opcao = dados.nextInt();

			switch (opcao) {

			case 1:
				System.out.println(saldo);
				break;

			case 2:
				System.out.println("saque");
				break;

			case 3:
				System.out.println("deposito");
				break;

			case 4:
				continua = false;
				break;

			default:
				System.out.println("opção invalida");

			}

		}
		
		dados.close();

	}

}
