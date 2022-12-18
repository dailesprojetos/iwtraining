package programacaoEstruturada.ManipulacaoDeArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A01_ManipulacaoDeArquivos {

	public static void main(String[] args) {

		String endereco = "C:\\Curso-Java\\fileTXT\\arquivo.txt";
		// criarArquivo(endereco);
		//escreverArquivo(endereco);
		//lerArquivo(endereco);

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

	public static void escreverArquivo(String endereco) {

		File arquivo = new File(endereco);

		try {

			FileWriter escrevedor = new FileWriter(arquivo);
			escrevedor.write("Primeira Linha\n");
			escrevedor.write("Segunda Linha\n");
			escrevedor.write("Terceira Linha\n");

			escrevedor.close();

			System.out.println("Arquivo escrito com sucesso");

		} catch (IOException e) {

			System.out.println("Deu erro");
			e.printStackTrace();
		}

	}

	public static void lerArquivo(String endereco) {

		File arquivo = new File(endereco);

		try {
			
			Scanner leitor = new Scanner(arquivo);
			
			while (leitor.hasNextLine()) {
				
				String resultado = leitor.nextLine();
				System.out.println(resultado);
				
			}
			
			leitor.close();

		} catch (FileNotFoundException e) {
			System.out.println("Deu erro");
			e.printStackTrace();
		}

	}
	
	public static void name() {
		
	}

}
