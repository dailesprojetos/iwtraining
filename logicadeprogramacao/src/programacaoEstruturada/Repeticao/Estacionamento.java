package programacaoEstruturada.Repeticao;

import java.util.Scanner;

public class Estacionamento {

	public static void main(String[] args) {

		int horaEntrada = 0, minutoEntrada = 0, horaSaida = 0, minutoSaida = 0;

		Scanner leitor = new Scanner(System.in);

		while (true) {

			System.out.println("Hora de Entrada do Veiculo: ");
			horaEntrada = leitor.nextInt();

			if (horaEntrada >= 0 && horaEntrada < 24) {
				break;
			}

		}

		while (true) {

			System.out.println("Minuto de Entrada do Veiculo: ");
			minutoEntrada = leitor.nextInt();

			if (minutoEntrada >= 0 && minutoEntrada < 60) {
				break;
			}

		}

		while (true) {

			System.out.println("Hora de Saida do Veiculo: ");
			horaSaida = leitor.nextInt();

			if (horaSaida >= 0 && horaSaida < 24) {
				break;
			}

		}

		while (true) {

			System.out.println("Minuto de Saida do Veiculo: ");
			minutoSaida = leitor.nextInt();

			if (minutoSaida >= 0 && minutoSaida < 60) {
				break;
			}
		}

		double tempoDePermanencia = (horaSaida - horaEntrada) * 60;

		tempoDePermanencia += (minutoSaida - minutoEntrada);

		int horasCobradas = (int) tempoDePermanencia / 60;

		if (tempoDePermanencia % 60 != 0) {
			horasCobradas++;
		}

		double precoTotal = 0;

		if (horasCobradas <= 1) {
			precoTotal = 4.0;
		} else if (horasCobradas > 1 && horasCobradas <= 2) {
			precoTotal = 6.0;
		} else {
			precoTotal = 6.0 + (1 * horasCobradas - 2);
		}

		
		int horasDePermanencia = (int)tempoDePermanencia/60;
		int minutosDePermanencia = (int)tempoDePermanencia % 60;
		
		System.out.println(horasDePermanencia+"h"+minutosDePermanencia+"m");
		System.out.println("Preço à Pagar: " + precoTotal);

		leitor.close();

	}

}
