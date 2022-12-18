package poo.inteface.implementacao;

import java.util.Arrays;
import java.util.List;

public class EquacoesTeste {
	
	public static void main(String[] args) {
		
		Equacoes soma = (x,y) -> x + y;
		
		Equacoes subtracao = (x,y) -> x - y;

		
		System.out.println(executar(soma,30,50));
		System.out.println(executar(subtracao,30,50));
		
		System.out.println(executar((x,y)-> x % y,10,2));
		
		Integer numeros[] = {1,2,3,4,5};
		
		List<Integer> lista = Arrays.asList(numeros);
		
		lista.stream().map(numero -> Math.pow(numero, 2));
		
	}


	public static double executar(Equacoes e, double x, double y) {
	return e.funcao(x, y);
}

}
