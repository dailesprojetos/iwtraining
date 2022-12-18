package programacaoEstruturada.Repeticao;

public class ForMelhorado {

	public static void main(String[] args) {
		
		String pizza[] = {"pedaço1","pedaço2","pedaço3","pedaço4"};
		
		for(String pedaco : pizza) {
			System.out.println(pedaco);
		}
		
		System.out.println("===============================");
		
		for(int indice = 0; indice<pizza.length; indice++) {
			System.out.println(pizza[indice]);
		}
		
		System.out.println("=========Sala========");
		
		String sala[] = {"Joao","Maria","Francisco","Carlos","Antonio"};
		for(String aluno : sala) {
			System.out.println(aluno);
		}
		
		System.out.println("=======numero========");
		int numeros[] = {1,2,3,4,5};
		for(int numero : numeros)
		{
			System.out.println(Math.pow(numero,2));
		}

	}

}
