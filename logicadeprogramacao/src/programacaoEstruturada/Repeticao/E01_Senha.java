package programacaoEstruturada.Repeticao;

import java.util.Scanner;

public class E01_Senha {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite sua senha: ");
		
		
		int contador=1;
		String senha = "",chaveDeAcesso = "shazan";
		
		while(contador<=3) {
			senha = leitor.nextLine();
			
			if(senha.equals(chaveDeAcesso)) {
				System.out.println("Bem vindo ao sistema");
				//return ;
			} else {
				System.out.println("senha incorreta"+(3-contador)+" tentativas");
			}
			
			contador++;
		}
		
		System.out.println("Procure a sua agência bancaria");
		
		leitor.close();

	}

}
