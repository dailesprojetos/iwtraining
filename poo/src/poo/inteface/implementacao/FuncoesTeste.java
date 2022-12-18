package poo.inteface.implementacao;

public class FuncoesTeste {

	public static void main(String[] args) {
		
		Funcoes<Double> quadrado = x -> Math.pow(x, 2); 

		Funcoes<Double> cubo = x -> Math.pow(x, 3);
		
		Funcoes<Double> randomico = x -> (double) Math.round(Math.random()*x) + 1;
		
		Funcoes<Integer> ate = x -> { 
			int contador=0;
			while(contador<x) {
				System.out.println(contador);
				contador++ ;
			} 
			return contador;
		};
		
		System.out.println(implementa(quadrado,32));
		System.out.println(implementa(cubo,3));
		System.out.println(implementa(randomico,10));
		System.out.println(implementa(ate,100));
	}

	public static double implementa(Funcoes<Double> f, double a) {
		return f.funcao(a);
	}
	
	public static int implementa(Funcoes<Integer> f, int a) {
		return f.funcao(a);
	}
	
	

}
