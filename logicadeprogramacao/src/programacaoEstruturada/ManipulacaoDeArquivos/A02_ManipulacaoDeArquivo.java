package programacaoEstruturada.ManipulacaoDeArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A02_ManipulacaoDeArquivo {

	public static void main(String[] args) {
		
		String endereco = "C:\\Curso-Java\\fileTXT\\arquivo.txt";
		
		/*escreverArquivo(endereco, "melancia,1.25/n");
		escreverArquivo(endereco, "laranja,1.25/n");
		System.out.println(lerArquivo(endereco));*/
		
		String resultado = lerArquivo(endereco);
		String linha[] = resultado.split("\n");
		String produto[] = linha[1].split(",");
		System.out.println("nome: "+produto[0]+" preço: "+produto[1]);

	}
	
	public static void criarArquivo(String endereco) {

		File arquivo = new File(endereco);

		try {

			if (arquivo.createNewFile()) {

				System.out.println("arquivo criado com sucesso!");
			} else {
				System.out.println("o arquivo já existe");
			}

		} catch (IOException e) {

			System.out.println("Deu ruim");
			e.printStackTrace();

		}
	}

	//Ler arquivo passando o valor acumulado
	public static void escreverArquivo(String endereco, String texto) {

		String resposta = lerArquivo(endereco);
		
		File arquivo = new File(endereco);

		try {

			FileWriter escrevedor = new FileWriter(arquivo);
			
			escrevedor.write(resposta+texto);
			escrevedor.close();

			//System.out.println("Arquivo escrito com sucesso");

		} catch (IOException e) {

			System.out.println("Deu erro");
			e.printStackTrace();
		}

	}

	public static String lerArquivo(String endereco) {
		
		String resposta = "";

		File arquivo = new File(endereco);

		try {
			
			Scanner leitor = new Scanner(arquivo);
			
			while (leitor.hasNextLine()) {
				
				String linha = leitor.nextLine();
				resposta+=linha+"\n";
				
			}
			
			leitor.close();

		} catch (FileNotFoundException e) {
			System.out.println("Deu erro");
			e.printStackTrace();
		}
		
		return resposta;

	}

}
